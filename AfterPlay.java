import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AfterPlay extends World {
    public AfterPlay() {
        super(600, 400, 1);
        showText("\"Temukan mainanku... Bebaskan kami...\"", 300, 200);
    }
    public void act() {
        if (Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new HalamanDepan());
        }
    }
}