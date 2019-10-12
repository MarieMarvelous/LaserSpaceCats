import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public abstract class Enemy extends Entity {
    public abstract int giveDamage();
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
    
    public void movement(int zufallVorwaerts, int zufallDrehung, int drehung) {
        move(Greenfoot.getRandomNumber(zufallVorwaerts));
        if(Greenfoot.getRandomNumber(10) <=zufallDrehung){
            turn(-drehung);
        }
        if(Greenfoot.getRandomNumber(10) >zufallDrehung){
            turn(drehung);
        }
    }
}
