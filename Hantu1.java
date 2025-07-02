import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hantu1 extends Hantu {
    public Hantu1() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 23, image.getHeight() / 23);
        setImage(image);
    }
}