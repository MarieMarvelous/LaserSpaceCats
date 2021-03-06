import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the parent World class. All other levels inherit from this one.
 */
public class CatWorld extends World {
    public static int killableEnemies;
    public static int killedEnemies = 0;
    public int health;

    public CatWorld() {
        super(1600, 800, 1);
        killedEnemies = 0;
        Greenfoot.setSpeed(50);
        WorldController.setCurrentLevel(this);
    }

    public void act() {
        WorldController.switchToNextWorld(this);
    }

    public void checkForNextWorld(World world) {
        
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
