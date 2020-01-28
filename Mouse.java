import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mouse extends Enemy {
    public Mouse() {
        super(2);
        resizeImage(20, 20);
        damage = 2;
        tempDamage = damage;
        seeingRange = 750;
    }    
    
    public int giveDamage (){
        return damage;
    }
    
    public void act() {
        randomMovement(1, 5, 45);
        super.act();

    }
    
}
