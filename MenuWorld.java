import greenfoot.*;

public class MenuWorld extends World {
    public MenuWorld() {
        super(600, 400, 1);
        prepare();
        Greenfoot.playSound
        ("backsound.mp3");
    }
    
    private void prepare() {

        PlayButton playButton = new PlayButton();
        addObject(playButton,178,275);
        playButton.setLocation(301,232);
        StoryButton storyButton = new StoryButton();
        addObject(storyButton,309,306);
    }
}