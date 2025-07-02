import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pintu2 extends Pintu {
    public Pintu2() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 20, image.getHeight() / 20);
        setImage(image);
    }

    public void act() {
        if (isTouching(Player.class)) {
            Player p = (Player) getOneIntersectingObject(Player.class);

            if (getWorld() instanceof AsramaAnak) {
                AulaUtama nextWorld = new AulaUtama();
                nextWorld.addObject(p, 80, 200);
                Greenfoot.setWorld(nextWorld);
            } else {
                AsramaAnak nextWorld = new AsramaAnak();
                nextWorld.addObject(p, 530, 200);
                Greenfoot.setWorld(nextWorld);
            }
        }
    }
}

