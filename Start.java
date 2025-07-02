import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{
    public Start() {
        super(600, 400, 1);
        showText("Tekan ENTER...", 300, 200);
        prepare();
    }

    public void act() {
        if (Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new MenuWorld());
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
