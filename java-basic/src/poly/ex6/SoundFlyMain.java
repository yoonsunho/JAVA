package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

//        flyAnimal(dog);
        flyAnimal(bird);
        flyAnimal(chicken);
    }

    //동물이 추가 되얻도 변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 st");
        animal.sound();
        System.out.println("동물 소리 테스트 end");
    }
    
    //fly인텊 ㅔ이스가 있으면 사용 가능
    private static  void flyAnimal(Fly fly){
        System.out.println("날기 테스트 시작");
        fly.fly();
    }
}
