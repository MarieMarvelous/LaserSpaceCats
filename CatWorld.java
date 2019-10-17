import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the parent World class. All other levels inherit from this one.
 */
public class CatWorld extends World {
    public static int killableEnemies;
    public static int killedEnemies = 0;

    public CatWorld() {
        super(1600, 900, 1);
        Greenfoot.setSpeed(50);
        this.prepare();
    }

    public void act() {
        this.showText("Press \"Enter\" ", 800, 400);
        if(Greenfoot.isKeyDown("enter")){
            WorldController.switchToNextWorld(this);
        }
    }
    
    private void prepare() {

    }

    public void checkForNextWorld(World world) {
        if (killedEnemies >= killableEnemies) {
            WorldController.switchToNextWorld(world);
        }
    }
    
    public static void registerKill() {
        killedEnemies++;
    }
    
    public void spawnSingleEnemy(Enemy enemy) {
        this.addObject(enemy, Greenfoot.getRandomNumber(1550) + 25, 870);
    }
    
    public void spawnEnemy(EnemyType type, int amount) {
        for (int i = 0; i < amount; i++) {
            switch(type) {
                case MOUSE:
                    spawnSingleEnemy(new Mouse());
                    break;
                case RAT:
                    spawnSingleEnemy(new Rat());
                    break;
                default:
                    break;
            }
        }
    }
  
}
