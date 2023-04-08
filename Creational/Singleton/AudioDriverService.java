package st;
public class AudioDriverService {
    private static AudioDriverService instance;
    private boolean isPlaying;
    private AudioDriverService() {
        isPlaying = false;
    }
    public static AudioDriverService getInstance() {
        if (instance == null) {
            instance = new AudioDriverService();
        }
        return instance;
    }
    public void playAudio() {
        isPlaying = true;
        System.out.println("Playing audio...");
    }
    public void stopAudio() {
        isPlaying = false;
        System.out.println("Stopping audio...");
    }

    public boolean isPlaying(){
        return isPlaying;
    }
}