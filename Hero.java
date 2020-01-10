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
    public double damageMultiplier;

    public Hero(int health) {
        this.maximalHealth = health;
        this.health=health;
        this.canShootAgain = true;
        this.defaultCooldown = 10;
        this.cooldown = this.defaultCooldown;
        this.isMoved = false;
        this.damageMultiplier = 1.0;
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
        updateHealthbar();
        getWorld().setPaintOrder(Healthbar.class);
        if(Greenfoot.isKeyDown("escape")){
            Greenfoot.stop();
        }
        if(Greenfoot.isKeyDown("r")){
            Greenfoot.start();
        }
    } 

    public void checkCollision(){
        if(isTouching(Enemy.class)){
            List<Enemy> listDamagingEnemy=getIntersectingObjects(Enemy.class);
            for(Enemy enemy : listDamagingEnemy){
                if(enemy.framesToCount == 0) {
                    health-=enemy.giveDamage();
                    enemy.drawBack();
                }
            }
        }
        String leben = String.valueOf(health);
        if(health <= 0){
            YouDied overlay = new YouDied();
            overlay.setTransparency(0);
            WorldController.addActorToCurrentWorld(overlay, 800, 400);
            while (overlay.getTransparency() < 255) {
                int currentTransparency = overlay.getTransparency();
                overlay.setTransparency(++currentTransparency);
                Greenfoot.delay(1);
            }
            Greenfoot.delay(500);
            WorldController.switchToNextWorld(new CatWorld());
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
        if (mouse != null && mouse.getButton() == 1) {
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

    public void increaseMaximumHealth(int delta) {
        this.maximalHealth += delta;
        this.health = this.maximalHealth; //Full Heal for the sake of the level Up!
    }

    public void increaseDamageMultiplier(double delta) {
        this.damageMultiplier += delta;
    }
}
