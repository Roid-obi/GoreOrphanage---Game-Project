import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends World {
    public GameOver() {
        super(600, 400, 1);
        BacksoundManager.stop();
        showText("Mereka menemukanku lebih dulu...", 300, 200);
    }

    public void act() {
        if (Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new MenuWorld());
        }
    }
}
