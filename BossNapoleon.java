import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossNapoleon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossNapoleon extends Enemy {
        int laser1 = 90;
        int laser2 = 180;
        int laser3 = 270;
        int laser4 = 0;
        int laser5 = 135;
        int laser6 = 225;
        int laser7 = 315;
        int laser8 = 45;
    public BossNapoleon() {
        damage = 15;
        tempDamage = damage;
    }
    public int giveDamage() {
        return damage;
    }
    public void act() 
    {
        // movement(5, 3, 8);
        //randomMovement(12, 2, 6);
        //super.act();
        //kreuzdrehungrechts();
        //kreuzdrehunglinks();
        xkreuz();
    }
    public void xkreuz(){
        shootLaser(laser5); 
        shootLaser(laser6);
        shootLaser(laser7);
        shootLaser(laser8);
    }
    public void kreuzdrehungrechts(){
        shootLaser(laser1); 
        shootLaser(laser2);
        shootLaser(laser3);
        shootLaser(laser4);
        laser1++;
        laser2++;
        laser3++;
        laser4++;
    }
    public void kreuzdrehunglinks(){
        shootLaser(laser1); 
        shootLaser(laser2);
        shootLaser(laser3);
        shootLaser(laser4);
        laser1--;
        laser2--;
        laser3--;
        laser4--;
    }
    public void shootLaser(int angle) 
    {
        getWorld().addObject(new Laser(angle), this.getX(), this.getY());
    }   
}
