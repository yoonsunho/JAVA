package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);

    }

    public static void action(Object obj) {
        //obj.sound(); //컴파일 오류. Object에는 sound()가 없음
        // obj.move();  // 컴파일 오류. Object에는 move()가 없음

        //객체에 맞는 다운캐스팅 필요
        if(obj instanceof Dog dogg){ //다운캐스팅 한번에
            dogg.sound();
        }else if(obj instanceof Car carr){
            carr.move();
        }
    }
}
