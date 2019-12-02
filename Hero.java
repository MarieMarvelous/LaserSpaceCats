import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.Point;

public class Hero extends Actor {
    public int maximalHealth;
    public int health;
    public boolean canShootAgain;
    public int cooldown;
    public static int defaultCooldown;
    public boolean isMoved;
    
    public Hero(int health) {
        this.maximalHealth = 100;
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
            
            Actor CatHero = (Actor)getWorld().getObjects(CatHero.class).get(0);
            setLocation(CatHero.getX(), CatHero.getY());
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
        updateHealthbar();
        getWorld().setPaintOrder(Healthbar.class);
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
            Greenfoot.playSound("lasersound3.mp3");
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
    

    public void updateHealthbar()
    {
        Healthbar healthbar  = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
        double percentageHealth = (health / (1.0 * maximalHealth)) + 0.02;
        int hearts = (int) Math.round(20.0 * percentageHealth);
        String imageName = hearts + "hearts.png";
        healthbar.setImage(imageName);


    }
}
