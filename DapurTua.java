import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DapurTua here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DapurTua extends GameWorld
{

    /**
     * Constructor for objects of class DapurTua.
     * 
     */
    public DapurTua()
    {    
        super(600, 400, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Kunci1 kunci1 = new Kunci1();
        addObject(kunci1,58,29);
        kunci1.setLocation(61,52);
        kunci1.setLocation(101,93);
        kunci1.setLocation(99,98);
        kunci1.setLocation(196,139);
        removeObject(kunci1);
        Kunci2 kunci2 = new Kunci2();
        addObject(kunci2,176,226);
        kunci2.setLocation(293,373);
        kunci2.setLocation(129,111);
        kunci2.setLocation(83,336);
        Hantu2 hantu2 = new Hantu2();
        addObject(hantu2,249,142);
        hantu2.setLocation(144,80);
        hantu2.setLocation(133,84);
        Pintu3 pintu3 = new Pintu3();
        addObject(pintu3,583,214);
        pintu3.setLocation(552,223);
        pintu3.setLocation(552,215);
        kunci2.setLocation(69,359);
        Player player = new Player();
        addObject(player,467,210);
        player.setLocation(472,216);
        pintu3.setLocation(584,229);
        pintu3.setLocation(580,211);
        pintu3.setLocation(573,207);
        pintu3.setLocation(573,207);
        pintu3.setLocation(572,207);
        removeObject(player);
        pintu3.setLocation(304,390);
        pintu3.setLocation(300,397);
        pintu3.setLocation(305,404);
        pintu3.setLocation(320,341);
        pintu3.setLocation(307,368);
        pintu3.setLocation(304,382);
        kunci2.setLocation(506,81);
        pintu3.setLocation(304,-28);
        pintu3.setLocation(307,37);
        pintu3.setLocation(316,23);
        pintu3.setLocation(311,21);
        pintu3.setLocation(311,28);
        pintu3.setLocation(312,24);
    }
}
