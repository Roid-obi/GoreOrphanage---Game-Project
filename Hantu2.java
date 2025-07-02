import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hantu2 extends Hantu {
    public Hantu2() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 23, image.getHeight() / 23);
        setImage(image);
    }
}