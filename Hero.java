import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor {
    public int health;
    //public boolean canShootAgain;
    //public int cooldown;
    //public static int defaultCooldown;
    
    
    public Hero(int health) {
        this.health=health;
        //this.canShootAgain = true;
        //this.defaultCooldown = 10;
        //this.cooldown = this.defaultCooldown;
    }
    
     public void movement(String left, String right, String up, String down, int speed) {
        if(Greenfoot.isKeyDown(left)) {
            move(-speed);
        }
        if(Greenfoot.isKeyDown(right)) {
            move(speed);
        }
        if(Greenfoot.isKeyDown(up)) {
            setLocation(getX(), getY()-speed);
        }
        if(Greenfoot.isKeyDown(down)) {
            setLocation(getX(), getY()+speed);   
        }
        //checkForShooting();
    }
    
    /*public void checkCollision(){
        if(isTouching(Enemie.class)){
            List<Enemie> listDamagingEnemie=getIntersectingObjects(Enemie.class);
            for(Enemie enemie : listDamagingEnemie){
                health-=enemie.giveDamage();
            }
        }
    }  */ 
}
