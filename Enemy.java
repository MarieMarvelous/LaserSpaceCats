import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public abstract class Enemy extends Entity {
    private static final int ROAMING_RANGE = 100;

    private static final int DROP_CHANCE_MOUSE = 10;
    private static final int DROP_CHANCE_SQUIRREL = 15;
    private static final int DROP_CHANCE_RAT = 25;
    private static final int DROP_CHANCE_APE = 15;
    private static final int DROP_CHANCE_DINO = 25;

    private int shotTimer;
    public int health;
    public int maximalHealth;
    public int destinationX;
    public int destinationY;
    public boolean isMovingToDestination;
    public int currentBreak;
    public int framesToMove;

    public abstract int giveDamage();

    public void act (){
        super.act();
        checkForLaserCollision();
        countFrames();
    }    

    public Enemy(int health) {
        this.maximalHealth = health;
        this.health=health;
        this.isMovingToDestination = false;
        this.currentBreak = 0;
    }

    public void movement(int speed, int seeingRange) {
        if (!isMovingToDestination && currentBreak < 1) {
            if (canSeeCatHero(seeingRange)) {
                CatHero hero = WorldController.getCatHero();
                turnTowards(hero.getX(), hero.getY());
                destinationX = hero.getX();
                destinationY = hero.getY();
                isMovingToDestination = true;
                framesToMove = Greenfoot.getRandomNumber(100) + 100; // 100 - 200
            } else {
                setRandomDestination();
                turnTowards(destinationX, destinationY);
                isMovingToDestination = true;
                framesToMove = Greenfoot.getRandomNumber(25) + 75; // 75 - 100
            }
        } else if (currentBreak < 1 && framesToMove > 0) {
            tryMove(speed);
        } else {
            currentBreak--;
            framesToMove = 0;
        }
    }

    public void tryMove(int speed) {
        move(speed);
        if (getObjectsAtOffset(this.getX(), this.getY(), Artefact.class).isEmpty()) {
            move(-speed);
            isMovingToDestination = false;
            framesToMove = 0;
            currentBreak = Greenfoot.getRandomNumber(25) + 25; // 25 - 50
        } else {
            framesToMove--;
            currentBreak = 0;
        }
    }

    public void setRandomDestination() {
        int newX;
        int newY;
        do {
            newX = this.getX() + getNegativeRandom(ROAMING_RANGE);
            newY = this.getY() + getNegativeRandom(ROAMING_RANGE);
        }
        while (!isWayBlocked(this.getX(), this.getY(), newX, newY));
        destinationX = newX;
        destinationY = newY;
    }

    public int getNegativeRandom(int range) {
        return Greenfoot.getRandomNumber(2*range) - range;
    }

    public boolean canSeeCatHero(int seeingRange) {
        List<CatHero> catHeroInRange = getObjectsInRange(seeingRange, CatHero.class);
        if (catHeroInRange.isEmpty()) {
            return false;
        } else {
            CatHero hero = catHeroInRange.get(0);
            return !isWayBlocked(hero.getX(), hero.getY(), this.getX(), this.getY());
        }
    }

    public boolean isWayBlocked(int x1, int y1, int x2, int y2) {
        double anstiegGerade = ((x2-x1)*1.0) / ((y2-y1)*1.0);
        int currentX = x1;
        int currentY = y1;
        while (currentX != x2) {
            currentX = x1 < x2 ? ++currentX : --currentX;
            currentY += anstiegGerade;
            if (!getWorld().getObjectsAt(currentX, currentY, Artefact.class).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public void checkForLaserCollision() {
        if (isTouching(Laser.class)) {
            getWorld().removeObjects(getIntersectingObjects(Laser.class));
            health -= Math.round(Laser.DAMAGE * WorldController.getDamageMultiplier());
            if(health <= 0) {
                if(this instanceof BossMouse) {
                    Bosshealthbar bosshealthbar = getWorld().getObjects(Bosshealthbar.class).get(0);                    
                    getWorld().removeObject(bosshealthbar);
                    getWorld().addObject(new Glasses(), getX(), getY());
                }
                if(this instanceof BossDog ) {
                    Bosshealthbar bosshealthbar = getWorld().getObjects(Bosshealthbar.class).get(0);                    
                    getWorld().removeObject(bosshealthbar);
                    getWorld().addObject(new TinArmor(), getX(), getY());
                }
                if(this instanceof BossSlime) {
                    Bosshealthbar bosshealthbar = getWorld().getObjects(Bosshealthbar.class).get(0);                    
                    getWorld().removeObject(bosshealthbar);
                    getWorld().addObject(new SunGlasses(), getX(), getY());
                }
                if(this instanceof BossScientist) {
                    Bosshealthbar bosshealthbar = getWorld().getObjects(Bosshealthbar.class).get(0);                    
                    getWorld().removeObject(bosshealthbar);
                    getWorld().addObject(new Spacehelm(), getX(), getY());
                }
                if(this instanceof BossNapoleon) {
                    Bosshealthbar bosshealthbar = getWorld().getObjects(Bosshealthbar.class).get(0);                    
                    getWorld().removeObject(bosshealthbar);
                    getWorld().addObject(new Keycard(), getX(), getY());
                }
                if(this instanceof Mouse) {
                    dropHealingFish(DROP_CHANCE_MOUSE, this.getX(), this.getY());
                }
                if(this instanceof Squirrel) {
                    dropHealingFish(DROP_CHANCE_SQUIRREL, this.getX(), this.getY());
                }
                if(this instanceof Rat) {
                    dropHealingFish(DROP_CHANCE_RAT, this.getX(), this.getY());
                }
                if(this instanceof Ape) {
                    dropHealingFish(DROP_CHANCE_APE, this.getX(), this.getY());
                }
                if(this instanceof Dinosaur) {
                    dropHealingFish(DROP_CHANCE_DINO, this.getX(), this.getY());
                }

                getWorld().removeObject(this);
                CatWorld.registerKill();
            }
        }
    }

    private void dropHealingFish(int chance, int x, int y) {
        if (Greenfoot.getRandomNumber(100) < chance) {
            getWorld().addObject(new HealingFish(), x, y);
        }
    }

    public void randomMovement(int randomForward, int randomTurn, int turn) {
        CatHero cat = getWorld().getObjects(CatHero.class).get(0);
        int mf = Greenfoot.getRandomNumber(3) + 2;
        if (framesToCount == 0) {
            if (!getObjectsInRange(450, CatHero.class).isEmpty()) {
                if(Greenfoot.getRandomNumber(100) <= 90) {
                    turnTowards(cat.getX(), cat.getY());
                    move(mf);
                }
            } else if (Greenfoot.getRandomNumber(100) <= randomTurn) {
                turn(-Greenfoot.getRandomNumber(turn));
            } else if (Greenfoot.getRandomNumber(100) <= randomTurn) {
                turn(Greenfoot.getRandomNumber(turn));
            }
            move(randomForward);
        }
        if (isTouching(Artefact.class)) {
            move(-mf-1);
        }
    }

    public void updateBosshealthbar() {
        Bosshealthbar bosshealthbar  = (Bosshealthbar) getWorld().getObjects(Bosshealthbar.class).get(0);
        double percentageHealth = (health / (1.0 * maximalHealth)) + 0.02;
        int hearts = (int) Math.round(6.0 * percentageHealth);
        String imageName = hearts + "opponent.png";
        bosshealthbar.setImage(imageName);
    }

    public void runTowardsCatHero () {
        move(1);
        List<CatHero> catHeroes = getWorld().getObjects(CatHero.class);
        if (catHeroes.isEmpty()) {
            return; 
        }
        Actor catHero = catHeroes.get(0);
        turnTowards(catHero.getX(), catHero.getY()); 
    }

    public void shootBanana() { 
        if (shotTimer > 0 && --shotTimer > 0) return;
        Actor banana = new Banana(0);
        getWorld().addObject(banana, getX(), getY());
        banana.setRotation(getRotation()); 
        shotTimer = 50; //je höher desto langsamer kommen die Bananen
    }

    public boolean canSee(Class cls) {
        Actor actor = getOneObjectAtOffset(0, 0, cls);
        return actor != null;        
    }

    public void itemDrop(EnemyType BossType, int x, int y) {
        switch(BossType) {
            case BOSSMOUSE:
            getWorld().addObject(new Glasses(), x, y); 
            break;
            default:
            break;   
        }      
    }

    /*public void checkForCatCollision() {
    if (isTouching(CatHero.class) && framesToCount == 0) {
    CatHero catHero = getWorld().getObjects(CatHero.class).get(0);
    turnTowards(catHero.getX(), catHero.getY());
    }
    } */

    /* if (catHero.isMoved == false) {
    //System.out.println("isTouching(CatHero) = ");
    catHero.checkCollision(); 
    System.out.println("CatHero.isMoved = " + catHero.isMoved);
    }
    if (catHero.isMoved == false) {
    catHero.checkCollision(); 
    }
    startFrameCounting(30);

    move(-60);
    }*/

    // ab "if (catHero.isMoved == false) {" wieder auskommentieren!

    public void drawBack() {
        CatHero catHero = getWorld().getObjects(CatHero.class).get(0);
        turnTowards(catHero.getX(), catHero.getY());
        startFrameCounting(30);
        move(-5);
    }

    /*public void shootCatHero() {
    if (canSee (CatHero.class))  //läuft los wenn Ape CatHero sieht. Object in Range?
    {
    getWorld().addObject(new Banana(80), this.getX(), this.getY()); 
    }
    }*/
}
