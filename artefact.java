import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class artefact here.
 * Hier sollen Objekte wie Tische, Stühle, etc. eingefügt werden, hinter denen man sich 
 * verstecken kann und die Laser abprallen bzw. despawnen 
 * @author (Leandra) 
 * @version (16.10)
 */
public class artefact extends Entity
{
    /**
     * Act - do whatever the artefact wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void checkForLaserCollision() {
        if (isTouching(Laser.class)) {
            getWorld().removeObjects(getIntersectingObjects(Laser.class));
            getWorld().removeObject(this);
        }
    }
    
    public void resizeImage(int width, int height) {
        GreenfootImage image =getImage();
        image.scale(width, height);
        setImage(image);
    } 
      
}
