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

    private static World createStoryScreen() {
        StoryScreen world = new StoryScreen();
        Greenfoot.setWorld(world);
        CatWorld.killedEnemies = 0;
        return world;
    }

    private static World createHouse() {
        House world = new House(catHero);
        Greenfoot.setWorld(world);
        CatWorld.killedEnemies = 0;
        return world;
    }

    private static World createGarden() {
        Garden world = new Garden(catHero);
        Greenfoot.setWorld(world);
        CatWorld.killedEnemies = 0;
        return world;
    }

    private static World createSewers() {
        Sewers world = new Sewers(catHero);
        Greenfoot.setWorld(world);
        CatWorld.killedEnemies = 0;
        return world;
    }

    private static World createGuianaSpaceCenter() {
        GuianaSpaceCenter world = new GuianaSpaceCenter(catHero);
        Greenfoot.setWorld(world);
        CatWorld.killedEnemies = 0;
        return world;
    }

    private static World createMoon() {
        Moon world = new Moon(catHero);
        Greenfoot.setWorld(world);
        CatWorld.killedEnemies = 0;
        return world;
    }

    private static World createEnding() {
        Ending world = new Ending();
        Greenfoot.setWorld(world);
        CatWorld.killedEnemies = 0;
        return world;
    }

    /*private static World createTestWorld() {
    TestWorld world = new TestWorld();
    Greenfoot.setWorld(world);
    CatWorld.killedEnemies = 0;
    return world;
    }*/

    public static void switchToNextWorld(World world) {
        if (world instanceof CatWorld) {
            World StoryScreen = createStoryScreen();
        }

        /*if (world instanceof CatWorld) {
        World testWorld = createTestWorld();
        //testWorld.showText("TestWorld", 200, 200);
        }*/
        if (world instanceof StoryScreen) {
            World house = createHouse();
            house.showText("house", 200, 200);
        }
        if (world instanceof House) {
            World garden = createGarden();
            garden.showText("garden", 200, 200);
        }
        if (world instanceof Garden) {
            World sewers = createSewers();
            sewers.showText("sewers", 200, 200);
        }
        if (world instanceof Sewers) {
            World guianaSpaceCenter = createGuianaSpaceCenter();
            guianaSpaceCenter.showText("Guiana Space Center", 200, 200);
        }
        if (world instanceof GuianaSpaceCenter) {
            World moon = createMoon();
            moon.showText("Moon", 200, 200);
        }
        if (world instanceof Moon) {
            World ending = createEnding();
            ending.showText("Ending", 200, 200);
            Greenfoot.stop();
        }
    }
    
    public static void increaseHeroLife(int amount) {
        catHero.increaseMaximumHealth(amount);
    }
}
