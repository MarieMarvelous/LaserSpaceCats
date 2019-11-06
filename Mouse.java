import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mouse extends Enemy {
    public Mouse() {
        resizeImage(30, 30);
        damage = 2;
        tempDamage = damage;
    }    
    
    public int giveDamage (){
        return damage;
    }
    
    public void act() {
        randomMovement(5, 4, 10);
        super.act();
        if (Greenfoot.isKeyDown("r")) {
            CatHero catHero = getWorld().getObjects(CatHero.class).get(0);
            turnTowards(catHero.getX(), catHero.getY());
        }
    }
    
}
