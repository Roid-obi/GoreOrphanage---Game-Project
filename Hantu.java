import greenfoot.*; 

public class Hantu extends Actor {
    public void act() {
        if (isPlayerNearby()) {
            chasePlayer();
        } else {
            moveRandom();
        }
    }

    protected void moveRandom() {
        move(1);
        if (Greenfoot.getRandomNumber(100) < 10) turn(Greenfoot.getRandomNumber(90) - 45);
    }

    protected boolean isPlayerNearby() {
        Player player = (Player)getOneObjectAtOffset(0, 0, Player.class);
        if (player != null) return true;
        for (int dx = -100; dx <= 100; dx += 20) {
            for (int dy = -100; dy <= 100; dy += 20) {
                if (getOneObjectAtOffset(dx, dy, Player.class) != null) return true;
            }
        }
        return false;
    }

    protected void chasePlayer() {
        Player player = (Player)getWorld().getObjects(Player.class).get(0);
        turnTowards(player.getX(), player.getY());
        move(2);
    }
}
