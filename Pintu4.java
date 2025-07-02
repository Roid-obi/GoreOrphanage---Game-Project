import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import greenfoot.*;

public class Pintu4 extends Pintu {
    public Pintu4() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 20, image.getHeight() / 20);
        setImage(image);
    }

    public void act() {
        if (isTouching(Player.class)) {
            Player p = (Player) getOneIntersectingObject(Player.class);

            if (getWorld() instanceof Gudang) {
                AulaUtama nextWorld = new AulaUtama();
                nextWorld.addObject(p, 300, 120);
                Greenfoot.setWorld(nextWorld);
            } else {
                Gudang nextWorld = new Gudang();
                nextWorld.addObject(p, 300, 280);
                Greenfoot.setWorld(nextWorld);
            }
        }
    }
}