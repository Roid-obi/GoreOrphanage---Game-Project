import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AsramaAnak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AsramaAnak extends GameWorld {
    public AsramaAnak() {
        super(600, 400, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pintu2 pintu2 = new Pintu2();
        addObject(pintu2,525,199);
        pintu2.setLocation(556,213);
        Player player = new Player();
        addObject(player,428,214);
        player.setLocation(491,211);
        pintu2.setLocation(572,206);
        player.setLocation(494,198);
        Kunci1 kunci1 = new Kunci1();
        addObject(kunci1,262,238);
        kunci1.setLocation(130,127);
        removeObject(player);
        pintu2.setLocation(280,392);
        pintu2.setLocation(284,375);
        pintu2.setLocation(313,379);
        pintu2.setLocation(293,387);
        pintu2.setLocation(300,382);
        pintu2.setLocation(580,199);
    }
}