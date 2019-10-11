import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mouse extends Enemy {
    public Mouse() {
        resizeImage(30, 30);
    }    
    
    public int giveDamage (){
        return 2;
    }
    
    public void act() {
        move(Greenfoot.getRandomNumber(5));
        if(Greenfoot.getRandomNumber(10) <=4){
            turn(-10);
        }
        if(Greenfoot.getRandomNumber(10) >4){
            turn(10);
        }
        super.act();
    }    
}
