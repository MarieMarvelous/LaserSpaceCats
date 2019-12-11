import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Enemy extends Entity {
    private int shotTimer;
    public int health;
    public int maximalHealth;
  

    public abstract int giveDamage();

    public void act (){
        super.act();
        checkForLaserCollision();
        //checkForCatCollision();
        countFrames();

    }    

    public Enemy(int health) {
        this.maximalHealth = 50;
        this.health=health;
    }

    public void checkForLaserCollision() {
        if (isTouching(Laser.class)) {
            getWorld().removeObjects(getIntersectingObjects(Laser.class));
            health -= Laser.DAMAGE;
            if(health <= 0) {
                if(this instanceof BossMouse) {
                    getWorld().addObject(new Glasses(), getX(), getY());
                }
                if(this instanceof BossDog ) {
                    Bosshealthbar bosshealthbar = getWorld().getObjects(Bosshealthbar.class).get(0);
                    getWorld().addObject(new TinArmor(), getX(), getY());
                    getWorld().removeObject(bosshealthbar);
                }
                if(this instanceof BossSlime) {
                    getWorld().addObject(new SunGlasses(), getX(), getY());
                }
                /*   if(this instanceof BossScientist) {
                getWorld().addObject(, getX(), getY());
                }*/

                getWorld().removeObject(this);
                
                CatWorld.registerKill();
            }
        }
    }

    public void resizeImage(int width, int height) {
        GreenfootImage image =getImage();
        image.scale(width, height);
        setImage(image);
    } 

    public void randomMovement(int randomForward, int randomTurn, int turn) {
        if (framesToCount == 0) {
            CatHero cat = getWorld().getObjects(CatHero.class).get(0);
            if(Greenfoot.getRandomNumber(100) < 10) {
                turnTowards(cat.getX(), cat.getY());
            }
            move(Greenfoot.getRandomNumber(10));
            if(Greenfoot.getRandomNumber(10) <=randomTurn) {
                turn(-turn);
            }
            if(Greenfoot.getRandomNumber(10) >=randomTurn) {
                turn(turn);
            }
            if (isTouching(Artefact.class)) {
                move(-randomForward);
            }
        }
    }  
    public void updateBosshealthbar()
    {
        Bosshealthbar bosshealthbar  = (Bosshealthbar) getWorld().getObjects(Bosshealthbar.class).get(0);
        double percentageHealth = (health / (1.0 * maximalHealth)) + 0.02;
        int hearts = (int) Math.round(6.0 * percentageHealth);
        String imageName = hearts + "opponent.png";
        bosshealthbar.setImage(imageName);
    
    }
    public void runTowardsCatHero () {
        move(1);
        if (getWorld().getObjects(CatHero.class).isEmpty()) return; 
        Actor CatHero = (Actor)getWorld().getObjects(CatHero.class).get(0);
        turnTowards(CatHero.getX(), CatHero.getY()); 
    }

    public void shootBanana() { 
        if (shotTimer > 0 && --shotTimer > 0) return;
        Actor banana = new Banana(0);
        getWorld().addObject(banana, getX(), getY());
        banana.setRotation(getRotation()); 
        shotTimer = 50; //je höher desto langsamer kommen die Bananen
    }

    public boolean canSee(Class clss) {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }

    /*public void Hitbox() {
    if (this.isTouching(Enemy.class)) {
    setLocation(getX()-10,getY());
    }
    if (this.isTouching(Enemy.class)) {
    setLocation(getX()+10,getY());
    }
    if (this.isTouching(Enemy.class)) {
    setLocation(getX()+10,getY());
    }
    if (this.isTouching(Enemy.class)) {
    setLocation(getX()-10,getY());
    }
    if (this.isTouching(Enemy.class)) {
    setLocation(getX(),getY()-10);
    }
    if (this.isTouching(Enemy.class)) {
    setLocation(getX(),getY()+10);
    }
    if (this.isTouching(Enemy.class)) {
    setLocation(getX(),getY()+10);
    }
    if (this.isTouching(Enemy.class)) {
    setLocation(getX(),getY()-10);
    }
    }*/

    /*  public void itemDrop(EnemyType BossType, int x, int y) {
    switch(BossType) {
    case BOSSMOUSE: 
    Glasses Brille = new Glasses();
    getWorld().addObject(Brille, x, y);    
    }      
    }*/

    /* public void checkForCatCollision() {
    if (isTouching(CatHero.class) && framesToCount == 0) {
    CatHero catHero = getWorld().getObjects(CatHero.class).get(0);
    turnTowards(catHero.getX(), catHero.getY());
    System.out.println("CatHero.isMoved = " + catHero.isMoved);
    }
    } */

    /*if (catHero.isMoved == false) {
    //System.out.println("isTouching(CatHero) = ");
    catHero.checkCollision(); 
    System.out.println("CatHero.isMoved = " + catHero.isMoved);
    }
    if (catHero.isMoved == false) {
    catHero.checkCollision(); 
    }
    startFrameCounting(30);

    move(-60);
    }*/

    // ab "if (catHero.isMoved == false) {" wieder auskommentieren!

    public void drawBack() {
        CatHero catHero = getWorld().getObjects(CatHero.class).get(0);
        turnTowards(catHero.getX(), catHero.getY());
        startFrameCounting(30);
        move(-5);
    }

    /*public void shootCatHero() {
    if (canSee (CatHero.class))  //läuft los wenn Ape CatHero sieht. Object in Range?
    {
    getWorld().addObject(new Banana(80), this.getX(), this.getY()); 
    }
    }*/
}
