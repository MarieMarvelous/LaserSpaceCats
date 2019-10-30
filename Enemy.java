import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public abstract class Enemy extends Entity {
    public abstract int giveDamage();
    private int shotTimer;
    public void act (){
        super.act();
        checkForLaserCollision();
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
    
    public void randomMovement(int randomForward, int randomTurn, int turn) {
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
    
    /*public void shootCatHero() {
        if (canSee (CatHero.class))  //läuft los wenn Ape CatHero sieht. Object in Range?
        {
            getWorld().addObject(new Banana(80), this.getX(), this.getY()); 
        }
    }*/
}
