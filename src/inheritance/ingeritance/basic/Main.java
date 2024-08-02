package inheritance.ingeritance.basic;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.move();
        car.stop();

        GasCar gasCar = new GasCar();

        gasCar.move(); // 부모 클래스의 메소드 오버라이드
        gasCar.stop(); // 부모 클래스의 메소드 호출
        gasCar.fillUp(); // 자식 클래스에서 메소드 확장

        ElectricCar electricCar = new ElectricCar();

        electricCar.move(); // 부모 클래스의 메소드 오버라이드
        electricCar.stop(); // 부모 클래스의 메소드 호출
        electricCar.charge(); // 자식 클래스에서 메소드 확장
    }
}
