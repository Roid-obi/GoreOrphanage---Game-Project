import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import greenfoot.*;

public class Pintu3 extends Pintu {
    public Pintu3() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 20, image.getHeight() / 20);
        setImage(image);
    }

    public void act() {
        if (isTouching(Player.class)) {
            Player p = (Player) getOneIntersectingObject(Player.class);

            if (getWorld() instanceof DapurTua) {
                AulaUtama nextWorld = new AulaUtama();
                nextWorld.addObject(p, 270, 270);
                Greenfoot.setWorld(nextWorld);
            } else {
                DapurTua nextWorld = new DapurTua();
                nextWorld.addObject(p, 300, 120);
                Greenfoot.setWorld(nextWorld);
            }
        }
    }
}
