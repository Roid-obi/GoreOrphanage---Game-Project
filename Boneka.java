import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boneka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boneka extends Actor {
    public Boneka() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 26, image.getHeight() / 26);
        setImage(image);
    }
}

