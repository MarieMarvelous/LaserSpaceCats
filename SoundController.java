import greenfoot.*;

/**
 * Write a description of class SoundController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoundController {
    public SoundController() {
    }

    public static void startSound(SoundType type, boolean looped) {
        GreenfootSound soundToPlay = resolveType(type);
        if (soundToPlay != null) {
            if (looped) {
                soundToPlay.playLoop();
            } else {
                soundToPlay.play();
            }
        }
    }

    public static void stopSound(SoundType type) {
        GreenfootSound current = resolveType(type);
        if (current.isPlaying()) {
            current.pause();
        }
    }
    
    public static void setVolume(SoundType type, int vol) {
        GreenfootSound current = resolveType(type);
        if (current.isPlaying()) {
            current.setVolume(vol);
        }
    }

    private static GreenfootSound resolveType(SoundType type) {
        switch (type) {
            case THUNDERSTORM:
                return new GreenfootSound("thunderstrike.mp3");
            case BACKGROUND_MUSIC:
                return new GreenfootSound("RaMxGF.mp3");
            case LASER:
                return new GreenfootSound("lasersound3.mp3");
            default:
                return null;
        }
    }
    
    public static void stopAllSounds() {
        SoundType[] allSounds = SoundType.values();
        for(int i = 0; i < allSounds.length; i++) {
            resolveType(allSounds[i]).stop();
        }
    }

}
