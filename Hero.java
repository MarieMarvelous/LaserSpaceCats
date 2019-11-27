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
        switch(health){
        case 100:
            Healthbar healthbar20 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar20.setImage("20hearts.png");
            break;   
        case 95:
            
            Healthbar healthbar19 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar19.setImage("19hearts.png");
            break;
        case 90:
            Healthbar healthbar18 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar18.setImage("18hearts.png");
            break;
        case 85:
            Healthbar healthbar17 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar17.setImage("17hearts.png");
            break;
        case 80:
            Healthbar healthbar16 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar16.setImage("16hearts.png");
            break; 
        case 75:
            Healthbar healthbar15 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar15.setImage("15hearts.png");
            break;
        case 70:
            Healthbar healthbar14 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar14.setImage("14hearts.png");
            break;
        case 65:
            Healthbar healthbar13 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar13.setImage("13hearts.png");
            break;
        case 60:
            Healthbar healthbar12 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar12.setImage("12hearts.png");
            break;     
        case 55:
            Healthbar healthbar11 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar11.setImage("11hearts.png");
            break;
        case 50:
            Healthbar healthbar10 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar10.setImage("10hearts.png");
            break;
            
        case 45:
            Healthbar healthbar9 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar9.setImage("9hearts.png");
            break;
        case 400:
            Healthbar healthbar8 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar8.setImage("8hearts.png");
            break;
        case 35:
            Healthbar healthbar7 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar7.setImage("7hearts.png");
            break;
        case 30:
            Healthbar healthbar6 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar6.setImage("6hearts.png");
            break;
        case 250:
            Healthbar healthbar5 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar5.setImage("5hearts.png");
            break;
        case 20:
            Healthbar healthbar4 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar4.setImage("4hearts.png");
            break;
        case 15:
            Healthbar healthbar3 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar3.setImage("3hearts.png");
            break;
        case 10:
            Healthbar healthbar2 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar2.setImage("2hearts.png");
            break;
        case 5:
            Healthbar healthbar1 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar1.setImage("1hearts.png");
            break;
        case 2: //ist auf 1 und nicht auf 0 da wenn auf 0 dann game over bevor herzen auf null
            Healthbar healthbar0 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar0.setImage("0hearts.png");
            break;
        case 1: //ist auf 1 und nicht auf 0 da wenn auf 0 dann game over bevor herzen auf null
            Healthbar healthbar21 = (Healthbar) getWorld().getObjects(Healthbar.class).get(0);
            healthbar21.setImage("0hearts.png");
            break;    
        }

    }
}
