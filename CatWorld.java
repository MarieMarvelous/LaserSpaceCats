import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CatWorld extends World {

    public CatWorld() {
        super(1600, 900, 1);
    }

    private void prepare() {
        createWorld();
        /*CatHero catHero = new CatHero();
        addObject(catHero,656,498);
        Mouse mouse = new Mouse();
        addObject(mouse,1001,426);
        mouse.setLocation(703,499);
        catHero.setLocation(519,505);
        catHero.setLocation(667,506);
        Rat rat = new Rat();
        addObject(rat,979,325);*/
    }

    public void createWorld() {
        Greenfoot.setWorld(new Garden());
    }
}
