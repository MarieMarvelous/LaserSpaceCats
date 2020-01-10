import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse YouDied.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class YouDied extends HUD
{
    /**
     * Act - tut, was auch immer YouDied tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        // Ergänzen Sie Ihren Quelltext hier...
    } 

    public YouDied() {
        resizeImage(1600, 800);
    }

    public void setTransparency(int newTransparency) {
        getImage().setTransparency(newTransparency);
    }

    public int getTransparency() {
        return getImage().getTransparency();
    }  
}