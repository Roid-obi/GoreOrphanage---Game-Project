import greenfoot.*;

public class Player extends Actor {
    private int kunciDapat = 0;
    private boolean bukuDiambil = false;
    private boolean bonekaDidapat = false;
    private GreenfootSound langkahSound = new GreenfootSound("langkah.mp3");

    private int frameCounter = 0;
    private boolean facingRight = true;

    public Player() {
        GreenfootImage image = new GreenfootImage("player_left.png");
        image.scale(image.getWidth() / 23, image.getHeight() / 23);
        setImage(image);
    }

    public void act() {
        movePlayer();
        checkItem();
        checkGhost();
    }

    private void movePlayer() {
        boolean moving = false;

        if (Greenfoot.isKeyDown("left")) {
            facingRight = false;
            animateWalk();
            setLocation(getX() - 3, getY());
            moving = true;
        } else if (Greenfoot.isKeyDown("right")) {
            facingRight = true;
            animateWalk();
            setLocation(getX() + 3, getY());
            moving = true;
        }

        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 3);
            animateWalk();
            moving = true;
        } else if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 3);
            animateWalk();
            moving = true;
        }

        if (moving) {
            if (!langkahSound.isPlaying()) langkahSound.play();
        } else {
            langkahSound.stop();
            GreenfootImage image = new GreenfootImage(facingRight ? "player_right.png" : "player_left.png");
            image.scale(image.getWidth() / 23, image.getHeight() / 23);
            setImage(image);
        }
    }

    private void animateWalk() {
        frameCounter++;
        String img;
        if (frameCounter % 20 < 10) {
            img = facingRight ? "player-Jalan1-right.png" : "player-Jalan1-left.png";
        } else {
            img = facingRight ? "player-Jalan2-right.png" : "player-Jalan2-left.png";
        }
        GreenfootImage image = new GreenfootImage(img);
        image.scale(image.getWidth() / 23, image.getHeight() / 23);
        setImage(image);
    }

    private void checkItem() {
        if (isTouching(Kunci1.class)) {
            removeTouching(Kunci1.class);
            kunciDapat++;
            GameWorld.kunci1Diambil = true;
        }
        if (isTouching(Kunci2.class)) {
            removeTouching(Kunci2.class);
            kunciDapat++;
            GameWorld.kunci2Diambil = true;
        }
        if (isTouching(BukuLama.class)) {
            removeTouching(BukuLama.class);
            bukuDiambil = true;
            GameWorld.bukuLamaDiambil = true;
        }
        if (isTouching(Boneka.class)) {
            removeTouching(Boneka.class);
            bonekaDidapat = true;
            GameWorld.bonekaDiambil = true;
        }
    }

    private void checkGhost() {
        if (isTouching(Hantu1.class) || isTouching(Hantu2.class)) {
            Greenfoot.setWorld(new JumpScare());
        }
    }

    public int getKunciDapat() {
        return kunciDapat;
    }

    public boolean getBukuDiambil() {
        return bukuDiambil;
    }

    public boolean getBonekaDidapat() {
        return bonekaDidapat;
    }
}