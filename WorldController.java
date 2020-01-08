import greenfoot.*;  

/**
 * This class is supposed to manage the Level and Game progress
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldController {

    private static CatHero catHero = new CatHero(); //the one and only!
    
    public WorldController() {
    }
    
    private static void createMainMenu() {
        MainMenu world = new MainMenu();
        Greenfoot.setWorld(world);
    }

    private static void createStoryScreen() {
        StoryScreen world = new StoryScreen();
        Greenfoot.setWorld(world);
    }

    private static World createHouse() {
        House world = new House();
        Greenfoot.setWorld(world);
        CatWorld.killedEnemies = 0;
        return world;
    }

    private static World createGarden() {
        Garden world = new Garden();
        Greenfoot.setWorld(world);
        CatWorld.killedEnemies = 0;
        return world;
    }

    private static World createSewers() {
        Sewers world = new Sewers();
        Greenfoot.setWorld(world);
        CatWorld.killedEnemies = 0;
        return world;
    }

    private static World createGuianaSpaceCenter() {
        GuianaSpaceCenter world = new GuianaSpaceCenter();
        Greenfoot.setWorld(world);
        CatWorld.killedEnemies = 0;
        return world;
    }

    private static World createMoon() {
        Moon world = new Moon();
        Greenfoot.setWorld(world);
        CatWorld.killedEnemies = 0;
        return world;
    }

    public static void switchToNextWorld(World world) {
        if (world instanceof CatWorld) {
            createMainMenu();
        }
        if (world instanceof MainMenu) {
            createStoryScreen();
        }
        if (world instanceof StoryScreen) {
            World house = createHouse();
        }
        if (world instanceof House) {
            World garden = createGarden();
        }
        if (world instanceof Garden) {
            World sewers = createSewers();
        }
        if (world instanceof Sewers) {
            World guianaSpaceCenter = createGuianaSpaceCenter();
        }
        if (world instanceof GuianaSpaceCenter) {
            World moon = createMoon();
        }
        if (world instanceof Moon) {
            createMainMenu();
        }
    }
    
    public static void increaseHeroLife(int amount) {
        catHero.increaseMaximumHealth(amount);
    }
    
    public static void increaseDamageMultiplier(double amount) {
        catHero.increaseDamageMultiplier(amount);
    }
    
    public static double getDamageMultiplier() {
        return catHero.damageMultiplier;
    }
    
    public static void heal(int amount) {
        if ((catHero.health + amount) > catHero.maximalHealth) {
            catHero.health = catHero.maximalHealth;
        } else {
            catHero.health += amount;
        }
    }
    
    public static CatHero getCatHero() {
        return catHero;
    }
}
