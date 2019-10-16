import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Enemy extends Entity {

    public abstract int giveDamage();
    public boolean canDealDamage = true;

    public void act () {        
        if (canDealDamage) {
            checkForCatCollision(drawback, drawbackFrames);
        }
        checkForLaserCollision();        
        countFrames();
        super.act();
    }    

    public void checkForLaserCollision() {
        if (isTouching(Laser.class)) {
            getWorld().removeObjects(getIntersectingObjects(Laser.class));
            getWorld().removeObject(this);
            CatWorld.registerKill();
        }
    }

    public void checkForCatCollision(int drawback, int drawbackFrames) {
        if (frameCounter == 0) {
            CatHero catHero = getWorld().getObjects(CatHero.class).get(0);
            if (isTouching(CatHero.class) && canDealDamage) {
                catHero.checkCollision();
                canDealDamage = false;
                move(-drawback);                
                startFrameCounting(drawbackFrames);                
            }
        }
    }

    public void resizeImage(int width, int height) {
        GreenfootImage image =getImage();
        image.scale(width, height);
        setImage(image);
    } 

    public void movement(int zufallVorwaerts, int zufallDrehung, int drehung) {
        if (frameCounter == 0) {
            move(Greenfoot.getRandomNumber(zufallVorwaerts));
            if(Greenfoot.getRandomNumber(10) <=zufallDrehung){
                turn(-drehung);
            }
            if(Greenfoot.getRandomNumber(10) >zufallDrehung){
                turn(drehung);
            }
            canDealDamage = true;
        }
    }

    

}
