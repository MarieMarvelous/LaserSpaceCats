import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CatHero extends Hero {
    public static final int SPEED=5;

    // Hierrüber wird der Kater beim Laufen animiert
    private final GreenfootImage imagef1;
    private final GreenfootImage imagef2;    
    private final GreenfootImage imagef3;
    private final GreenfootImage imagef4;

    public CatHero() {
        super(100);
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
