import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog extends Gardenpieces
{
    private int counter;

    public Dog() {
        resizeImage(20, 20);
        counter = 340;
    }

    /**
     * Act - do whatever the Dog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() { // 45 zur seite und 25 runter, dann 45 zur seite und 25 hoch. Pause: 50
        if (0 < counter && counter <= 45) {
            this.setLocation(getX() + 1, getY());
        }
        if (50 < counter && counter <= 65) {
            this.turn(6);
        }
        if (95 < counter && counter <= 120) {
            this.setLocation(getX(), getY() + 1);
        }
        if (125 < counter && counter <= 140) {
            this.turn(6);
        }
        if (170 < counter && counter <= 215) {
            this.setLocation(getX() - 1, getY());
        }
        if (220 < counter && counter <= 235) {
            this.turn(6);
        }
        if (265 < counter && counter <= 290) {
            this.setLocation(getX(), getY() - 1);
        }
        if (295 < counter && counter <= 310) {
            this.turn(6);
        }
        if (counter >= 340) {
            counter = 0;
        }
        counter++;
    }    
}
