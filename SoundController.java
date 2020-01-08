import greenfoot.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

/**
 * Write a description of class SoundController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoundController {
    private static Map<String, GreenfootSound> soundMapping = new HashMap<>();

    public SoundController() {
    }

    public static void startSound(String sound, boolean looped) {
        GreenfootSound soundToPlay = resolveType(sound);
        if (soundToPlay == null) {
            soundToPlay = new GreenfootSound(sound);
            soundMapping.put(sound, soundToPlay);
        }
        if (looped) {
            soundToPlay.playLoop();
        } else {
            soundToPlay.play();
        }
    }

    public static void stopSound(String sound) {
        GreenfootSound current = resolveType(sound);
        if (current.isPlaying()) {
            current.pause();
        }
    }

    public static void setVolume(String sound, int vol) {
        GreenfootSound current = resolveType(sound);
        if (current.isPlaying()) {
            current.setVolume(vol);
        }
    }

    private static GreenfootSound resolveType(String type) {
        return soundMapping.get(type);
    }

    public static void stopAllSounds() {
        Collection<GreenfootSound> allSounds = soundMapping.values();
        allSounds.forEach(sound -> sound.stop());
    }

}
