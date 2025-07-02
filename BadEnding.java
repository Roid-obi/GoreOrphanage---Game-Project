import greenfoot.*;

public class BadEnding extends World {
    private GreenfootImage background;
    private GreenfootImage hantuImage;
    private int timer = 0;

    public BadEnding() {
        super(600, 400, 1);
        BacksoundManager.stop();

        // Matikan backsound sebelumnya
        GreenfootSound backsound = new GreenfootSound("backsound.mp3");
        backsound.stop();

        // Gambar latar belakang hitam
        background = new GreenfootImage(600, 400);
        background.setColor(Color.BLACK);
        background.fill();

        // Tambahkan gambar hantu ukuran full layar
        hantuImage = new GreenfootImage("hantu_full.png");
        hantuImage.scale(600, 400);
        setBackground(hantuImage);
    }

    public void act() {
        timer++;

        // Tampilkan teks satu per satu setiap 2 detik (≈120 frame)
        if (timer == 120) {
            showText("Kau mengabaikanku...", 300, 340);
        } else if (timer == 240) {
            showText("Aku akan terus mengikutimu...", 300, 340);
        } else if (timer == 360) {
            showText("Kenapa kau tidak menemukan bonekaku...", 300, 340);
        }

        // Tekan ENTER untuk lanjut
        if (Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new GameWin());
        }
    }
}
