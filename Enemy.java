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
    public int seeingRange;

    public abstract int giveDamage();

    public void act (){
        super.act();
        checkForLaserCollision();
        countFrames();
    }    

    public Enemy(int health) {
        this.maximalHealth = health;
        this.health=health;
    }

    public void tryMove(int speed) {
        move(speed);
        List<Artefact> objectsAtOffset = getIntersectingObjects(Artefact.class);
        if (!objectsAtOffset.isEmpty()) {
            move(-speed);
        }
    }

    public boolean canSeeCatHero(int seeingRange) {
        List<CatHero> catHeroInRange = getObjectsInRange(seeingRange, CatHero.class);
        if (catHeroInRange.isEmpty()) {
            return false;
        } else {
            CatHero hero = catHeroInRange.get(0);
            boolean wayFree = !isWayBlocked(hero.getX(), hero.getY(), this.getX(), this.getY());
            return wayFree;
        }
    }

    public boolean isWayBlocked(int x1, int y1, int x2, int y2) {
        double anstiegGerade = ((y2-y1)*1.0) / ((x2-x1)*1.0);
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
                    getWorld().removeObject(getWorld().getObjects(Bosshealthbar.class).get(0));
                    getWorld().addObject(new Glasses(), getX(), getY());
                }
                if(this instanceof BossDog ) {
                    getWorld().removeObject(getWorld().getObjects(Bosshealthbar.class).get(0));
                    getWorld().addObject(new TinArmor(), getX(), getY());
                }
                if(this instanceof BossSlime) {                  
                    getWorld().removeObject(getWorld().getObjects(Bosshealthbar.class).get(0));
                    getWorld().addObject(new SunGlasses(), getX(), getY());
                }
                if(this instanceof BossScientist) {                
                    getWorld().removeObject(getWorld().getObjects(Bosshealthbar.class).get(0));
                    getWorld().addObject(new Spacehelm(), getX(), getY());
                }
                if(this instanceof BossNapoleon) {                  
                    getWorld().removeObject(getWorld().getObjects(Bosshealthbar.class).get(0));
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
            if (canSeeCatHero(this.seeingRange != 0 ? this.seeingRange : 600)) {
                if(Greenfoot.getRandomNumber(100) <= 90) {
                    turnTowards(cat.getX(), cat.getY());
                    tryMove(mf);
                }
            } else if (Greenfoot.getRandomNumber(100) <= randomTurn) {
                turn(-Greenfoot.getRandomNumber(turn));
            } else if (Greenfoot.getRandomNumber(100) <= randomTurn) {
                turn(Greenfoot.getRandomNumber(turn));
            }
            tryMove(randomForward);
        }
    }

    public void updateBosshealthbar() {
        Bosshealthbar bosshealthbar  = (Bosshealthbar) getWorld().getObjects(Bosshealthbar.class).get(0);
        double percentageHealth = (health / (1.0 * maximalHealth)) + 0.02;
        int hearts = (int) Math.round(6.0 * percentageHealth);
        String imageName = hearts + "opponent.png";
        bosshealthbar.setImage(imageName);
    }

    public void drawBack() {
        tryMove(-5);
        startFrameCounting(30);
    }
}
