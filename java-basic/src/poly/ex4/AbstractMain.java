package poly.ex4;

public class AbstractMain {

    public static void main(String[] args) {
        //추상 클래스 생성 불가
//        AbstractAnimal abstractAnimal = new AbstractAnimal();


        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);
    }

    //동물이 추가 되얻도 변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 st");
        animal.sound();
        System.out.println("동물 소리 테스트 end");
    }

    //동물이 추가 되얻도 변하지 않는 부분
    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 st");
        animal.move();
        System.out.println("동물 이동 테스트 end");
    }
}
