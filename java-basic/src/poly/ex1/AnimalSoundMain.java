package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        Caw caw = new Caw();
        Caw caw1 = new Caw();
        Caw caw2 = new Caw();

//        Caw [] cawArr = {dog,cat,caw};
        Caw[] cawArr = {caw,caw1,caw2};

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

//        soundCaw(cat);  //incompatible types
        soundCaw(caw);


    }

    private static void soundCaw(Caw caw){

        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
