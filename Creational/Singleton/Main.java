package st;

public class Main {
    public static void main(String[] args) {
        AudioDriverService audioDriverService = AudioDriverService.getInstance();
        audioDriverService.playAudio();
        System.out.println("Is playing: " + audioDriverService.isPlaying());
        audioDriverService.stopAudio();
        System.out.println("Is playing: " + audioDriverService.isPlaying());
    }
}