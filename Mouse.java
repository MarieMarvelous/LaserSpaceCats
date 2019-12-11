import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mouse extends Enemy {
    public Mouse() {
        resizeImage(20, 20);
        damage = 2;
        tempDamage = damage;
    }    
    
    public int giveDamage (){
        return damage;
    }
    
    public void act() {
        randomMovement(2, 50, 2);
        super.act();

    }
    
}
