import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blank extends World
{
    public Blank() {
        super(600, 400, 1);
        showText("Tekan ENTER...", 300, 200);
    }

    public void act() {
        if (Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new MenuWorld());
        }
    }
}
