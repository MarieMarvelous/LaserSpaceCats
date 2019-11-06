import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Enemy extends Entity {
    public abstract int giveDamage();
    private int shotTimer;
    public void act (){
        super.act();
        checkForLaserCollision();
        //checkForCatCollision();
        countFrames();       
    }    

    public Enemy() {
    }

    public void checkForLaserCollision() {
        if (isTouching(Laser.class)) {
            getWorld().removeObjects(getIntersectingObjects(Laser.class));
            getWorld().removeObject(this);
            CatWorld.registerKill();
        }
    }

    public void resizeImage(int width, int height) {
        GreenfootImage image =getImage();
        image.scale(width, height);
        setImage(image);
    } 

    public void Hitbox() {
        if (this.isTouching(Enemy.class)) {
            setLocation(getX()-10,getY());
        }
        if (this.isTouching(Enemy.class)) {
            setLocation(getX()+10,getY());
        }
        if (this.isTouching(Enemy.class)) {
            setLocation(getX()+10,getY());
        }
        if (this.isTouching(Enemy.class)) {
            setLocation(getX()-10,getY());
        }
        if (this.isTouching(Enemy.class)) {
            setLocation(getX(),getY()-10);
        }
        if (this.isTouching(Enemy.class)) {
            setLocation(getX(),getY()+10);
        }
        if (this.isTouching(Enemy.class)) {
            setLocation(getX(),getY()+10);
        }
        if (this.isTouching(Enemy.class)) {
            setLocation(getX(),getY()-10);
        }
    }

    public void randomMovement(int randomForward, int randomTurn, int turn) {
        if (framesToCount == 0) {
        CatHero cat = getWorld().getObjects(CatHero.class).get(0);
        if(Greenfoot.getRandomNumber(100) < 10) {
            turnTowards(cat.getX(), cat.getY());
        }
        move(Greenfoot.getRandomNumber(10));
        if(Greenfoot.getRandomNumber(10) <=randomTurn) {
            turn(-turn);
        }
        if(Greenfoot.getRandomNumber(10) >=randomTurn) {
            turn(turn);
        }
        if (isTouching(Artefact.class)) {
            move(-randomForward);
        }
    }
    }  

    public void runTowardsCatHero () {
        move(3);
        if (getWorld().getObjects(CatHero.class).isEmpty()) return; 
        Actor CatHero = (Actor)getWorld().getObjects(CatHero.class).get(0);
        turnTowards(CatHero.getX(), CatHero.getY()); 
    }

    public void shootBanana() { 
        if (shotTimer > 0 && --shotTimer > 0) return;
        Actor banana = new Banana(0);
        getWorld().addObject(banana, getX(), getY());
        banana.setRotation(getRotation()); 
        shotTimer = 50; //je höher desto langsamer kommen die Bananen
    }

    public boolean canSee(Class clss) {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }

    /* public void checkForCatCollision() {
        if (isTouching(CatHero.class) && framesToCount == 0) {
            CatHero catHero = getWorld().getObjects(CatHero.class).get(0);
            turnTowards(catHero.getX(), catHero.getY());
            System.out.println("CatHero.isMoved = " + catHero.isMoved);
        }
    } */

    /*if (catHero.isMoved == false) {
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
        move(-60);
    }

    /*public void shootCatHero() {
    if (canSee (CatHero.class))  //läuft los wenn Ape CatHero sieht. Object in Range?
    {
    getWorld().addObject(new Banana(80), this.getX(), this.getY()); 
    }
    }*/
}
