import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public abstract class Enemy extends Entity {
    private int shotTimer;
    public int health;
    public int maximalHealth;

    public abstract int giveDamage();

    public void act (){
        super.act();
        checkForLaserCollision();
        //checkForCatCollision();
        countFrames();
    }    

    public Enemy(int health) {
        this.maximalHealth = health;
        this.health=health;
    }

    public void checkForLaserCollision() {
        if (isTouching(Laser.class)) {
            getWorld().removeObjects(getIntersectingObjects(Laser.class));
            health -= Laser.DAMAGE;
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

                getWorld().removeObject(this);
                CatWorld.registerKill();
            }
        }
    }

    public void resizeImage(int width, int height) {
        GreenfootImage image =getImage();
        image.scale(width, height);
        setImage(image);
    } 

    public void randomMovement(int randomForward, int randomTurn, int turn) {
        CatHero cat = getWorld().getObjects(CatHero.class).get(0);
        int mf = Greenfoot.getRandomNumber(10);
        if (framesToCount == 0) {
            if (!getObjectsInRange(450, CatHero.class).isEmpty()) {
                if(Greenfoot.getRandomNumber(100) <= 90) {
                    turnTowards(cat.getX(), cat.getY());
                    move(mf);
                }
            } else {
                if(Greenfoot.getRandomNumber(100) <= randomTurn) {
                    turn(-  Greenfoot.getRandomNumber(turn));
                } else {
                    if (Greenfoot.getRandomNumber(100) <= randomTurn) {
                        turn(Greenfoot.getRandomNumber(turn));
                    }
                }
                move(randomForward);
            }
            if (isTouching(Artefact.class)) {
                move(-mf-1);
            }
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
    }

    // ab "if (catHero.isMoved == false) {" wieder auskommentieren!

    public void drawBack() {
    CatHero catHero = getWorld().getObjects(CatHero.class).get(0);
    turnTowards(catHero.getX(), catHero.getY());
    startFrameCounting(30);
    move(-5);
    }

    public void shootCatHero() {
    if (canSee (CatHero.class))  //läuft los wenn Ape CatHero sieht. Object in Range?
    {
    getWorld().addObject(new Banana(80), this.getX(), this.getY()); 
    }
    }*/
}
