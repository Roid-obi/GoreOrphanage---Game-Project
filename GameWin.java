import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameWin extends World {
    private int timer = 0;

    public GameWin() {
        super(600, 400, 1);
        BacksoundManager.stop();
        showText("Kau berhasil keluar...", 300, 200);
    }

    public void act() {
        timer++;

        // Setelah 3 detik (sekitar 180 frame), tampilkan teks tambahan
        if (timer == 180) {
            showText("Terima kasih telah membebaskanku...", 300, 230);
        }

        // Opsional: tekan ENTER untuk kembali ke menu
        if (Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new MenuWorld());
        }
    }
}
