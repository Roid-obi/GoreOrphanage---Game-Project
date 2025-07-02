import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class StoryWorld extends World {
    private int timer = 300; // 5 detik kira-kira
    public StoryWorld() {
        super(600, 400, 1);
    }
    public void act() {
        if (Greenfoot.mouseClicked(null)) {
            Greenfoot.setWorld(new MenuWorld());
        }
    }
}
