import greenfoot.*;

public class Hantu extends Actor {
    private int moveCooldown = 0;  // Waktu tunggu sebelum ganti arah random
    private int direction = 0;     // 0=atas, 1=bawah, 2=kiri, 3=kanan

    public void act() {
        if (isPlayerNearby()) {
            chasePlayer();       // Jika player dekat, kejar
        } else {
            moveRandom();        // Jika tidak, bergerak acak
        }
    }

    // Deteksi apakah player ada di sekitar dalam jarak 100x100 piksel
    protected boolean isPlayerNearby() {
        for (int dx = -100; dx <= 100; dx += 20) {
            for (int dy = -100; dy <= 100; dy += 20) {
                if (getOneObjectAtOffset(dx, dy, Player.class) != null) return true;
            }
        }
        return false;
    }

    // Mengejar player secara langsung
    protected void chasePlayer() {
        if (!getWorld().getObjects(Player.class).isEmpty()) {
            Player player = (Player) getWorld().getObjects(Player.class).get(0);
            turnTowards(player.getX(), player.getY());  // Menghadap ke arah player
            move(2);  // Bergerak maju
        }
    }

    // Gerakan acak tanpa rotasi: hanya ke atas, bawah, kiri, kanan
    protected void moveRandom() {
        if (moveCooldown == 0) {
            direction = Greenfoot.getRandomNumber(4);  // Pilih arah acak 0-3
            moveCooldown = 30 + Greenfoot.getRandomNumber(30);  // Lama gerakan arah ini
        } else {
            // Bergerak 1 piksel ke arah yang dipilih
            switch (direction) {
                case 0: setLocation(getX(), getY() - 1); break; // atas
                case 1: setLocation(getX(), getY() + 1); break; // bawah
                case 2: setLocation(getX() - 1, getY()); break; // kiri
                case 3: setLocation(getX() + 1, getY()); break; // kanan
            }
            moveCooldown--;  // Kurangi waktu tunggu
        }
    }
}
