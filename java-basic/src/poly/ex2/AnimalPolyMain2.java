package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Animal duck = new Duck();

        Animal [] animals = {dog, cat, caw, duck};
        
        //변하지 않는 부분
        for (Animal animal : animals) {
            System.out.println("동물 소리 테스트 st");
            animal.sound();
            System.out.println("동물 소리 테스트 end");
        }
    }

}
