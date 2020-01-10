import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

public class CatHero extends Hero {
    public static final int SPEED=5;
    public static final int ANIMATION_SPEED = 4; //the more the slower is the speed
    public int countdownForNextFrame;
    public int currentFrame;
    
    List<GreenfootImage> currentAnimation = new ArrayList<>();

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
        countdownForNextFrame = ANIMATION_SPEED;
        currentFrame = 0;
    }     

    public void act() {
        super.act();
        super.movement("a", "d", "w", "s", SPEED);
        super.checkCollision();

        GreenfootImage current = getImage();
        
        World currentWorldType = WorldController.getCurrentWorld();
        
        if (countdownForNextFrame == 0) {
            if (currentWorldType instanceof House) {
                currentAnimation.clear();
                currentAnimation.add(imagef1);
                currentAnimation.add(imagef2);
                currentAnimation.add(imagef3);
                currentAnimation.add(imagef4);
            }
            if (currentWorldType instanceof Garden) {
                currentAnimation.clear();
                currentAnimation.add(imagef5);
                currentAnimation.add(imagef6);
                currentAnimation.add(imagef5);
                currentAnimation.add(imagef6);
            }
            if (currentWorldType instanceof Sewers) {
                currentAnimation.clear();
                currentAnimation.add(imagef7);
                currentAnimation.add(imagef8);
                currentAnimation.add(imagef7);
                currentAnimation.add(imagef8);
            }
            if (currentWorldType instanceof GuianaSpaceCenter) {
                currentAnimation.clear();
                currentAnimation.add(imagef9);
                currentAnimation.add(imagef10);
                currentAnimation.add(imagef9);
                currentAnimation.add(imagef10);
            }
            if (currentWorldType instanceof Moon) {
                currentAnimation.clear();
                currentAnimation.add(imagef11);
                currentAnimation.add(imagef12);
                currentAnimation.add(imagef11);
                currentAnimation.add(imagef12);
            }
            if (currentFrame == 4) {
                currentFrame = 0;
            }
            this.setImage(currentAnimation.get(currentFrame++));
            countdownForNextFrame = ANIMATION_SPEED;
        } else {
            countdownForNextFrame--;
        }
        
    }

}
