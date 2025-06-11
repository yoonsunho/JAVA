package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(98);

        speaker.showVolume();
        speaker.volumUp();
        speaker.showVolume();
        
        //필드에 직접 접근
        //speaker.volume = 200; //private접근 오류
        speaker.showVolume();
    }
}
