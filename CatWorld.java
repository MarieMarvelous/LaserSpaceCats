import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the parent World class. All other levels inherit from this one.
 */
public class CatWorld extends World {
    public static int killableEnemies;
    public static int killedEnemies = 0;

    public CatWorld() {
        super(800, 450, 1);
        Greenfoot.setSpeed(50);
        this.prepare();
    }

    public void act() {
        this.showText("Press \"Enter\" ", 400, 250);
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
        this.addObject(enemy, Greenfoot.getRandomNumber(550) + 25, 270);
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
                case SQUIRREL:
                    spawnSingleEnemy(new Squirrel());
                    break;
                case APE:
                    spawnSingleEnemy(new Ape());
                    break;
                case DINOSAUR:
                    spawnSingleEnemy(new Dinosaur());
                    break;
                case BOSSMOUSE:
                    spawnSingleEnemy(new BossMouse());
                    break;
                case BOSSDOG:
                    spawnSingleEnemy(new BossDog());
                    break;
                case BOSSSLIME:
                    spawnSingleEnemy(new BossSlime());
                    break;
                case BOSSSCIENTIST:
                    spawnSingleEnemy(new BossScientist());
                    break;
                case BOSSNAPOLEON:
                    spawnSingleEnemy(new BossNapoleon());
                    break;
            }
        }
    }
  
}
