import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BadEnding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BadEnding extends World
{
    public BadEnding() {
        super(600, 400, 1);
        showText("Kembalikan buku itu...", 300, 200);
    }
    public void act() {
        if (Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new GameWin());
        }
    }
}
