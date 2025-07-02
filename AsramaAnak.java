import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AsramaAnak extends GameWorld {
    public AsramaAnak() {
        super(600, 400, 1);
        prepare();
    }

    private void prepare() {
        // Tambahkan pintu ke AulaUtama
        Pintu2 pintu2 = new Pintu2();
        addObject(pintu2, 580, 199);

        // Tambahkan Kunci1 hanya jika belum diambil
        if (!GameWorld.kunci1Diambil) {
            Kunci1 kunci1 = new Kunci1();
            addObject(kunci1, 130, 127);
        }

        // tidak ditambahkan new Player() di sini
        // karena Player akan dibawa dari world sebelumnya
    }
}
