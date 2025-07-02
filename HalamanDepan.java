import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HalamanDepan extends World {
    public HalamanDepan() {
        super(600, 400, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,302,320);
        player.setLocation(302,309);
        Pintu1 pintu1 = new Pintu1();
        addObject(pintu1,345,98);
        pintu1.setLocation(304,44);
        pintu1.setLocation(304,44);
        pintu1.setLocation(304,44);
        pintu1.setLocation(304,31);
        pintu1.setLocation(305,72);
        pintu1.setLocation(284,44);
        pintu1.setLocation(334,39);
        pintu1.setLocation(304,39);
    }
}

