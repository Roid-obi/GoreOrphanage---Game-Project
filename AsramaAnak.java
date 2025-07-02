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
        Kasur kasur = new Kasur();
        addObject(kasur,344,177);
        kasur.setLocation(179,122);
        kasur.setLocation(183,111);
        kasur.setLocation(110,120);
        kasur.setLocation(104,99);
        kasur.setLocation(176,107);
        kasur.setLocation(178,112);
        kasur.setLocation(178,109);
        Kasur kasur2 = new Kasur();
        addObject(kasur2,374,110);
        kasur2.setLocation(281,109);
        Kasur kasur3 = new Kasur();
        addObject(kasur3,426,133);
        kasur3.setLocation(381,110);
        Kasur kasur4 = new Kasur();
        addObject(kasur4,310,284);
        kasur4.setLocation(173,278);
        kasur2.setLocation(284,102);
        kasur2.setLocation(275,115);
        kasur2.setLocation(283,106);
        Kasur kasur5 = new Kasur();
        addObject(kasur5,487,261);
        kasur5.setLocation(282,277);
        kasur4.setLocation(176,272);
        kasur4.setLocation(178,282);
        kasur4.setLocation(178,278);
        kasur4.setLocation(178,278);
    }
}
