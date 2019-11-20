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
        
        int laser9 = 22;
        int laser10 = 45;
        int laser11 = 67;
        int laser12 = 90; 
        int laser13 = 112;
        int laser14 = 135;
        int laser15 = 157;
        int laser16 = 180;
        int laser17 = 202;
        int laser18 = 225;
        int laser19 = 247;
        int laser20 = 270;
        int laser21 = 292;
        int laser22 = 315;
        int laser23 = 337;
        int laser24 = 360;
       
        public int cooldown;
        public static int defaultCooldown;
    public BossNapoleon() {
        damage = 1;
        health = 10;
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
        //xkreuz();
        //kreis();
    }
    public void kreis(){
        shootLaser(laser9); 
        shootLaser(laser10);
        shootLaser(laser11);
        shootLaser(laser12);
        shootLaser(laser13); 
        shootLaser(laser14);
        shootLaser(laser15);
        shootLaser(laser16);
        shootLaser(laser17); 
        shootLaser(laser18);
        shootLaser(laser19);
        shootLaser(laser20);
        shootLaser(laser21); 
        shootLaser(laser22);
        shootLaser(laser23);
        shootLaser(laser24);
        
        
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
        shootLaser(laser5); 
        shootLaser(laser6);
        shootLaser(laser7);
        shootLaser(laser8);
        laser5++;
        laser6++;
        laser7++;
        laser8++;
    }
    public void shootLaser(int angle) 
    {
        getWorld().addObject(new Banana(angle), this.getX(), this.getY());
    }   
}
