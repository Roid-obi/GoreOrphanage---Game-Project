import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Gudang extends GameWorld {

    public Gudang() {    
        super(600, 400, 1);
        prepare();
    }

    private void prepare() {
        // Tambahkan hantu
        Hantu1 hantu1 = new Hantu1();
        addObject(hantu1, 57, 343);

        Hantu2 hantu2 = new Hantu2();
        addObject(hantu2, 486, 103);

        // Tambahkan BukuLama hanya jika belum diambil
        if (!GameWorld.bukuLamaDiambil) {
            BukuLama bukuLama = new BukuLama();
            addObject(bukuLama, 81, 83);
        }

        // Tambahkan Boneka hanya jika belum diambil
        if (!GameWorld.bonekaDiambil) {
            Boneka boneka = new Boneka();
            addObject(boneka, 59, 341);
        }

        // Tambahkan pintu
        Pintu4 pintu4 = new Pintu4();
        addObject(pintu4, 311, 384);

        
        // tidak ditambahkan new Player() di sini
        // karena Player akan dibawa dari world sebelumnya
    }
}
