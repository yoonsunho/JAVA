package access;

public class Speaker {

    private int volume;
    Speaker(int volume){
        this.volume = volume;
    }

    void volumUp(){
        volume += 10;
        System.out.println("볼륨 10 증가");
    }

    void volumeDown(){
        volume -= 10;
        System.out.println("볼륨 10 감손");
    }

    void showVolume(){
        System.out.println("현재용량 :"+volume);
    }

}
