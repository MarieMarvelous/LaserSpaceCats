import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Garden here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Garden extends CatWorld {  
    private static boolean secondWaveReady = true;
    private static boolean thirdWaveReady = true;
    private static boolean fourthWaveReady = true;
    private static boolean fithWaveReady = true;
    private static boolean bossWaveReady = true;
    Bosshealthbar bosshealthbar = new Bosshealthbar();
    GreenfootSound backgroundMusic = new GreenfootSound("RaMxGF.mp3");

    public Garden() {
        super();
        //Sound
        backgroundMusic.playLoop();
        //Leveldesign
        /*addObject(new StonePattern(), 777, 426);
        addObject(new StonePattern(), 777, 376);
        addObject(new StonePattern(), 727, 376);
        addObject(new StonePattern(), 727, 426);
        addObject(new StonePattern(), 777, 326);
        addObject(new StonePattern(), 777, 276);
        addObject(new StonePattern(), 727, 276);
        addObject(new StonePattern(), 727, 326);
        addObject(new StonePattern(), 777, 226);
        addObject(new StonePattern(), 777, 176);
        addObject(new StonePattern(), 727, 176);
        addObject(new StonePattern(), 727, 226);
        addObject(new StonePattern(), 777, 126);
        addObject(new StonePattern(), 777, 76);
        addObject(new StonePattern(), 727, 76);
        addObject(new StonePattern(), 727, 126);
        addObject(new StonePattern(), 777, 26);
        addObject(new StonePattern(), 777, 0);
        addObject(new StonePattern(), 727, 0);
        addObject(new StonePattern(), 727, 26);

        addObject(new Flowers(), 664, 430);
        addObject(new Flowers(), 65, 365);

        addObject(new Fence1(), 700, 40);
        addObject(new Fence1(), 700, 110);
        addObject(new Fence1(), 700, 180);
        addObject(new Fence1(), 700, 250);
        addObject(new Fence1(), 700, 320);
        addObject(new Fence1(), 700, 390);
        addObject(new Fence1(), 700, 460);

        addObject(new Mushrooms(), 236, 100);
        addObject(new Mushrooms(), 120, 140);
        addObject(new TreeGroup(), 155, 65);
        addObject(new Mushrooms(), 200, 131);*/

        addObject(new TinArmor(), 300, 800);

        //Spawn Objects in World
        addObject(new CatHero(),895,245);
        spawnEnemy(EnemyType.SQUIRREL, 1);

        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,296,68);
        prepare();
    }

    public void act() {
        if (killedEnemies >= 1 && secondWaveReady) {
            spawnEnemy(EnemyType.SQUIRREL, 2);
            secondWaveReady = false;
        }
        if (killedEnemies >= 3 && thirdWaveReady) {
            spawnEnemy(EnemyType.SQUIRREL, 3);
            thirdWaveReady = false;
        }
        if (killedEnemies >= 6 && fourthWaveReady) {
            spawnEnemy(EnemyType.SQUIRREL, 5);
            fourthWaveReady = false;
        }
        if (killedEnemies >= 11 && fithWaveReady) {
            spawnEnemy(EnemyType.SQUIRREL, 8);
            fithWaveReady = false;
        }
        if (killedEnemies >= 19 && bossWaveReady) {
            spawnEnemy(EnemyType.BOSSDOG, 1);
            addObject(bosshealthbar,700,75);
            bossWaveReady = false;
        }
    }

    public void spawnedEnemy() {
        for (int i = 1; i <= killableEnemies; i++) {            
            addObject(new Rat(), Greenfoot.getRandomNumber(750) + 25, 400);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rain rain = new Rain();
        addObject(rain,1113,21);
        Rain rain2 = new Rain();
        addObject(rain2,807,65);
        Rain rain3 = new Rain();
        addObject(rain3,1402,308);
        Rain rain4 = new Rain();
        addObject(rain4,1054,305);
        Rain rain5 = new Rain();
        addObject(rain5,1536,167);
        Rain rain6 = new Rain();
        addObject(rain6,1164,179);
        Rain rain7 = new Rain();
        addObject(rain7,858,290);
        Rain rain8 = new Rain();
        addObject(rain8,362,83);
        Rain rain9 = new Rain();
        addObject(rain9,36,53);
        Rain rain10 = new Rain();
        addObject(rain10,146,211);
        Rain rain11 = new Rain();
        addObject(rain11,515,188);
        Rain rain12 = new Rain();
        addObject(rain12,339,375);
        Rain rain13 = new Rain();
        addObject(rain13,18,334);
        Rain rain14 = new Rain();
        addObject(rain14,101,480);
        Rain rain15 = new Rain();
        addObject(rain15,123,632);
        rain15.setLocation(200,702);
        Rain rain16 = new Rain();
        addObject(rain16,200,702);
        Rain rain17 = new Rain();
        addObject(rain17,579,701);
        Rain rain18 = new Rain();
        addObject(rain18,933,703);
        Rain rain19 = new Rain();
        addObject(rain19,1298,701);
        rain19.setLocation(1425,699);
        Rain rain20 = new Rain();
        addObject(rain20,1425,699);
        Rain rain21 = new Rain();
        addObject(rain21,1408,527);
        rain3.setLocation(1395,388);
        Rain rain22 = new Rain();
        addObject(rain22,1395,388);
        Rain rain23 = new Rain();
        addObject(rain23,609,436);
        Rain rain24 = new Rain();
        addObject(rain24,969,422);
        Rain rain25 = new Rain();
        addObject(rain25,906,561);
        Rain rain26 = new Rain();
        addObject(rain26,1212,503);
        Rain rain27 = new Rain();
        addObject(rain27,651,581);
        Rain rain28 = new Rain();
        addObject(rain28,816,162);
        rain11.setLocation(405,272);
        Rain rain29 = new Rain();
        addObject(rain29,405,272);
        rain9.setLocation(99,43);
        GardenUpperLeftCorner gardenUpperLeftCorner = new GardenUpperLeftCorner();
        addObject(gardenUpperLeftCorner,99,43);
        rain7.setLocation(806,244);
        GardenBarrel gardenBarrel = new GardenBarrel();
        addObject(gardenBarrel,806,244);
        rain4.setLocation(953,269);
        GardenBarrel gardenBarrel2 = new GardenBarrel();
        addObject(gardenBarrel2,953,269);
        rain4.setLocation(953,292);
        GardenBarrel gardenBarrel3 = new GardenBarrel();
        addObject(gardenBarrel3,953,292);
        rain4.setLocation(952,321);
        GardenSmallestBush gardenSmallestBush = new GardenSmallestBush();
        addObject(gardenSmallestBush,952,321);
        GardenSmallestBush gardenSmallestBush2 = new GardenSmallestBush();
        addObject(gardenSmallestBush2,1187,645);
        rain15.setLocation(249,718);
        GardenSmallestBush gardenSmallestBush3 = new GardenSmallestBush();
        addObject(gardenSmallestBush3,249,718);
        rain27.setLocation(601,593);
        GardenSmallestBush gardenSmallestBush4 = new GardenSmallestBush();
        addObject(gardenSmallestBush4,601,593);
        rain27.setLocation(455,544);
        GardenSmallestBush gardenSmallestBush5 = new GardenSmallestBush();
        addObject(gardenSmallestBush5,455,544);
        rain15.setLocation(218,643);
        GardenSmallestBush gardenSmallestBush6 = new GardenSmallestBush();
        addObject(gardenSmallestBush6,218,643);
        rain11.setLocation(512,345);
        GardenSmallestBush gardenSmallestBush7 = new GardenSmallestBush();
        addObject(gardenSmallestBush7,512,345);
        GardenSmallestBush gardenSmallestBush8 = new GardenSmallestBush();
        addObject(gardenSmallestBush8,601,170);
        GardenSmallestBush gardenSmallestBush9 = new GardenSmallestBush();
        addObject(gardenSmallestBush9,572,96);
        rain8.setLocation(543,146);
        GardenSmallestBush gardenSmallestBush10 = new GardenSmallestBush();
        addObject(gardenSmallestBush10,543,146);
        rain9.setLocation(44,94);
        GardenSmallestBush gardenSmallestBush11 = new GardenSmallestBush();
        addObject(gardenSmallestBush11,44,94);
        rain14.setLocation(44,445);
        GardenSmallestBush gardenSmallestBush12 = new GardenSmallestBush();
        addObject(gardenSmallestBush12,44,445);
        rain14.setLocation(13,494);
        GardenSmallestBush gardenSmallestBush13 = new GardenSmallestBush();
        addObject(gardenSmallestBush13,13,494);
        rain15.setLocation(43,619);
        GardenSmallestBush gardenSmallestBush14 = new GardenSmallestBush();
        addObject(gardenSmallestBush14,43,619);
        rain15.setLocation(15,743);
        GardenSmallestBush gardenSmallestBush15 = new GardenSmallestBush();
        addObject(gardenSmallestBush15,15,743);
        rain9.setLocation(27,136);
        GardenSmallerBush gardenSmallerBush = new GardenSmallerBush();
        addObject(gardenSmallerBush,27,136);
        rain13.setLocation(88,411);
        GardenSmallerBush gardenSmallerBush2 = new GardenSmallerBush();
        addObject(gardenSmallerBush2,88,411);
        GardenSmallerBush gardenSmallerBush3 = new GardenSmallerBush();
        addObject(gardenSmallerBush3,0,385);
        GardenSmallerBush gardenSmallerBush4 = new GardenSmallerBush();
        addObject(gardenSmallerBush4,0,708);
        rain27.setLocation(261,585);
        GardenSmallerBush gardenSmallerBush5 = new GardenSmallerBush();
        addObject(gardenSmallerBush5,261,585);
        rain16.setLocation(264,659);
        GardenSmallerBush gardenSmallerBush6 = new GardenSmallerBush();
        addObject(gardenSmallerBush6,264,659);
        rain17.setLocation(674,634);
        GardenSmallerBush gardenSmallerBush7 = new GardenSmallerBush();
        addObject(gardenSmallerBush7,674,634);
        rain11.setLocation(499,385);
        GardenSmallerBush gardenSmallerBush8 = new GardenSmallerBush();
        addObject(gardenSmallerBush8,499,385);
        rain8.setLocation(524,111);
        GardenSmallerBush gardenSmallerBush9 = new GardenSmallerBush();
        addObject(gardenSmallerBush9,524,111);
        rain26.setLocation(1172,559);
        GardenSmallerBush gardenSmallerBush10 = new GardenSmallerBush();
        addObject(gardenSmallerBush10,1172,559);
        rain9.setLocation(159,116);
        GardenSign gardenSign = new GardenSign();
        addObject(gardenSign,159,116);
        rain3.setLocation(1361,439);
        GardenSign gardenSign2 = new GardenSign();
        addObject(gardenSign2,1361,439);
        rain9.setLocation(293,51);
        GardenSewer gardenSewer = new GardenSewer();
        addObject(gardenSewer,293,51);
        GardenDoghouse gardenDoghouse = new GardenDoghouse();
        addObject(gardenDoghouse,197,415);
        GardenBigBush gardenBigBush = new GardenBigBush();
        addObject(gardenBigBush,395,83);
        rain11.setLocation(571,357);
        GardenBigBush gardenBigBush2 = new GardenBigBush();
        addObject(gardenBigBush2,571,357);
        GardenBigBush gardenBigBush3 = new GardenBigBush();
        addObject(gardenBigBush3,513,581);
        rain13.setLocation(72,357);
        GardenBigBush gardenBigBush4 = new GardenBigBush();
        addObject(gardenBigBush4,72,357);
        rain19.setLocation(1481,655);
        GardenBigBush gardenBigBush5 = new GardenBigBush();
        addObject(gardenBigBush5,1481,655);
        rain3.setLocation(1452,448);
        GardenBaumStumpf gardenBaumStumpf = new GardenBaumStumpf();
        addObject(gardenBaumStumpf,1452,448);
        rain3.setLocation(1511,515);
        GardenBaumkrone gardenBaumkrone = new GardenBaumkrone();
        addObject(gardenBaumkrone,1511,515);
        rain3.setLocation(1404,590);
        GardenHouseLowerRightCorner1 gardenHouseLowerRightCorner1 = new GardenHouseLowerRightCorner1();
        addObject(gardenHouseLowerRightCorner1,1404,590);
        rain21.setLocation(1268,569);
        removeObject(gardenHouseLowerRightCorner1);
        rain3.setLocation(1404,592);

        rain3.setLocation(1405,592);
        GardenHouseLowerRightCorner1 gardenHouseLowerRightCorner12 = new GardenHouseLowerRightCorner1();
        addObject(gardenHouseLowerRightCorner12,1405,592);
        rain3.setLocation(1395,679);
        GardenHouseLowerRightCornerBottom gardenHouseLowerRightCornerBottom = new GardenHouseLowerRightCornerBottom();
        addObject(gardenHouseLowerRightCornerBottom,1395,679);
        rain7.setLocation(703,221);
        GardenStraw gardenStraw = new GardenStraw();
        addObject(gardenStraw,703,221);
        rain4.setLocation(938,247);
        GardenStraw gardenStraw2 = new GardenStraw();
        addObject(gardenStraw2,938,247);
        rain4.setLocation(952,267);
        GardenBarrel gardenBarrel4 = new GardenBarrel();
        addObject(gardenBarrel4,952,267);
        rain4.setLocation(953,294);
        GardenBarrel gardenBarrel5 = new GardenBarrel();
        addObject(gardenBarrel5,953,294);
        rain4.setLocation(953,321);
        GardenSmallestBush gardenSmallestBush16 = new GardenSmallestBush();
        addObject(gardenSmallestBush16,953,321);
        rain4.setLocation(822,247);
        GardenStraw gardenStraw3 = new GardenStraw();
        addObject(gardenStraw3,822,247);
        GardenBarrel gardenBarrel6 = new GardenBarrel();
        addObject(gardenBarrel6,806,243);
        rain.setLocation(1097,72);
        GardenUpperRightCorner gardenUpperRightCorner = new GardenUpperRightCorner();
        addObject(gardenUpperRightCorner,1097,72);
        rain6.setLocation(1110,179);
        GardenUpperRightCornerLowerPart gardenUpperRightCornerLowerPart = new GardenUpperRightCornerLowerPart();
        addObject(gardenUpperRightCornerLowerPart,1110,179);
        removeObject(gardenUpperRightCornerLowerPart);
        rain6.setLocation(1109,177);

        rain6.setLocation(1108,178);
        gardenUpperRightCornerLowerPart = new GardenUpperRightCornerLowerPart();
        addObject(gardenUpperRightCornerLowerPart,1108,178);
        removeObject(gardenUpperRightCorner);
        rain.setLocation(1095,72);
        gardenUpperRightCorner = new GardenUpperRightCorner();
        addObject(gardenUpperRightCorner,1095,72);
        rain4.setLocation(776,251);
        GardenHouseLowerRightCorner gardenHouseLowerRightCorner = new GardenHouseLowerRightCorner();
        addObject(gardenHouseLowerRightCorner,776,251);
        rain4.setLocation(747,252);
        GardenHouseLowerRightCorner gardenHouseLowerRightCorner2 = new GardenHouseLowerRightCorner();
        addObject(gardenHouseLowerRightCorner2,747,252);
        rain22.setLocation(1288,322);
        GardenUpperRightCornerLowestPart gardenUpperRightCornerLowestPart = new GardenUpperRightCornerLowestPart();
        addObject(gardenUpperRightCornerLowestPart,1288,322);
        rain21.setLocation(1218,511);
        GardenBushKrone gardenBushKrone = new GardenBushKrone();
        addObject(gardenBushKrone,1218,511);
        removeObject(gardenBushKrone);
        gardenBushKrone = new GardenBushKrone();
        addObject(gardenBushKrone,1216,510);
        removeObject(gardenDoghouse);
        gardenDoghouse = new GardenDoghouse();
        addObject(gardenDoghouse,197,414);
        removeObject(gardenSmallerBush2);
        rain13.setLocation(87,411);
        gardenSmallerBush2 = new GardenSmallerBush();
        addObject(gardenSmallerBush2,87,411);
        removeObject(gardenBigBush4);
        rain13.setLocation(72,358);
        gardenBigBush4 = new GardenBigBush();
        addObject(gardenBigBush4,72,358);
        rain8.setLocation(559,29);
        GardenMiddleLower gardenMiddleLower = new GardenMiddleLower();
        addObject(gardenMiddleLower,559,29);
        rain.setLocation(1129,137);
        Rain rain30 = new Rain();
        addObject(rain30,1129,137);
        rain4.setLocation(800,182);
        Rain rain31 = new Rain();
        addObject(rain31,800,182);
        rain2.setLocation(753,89);
        Rain rain32 = new Rain();
        addObject(rain32,753,89);
        rain22.setLocation(1126,310);
        Rain rain33 = new Rain();
        addObject(rain33,1126,310);
        rain22.setLocation(1426,309);
        Rain rain34 = new Rain();
        addObject(rain34,1426,309);
        rain5.setLocation(1417,156);
        Rain rain35 = new Rain();
        addObject(rain35,1417,156);
        rain5.setLocation(1410,85);
        Rain rain36 = new Rain();
        addObject(rain36,1410,85);
        Rain rain37 = new Rain();
        addObject(rain37,1301,594);
        Rain rain38 = new Rain();
        addObject(rain38,1453,604);
        Rain rain39 = new Rain();
        addObject(rain39,1428,469);
        rain11.setLocation(562,372);
        Rain rain40 = new Rain();
        addObject(rain40,562,372);
        rain13.setLocation(90,407);
        Rain rain41 = new Rain();
        addObject(rain41,90,407);
        rain9.setLocation(134,80);
        Rain rain42 = new Rain();
        addObject(rain42,134,80);
        Rain rain43 = new Rain();
        addObject(rain43,432,68);
        rain4.setLocation(849,174);
        rain2 = new Rain();
        addObject(rain2,849,174);
        Rain rain45 = new Rain();
        addObject(rain45,808,86);
        Rain rain46 = new Rain();
        addObject(rain46,490,734);
    }
}
