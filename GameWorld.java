import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameWorld extends World {
    public GameWorld(int width, int height, int cellSize) {
        super(width, height, cellSize);
    }

    public void act() {
        updateUI();
    }

    public void updateUI() {
        if (!getObjects(Player.class).isEmpty()) {
            Player player = (Player)getObjects(Player.class).get(0);
            showText("Kunci: " + player.getKunciDapat(), 60, 20);
        }
    }
}
