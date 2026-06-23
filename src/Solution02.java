// 클래스, 객체, 인스턴스
public class Solution02 {
    // 진입점
    public static void main(String[] args) {
        // 인스턴스
        Car firstCar = new Car();
        firstCar.model = "테슬라";

        Car secondCar = new Car();
        secondCar.model = "제네시스";

        System.out.println("firstCar.model = " + firstCar.model);
        System.out.println("secondCar.model = " + secondCar.model);
        // 다른 인스턴스들은 각각 구분된 멤버변수 영역을 가진다

        firstCar.accelerate();
        firstCar.accelerate();
        secondCar.accelerate();
        System.out.println("firstCar.speed = " + firstCar.speed);
        System.out.println("secondCar.speed = " + secondCar.speed);
        System.out.println(firstCar == secondCar);

        Car thirdCar = firstCar;
        System.out.println(firstCar == thirdCar);

    }
}

class Car {
    String model; // 멤버변수, 필드, ...
    int speed;

    // 메서드 -> 클래스 설계에 포함되어서 static 형태 (클래스) 또는 인스턴스를 통해 호출 되는 함수
    void accelerate() {
        speed += 10;
    }
}