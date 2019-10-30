import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mouse extends Enemy {
    public Mouse() {
        resizeImage(30, 30);
    }    
    
    public int giveDamage (){
        return 2;
    }
    
    public void act() {
        randomMovement(5, 4, 10);
        super.act();
    }
    public void Hitbox() {
        if (this.isTouching(Mouse.class)) {
            setLocation(getX()-10,getY());
        }
        if (this.isTouching(Mouse.class)) {
            setLocation(getX()+10,getY());
        }
        if (this.isTouching(Mouse.class)) {
            setLocation(getX()+10,getY());
        }
        if (this.isTouching(Mouse.class)) {
            setLocation(getX()-10,getY());
        }
        if (this.isTouching(Mouse.class)) {
            setLocation(getX(),getY()-10);
        }
        if (this.isTouching(Mouse.class)) {
            setLocation(getX(),getY()+10);
        }
        if (this.isTouching(Mouse.class)) {
            setLocation(getX(),getY()+10);
        }
        if (this.isTouching(Mouse.class)) {
            setLocation(getX(),getY()-10);
        }
    }
}
