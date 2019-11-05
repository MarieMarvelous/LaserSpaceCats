import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.Point;

public class Hero extends Actor {
    public int health;
    public boolean canShootAgain;
    public int cooldown;
    public static int defaultCooldown;
    public boolean isMoved;
    
    
    public Hero(int health) {
        this.health=health;
        this.canShootAgain = true;
        this.defaultCooldown = 10;
        this.cooldown = this.defaultCooldown;
        this.isMoved = false;
    }
    
     public void movement(String left, String right, String up, String down, int speed) {
        if(Greenfoot.isKeyDown(left)) {
            setLocation(getX()-speed, getY());
            if (isTouching(Artefact.class)) {
                setLocation(getX()+speed, getY());
            }
            isMoved = true;
        }
        if(Greenfoot.isKeyDown(right)) {
            setLocation(getX()+speed, getY());
            if (isTouching(Artefact.class)) {
                setLocation(getX()-speed, getY());
            }
            isMoved = true;
        }
        if(Greenfoot.isKeyDown(up)) {
            setLocation(getX(), getY()-speed);
            if (isTouching(Artefact.class)) {
                setLocation(getX(), getY()+speed);
            }
            isMoved = true;
        }
        if(Greenfoot.isKeyDown(down)) {
            setLocation(getX(), getY()+speed);
            if (isTouching(Artefact.class)) {
                setLocation(getX(), getY()-speed);
            }
            isMoved = true;
        }
        checkForShooting();
    }
    
    public void act() {
        isMoved = false;
        if (cooldown > 0) {
            cooldown--;
        } else {
            cooldown = this.defaultCooldown;
            canShootAgain = true;
        }
    } 
    
    public void checkCollision(){
        if(isTouching(Enemy.class)){
            List<Enemy> listDamagingEnemy=getIntersectingObjects(Enemy.class);
            for(Enemy enemy : listDamagingEnemy){
                health-=enemy.giveDamage();
                enemy.drawBack();
            }
        }
        String leben = String.valueOf(health);
        getWorld().showText(leben, 100, 100);
        if(health <= 0){
            Greenfoot.stop();
            getWorld().showText("Game Over", 400, 225);
        }
    }
    public void shootLaser(int angle) {
        if (canShootAgain) {
            getWorld().addObject(new Laser(angle), this.getX(), this.getY());
            canShootAgain = false;
        }
    }    
    public void checkForShooting() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null && Greenfoot.getMouseInfo().getButton() == 1) {
            shootLaser(getMouseDirection(mouse));
        }
    }    
    public int getMouseDirection(MouseInfo mouse) {
        double deltaX = mouse.getX() - this.getX();
        double deltaY = mouse.getY() - this.getY();
        
        return 90 - (int) (Math.atan2(deltaX, deltaY) * 57.3);
    }
}
