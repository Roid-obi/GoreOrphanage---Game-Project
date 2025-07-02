import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class AulaUtama extends GameWorld {
    public AulaUtama() {
        super(600, 400, 1);
        prepare();
    }
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pintu1 pintu1 = new Pintu1();
        addObject(pintu1,541,219);
        pintu1.setLocation(541,211);
        Pintu2 pintu2 = new Pintu2();
        addObject(pintu2,208,115);
        pintu2.setLocation(305,50);
        Pintu3 pintu3 = new Pintu3();
        addObject(pintu3,203,223);
        pintu3.setLocation(56,205);
        Pintu4 pintu4 = new Pintu4();
        addObject(pintu4,356,344);
        pintu4.setLocation(302,346);
        pintu1.setLocation(550,199);
        pintu4.setLocation(233,316);
        pintu4.setLocation(306,360);
        pintu2.setLocation(319,59);
        pintu1.setLocation(614,207);
        pintu1.setLocation(624,218);
        pintu1.setLocation(667,219);
        pintu4.setLocation(272,370);
        pintu4.setLocation(230,402);
        pintu2.setLocation(308,-68);
        pintu2.setLocation(318,4);
        pintu2.setLocation(323,47);
        pintu2.setLocation(316,28);
        pintu2.setLocation(336,23);
        pintu2.setLocation(324,38);
        pintu2.setLocation(288,19);
        pintu4.setLocation(241,369);
        pintu4.setLocation(300,423);
        pintu4.setLocation(283,368);
        pintu4.setLocation(296,402);
        pintu4.setLocation(320,433);
        pintu4.setLocation(311,416);
        pintu4.setLocation(316,416);
        pintu4.setLocation(313,400);
        pintu4.setLocation(222,396);
        pintu4.setLocation(231,402);
        pintu4.setLocation(357,325);
        pintu4.setLocation(388,413);
        pintu4.setLocation(406,372);
        pintu4.setLocation(364,402);
        pintu4.setLocation(345,412);
        pintu4.setLocation(272,378);
        pintu3.setLocation(-14,175);
        pintu3.setLocation(16,182);
        pintu3.setLocation(14,211);
        pintu3.setLocation(21,215);
        pintu4.setLocation(295,377);
        pintu1.setLocation(572,199);
        pintu1.setLocation(614,200);
        pintu1.setLocation(601,188);
        pintu1.setLocation(606,186);
        pintu1.setLocation(604,187);
        pintu1.setLocation(572,184);
        pintu1.setLocation(581,190);
        pintu1.setLocation(590,192);
        pintu1.setLocation(592,193);
        pintu4.setLocation(293,380);
        pintu4.setLocation(284,400);
        pintu4.setLocation(283,372);
        pintu4.setLocation(332,385);
        pintu4.setLocation(343,387);
        pintu4.setLocation(343,384);
        pintu4.setLocation(326,370);
        pintu4.setLocation(316,377);
        pintu4.setLocation(308,385);
        pintu4.setLocation(302,380);
        pintu4.setLocation(305,380);
        pintu4.setLocation(276,400);
        pintu4.setLocation(260,392);
        pintu2.setLocation(291,15);
        pintu2.setLocation(292,1);
        pintu2.setLocation(308,7);
        pintu2.setLocation(266,-6);
        Player player = new Player();
        addObject(player,330,187);
        player.setLocation(439,195);
        player.setLocation(442,196);
        player.setLocation(357,210);
        player.setLocation(356,203);
        pintu4.setLocation(117,192);
        pintu3.setLocation(287,380);
        pintu4.setLocation(47,213);
        pintu2.setLocation(118,220);
        pintu4.setLocation(310,15);
        pintu2.setLocation(47,199);
        pintu4.setLocation(306,15);
        pintu4.setLocation(294,1);
        pintu4.setLocation(313,41);
        pintu2.setLocation(37,188);
        pintu2.setLocation(35,209);
        pintu2.setLocation(26,219);
        pintu4.setLocation(308,17);
        pintu4.setLocation(316,7);
        pintu2.setLocation(21,175);
        pintu2.setLocation(23,189);
        pintu3.setLocation(285,360);
        pintu3.setLocation(272,406);
        pintu3.setLocation(257,396);
        pintu3.setLocation(300,412);
        pintu3.setLocation(185,416);
        pintu3.setLocation(279,384);
        pintu3.setLocation(227,397);
        pintu3.setLocation(241,388);
        player.setLocation(340,191);
        removeObject(player);
    }
}