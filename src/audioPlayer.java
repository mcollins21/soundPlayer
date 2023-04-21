package src;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class audioPlayer {
    public static void main(String[] args) {
        try {
            File audioFile = new File("AUDIOSAMPLE.wav");
            Clip audiofile = AudioSystem.getClip();
            audiofile.open(AudioSystem.getAudioInputStream(audioFile));
            audiofile.start();
            Thread.sleep(audiofile.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            System.err.println("Error playing audio: " + e.getMessage());
        }
    }
}
