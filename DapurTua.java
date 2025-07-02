import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class DapurTua extends GameWorld {

    public DapurTua() {    
        super(600, 400, 1);
        prepare();
    }

    private void prepare() {
        // Tambahkan Kunci2 jika belum diambil
        if (!GameWorld.kunci2Diambil) {
            Kunci2 kunci2 = new Kunci2();
            addObject(kunci2, 506, 81);
        }

        // Tambahkan Hantu2
        Hantu2 hantu2 = new Hantu2();
        addObject(hantu2, 144, 80);

        // Tambahkan pintu kembali ke AulaUtama
        Pintu3 pintu3 = new Pintu3();
        addObject(pintu3, 312, 24);

        // tidak ditambahkan new Player() di sini
        // karena Player akan dibawa dari world sebelumnya
    }
}
