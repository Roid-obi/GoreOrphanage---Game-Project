import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PlayButton extends Actor {
    private static GreenfootSound clickSound = new GreenfootSound("click.mp3");
    public PlayButton() {
        setImage("play-button.png");
    }
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            clickSound.stop();
            clickSound.play();
            Greenfoot.setWorld(new AfterPlay());
        }
    }
}