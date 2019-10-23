import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CatHero extends Hero {
    public static final int SPEED=5;
    
    // Hierrüber wird der Kater beim Laufen animiert
    private GreenfootImage imagef1;
    private GreenfootImage imagef2;    
    private GreenfootImage imagef3;
    private GreenfootImage imagef4;
       
    public CatHero() {
        super(1);
 
        imagef1 = new GreenfootImage("Cat-f-1.png"); 
        imagef2 = new GreenfootImage("Cat-f-2.png");
        imagef3 = new GreenfootImage("Cat-f-3.png");
        imagef4 = new GreenfootImage("Cat-f-4.png");
        setImage(imagef1);
       
    }     
    public void act() {
        super.act();
        super.movement("a", "d", "w", "s", SPEED);
        super.checkCollision();
        
    }    
        
        if (getImage() == imagef1) {
            setImage(imagef2);
        }
        else {
            if (getImage() == imagef4) {
                setImage(imagef4);
            }
            else {
                setImage(imagef4);
            }
        }
    } 
    
   
    
        
        if (getImage() == imagef1) {
            setImage(imagef2);
        }
        else {
            if (getImage() == imagef4) {
                setImage(imagef4);
            }
            else {
                setImage(imagef4);
            }
        }
    } 
    
   
    
}
