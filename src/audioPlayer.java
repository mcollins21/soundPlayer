package src;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class audioPlayer {
    public static void main(String[] args) {
        try {
            File audioFile = new File("audio.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(audioFile));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            System.err.println("Error playing audio: " + e.getMessage());
        }
    }
}
