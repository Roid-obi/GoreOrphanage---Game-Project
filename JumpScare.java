import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * World untuk menampilkan jumpscare.
 */
public class JumpScare extends World
{
    private int timer = 150;
    
    public JumpScare()
    {    
        
        super(600, 400, 1); 
        GreenfootImage background = new GreenfootImage("unnamed.jpg");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        // Greenfoot.delay(60);
        Greenfoot.playSound("scream.mp3");
        Greenfoot.setWorld(new GameOver());
    }
    public void act() {
        timer--;
        if (timer <= 0) {
            Greenfoot.setWorld(new GameOver());
        }
    }
}
