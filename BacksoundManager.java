import greenfoot.*;

public class BacksoundManager {
    public static GreenfootSound backsound = new GreenfootSound("backsound.mp3");

    public static void play() {
        if (!backsound.isPlaying()) {
            backsound.setVolume(60); // volume
            backsound.playLoop();
        }
    }

    public static void stop() {
        if (backsound.isPlaying()) {
            backsound.stop();
        }
    }
}
