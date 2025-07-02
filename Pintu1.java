import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pintu1 extends Pintu {
    public Pintu1() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 14, image.getHeight() / 14);
        setImage(image);
    }

    public void act() {
        if (isTouching(Player.class)) {
            Player p = (Player)getOneIntersectingObject(Player.class);
            World current = getWorld();

            // Jika masih di HalamanDepan, masuk ke AulaUtama
            if (current instanceof HalamanDepan) {
                AulaUtama nextWorld = new AulaUtama();
                nextWorld.addObject(p, 530, 200);
                Greenfoot.setWorld(nextWorld);
            }

            // Jika di world lain, dan menyentuh pintu keluar
            else {
                if (p.getKunciDapat() >= 2) {
                    if (p.getBonekaDidapat()) {
                        Greenfoot.setWorld(new GameWin());
                    } else {
                        Greenfoot.setWorld(new BadEnding());
                    }
                }
            }
        }
    }
}
