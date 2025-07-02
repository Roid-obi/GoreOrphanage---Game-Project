import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StoryButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoryButton extends Actor
{
    private static GreenfootSound clickSound = new GreenfootSound("click.mp3");
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            clickSound.stop(); 
            clickSound.play(); 
            Greenfoot.setWorld(new StoryWorld());
        }
    }
}
