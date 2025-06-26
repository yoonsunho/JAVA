package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        Animal [] animals = {new Dog(), new Cat(), new Caw(), new Duck()};
        
        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    //동물이 추가 되얻도 변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 st");
        animal.sound();
        System.out.println("동물 소리 테스트 end");
    }

}
