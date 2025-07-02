import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class GameWorld extends World {
    // Global flags untuk status item
    public static boolean kunci1Diambil = false;
    public static boolean kunci2Diambil = false;
    public static boolean bukuLamaDiambil = false;
    public static boolean bonekaDiambil = false;

    public GameWorld(int width, int height, int cellSize) {
        super(width, height, cellSize);
    }

    public void act() {
        updateUI();
    }

    public void updateUI() {
    List<Player> players = getObjects(Player.class);
    if (!players.isEmpty()) {
        Player player = players.get(0);
        showText("Kunci Keluar: " + player.getKunciDapat() + "/2", 90, 20);
    }
}

}
