import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gudang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gudang extends GameWorld
{

    /**
     * Constructor for objects of class Gudang.
     * 
     */
    public Gudang()
    {    
        super(600, 400, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hantu1 hantu1 = new Hantu1();
        addObject(hantu1,463,100);
        hantu1.setLocation(94,103);
        Hantu2 hantu2 = new Hantu2();
        addObject(hantu2,468,101);
        hantu2.setLocation(485,294);
        BukuLama bukuLama = new BukuLama();
        addObject(bukuLama,430,251);
        bukuLama.setLocation(85,348);
        bukuLama.setLocation(81,332);
        Pintu4 pintu4 = new Pintu4();
        addObject(pintu4,525,227);
        pintu4.setLocation(540,216);
        pintu4.setLocation(55,193);
        pintu4.setLocation(311,84);
        pintu4.setLocation(532,303);
        hantu2.setLocation(482,104);
        hantu1.setLocation(103,344);
        bukuLama.setLocation(81,83);
        hantu1.setLocation(79,309);
        hantu2.setLocation(468,112);
        pintu4.setLocation(526,289);
        pintu4.setLocation(535,330);
        pintu4.setLocation(535,330);
        pintu4.setLocation(548,304);
        Player player = new Player();
        addObject(player,462,260);
        player.setLocation(476,280);
        player.setLocation(478,277);
        player.setLocation(446,291);
        player.setLocation(457,303);
        player.setLocation(464,306);
        hantu2.setLocation(486,103);
        pintu4.setLocation(576,313);
        pintu4.setLocation(567,308);
        Boneka boneka = new Boneka();
        addObject(boneka,265,228);
        boneka.setLocation(67,135);
        boneka.setLocation(51,349);
        boneka.setLocation(59,341);
        pintu4.setLocation(571,303);
        removeObject(player);
        pintu4.setLocation(311,384);
        hantu1.setLocation(57,343);
    }
}
