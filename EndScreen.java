import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse EndScreen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class EndScreen extends CatWorld
{

    /**
     * Konstruktor für Objekte der Klasse EndScreen
     * 
     */
    public EndScreen()
    {
    }
    
    public void act() {
        Greenfoot.delay(250);
        WorldController.switchToNextWorld(this);
    }
}