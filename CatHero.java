import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CatHero extends Hero {
    public static final int SPEED=5;

    // Hierrüber wird der Kater beim Laufen animiert
    private final GreenfootImage imagef1;
    private final GreenfootImage imagef2;    
    private final GreenfootImage imagef3;
    private final GreenfootImage imagef4;
    private final GreenfootImage imagef5;
    private final GreenfootImage imagef6;
    private final GreenfootImage imagef7;
    private final GreenfootImage imagef8;
    private final GreenfootImage imagef9;
    private final GreenfootImage imagef10;
    private final GreenfootImage imagef11;
    private final GreenfootImage imagef12;

    public CatHero() {
        super(100);
        //Level 1
        imagef1 = new GreenfootImage("Cat-f-1.png"); 
        imagef2 = new GreenfootImage("Cat-f-2.png");
        imagef3 = new GreenfootImage("Cat-f-3.png");
        imagef4 = new GreenfootImage("Cat-f-4.png");
        //Level 2
        imagef5 = new GreenfootImage("catherobrille1.png");
        imagef6 = new GreenfootImage("catherobrille2.png");
        //Level 3
        imagef7 = new GreenfootImage("catheroarmor1.png");
        imagef8 = new GreenfootImage("catheroarmor2.png");
        //Level 4
        imagef9 = new GreenfootImage("catherosonnenbrille1.png");
        imagef10 = new GreenfootImage("catherosonnenbrille2.png");
        // Level 5
        imagef11 = new GreenfootImage("catherospace1.png");
        imagef12 = new GreenfootImage("catherospace1.png");
        
        
        setImage(imagef1);
    }     

    public void act() {
        super.act();
        super.movement("a", "d", "w", "s", SPEED);
        super.checkCollision();         

        GreenfootImage current = getImage();

        if (current == imagef1) {
            setImage(imagef2);
        } else if (current == imagef2) {
            setImage(imagef3);
        } else if (current == imagef3) {
            setImage(imagef4);
        } else {
            setImage(imagef1);
        }
    }

}
