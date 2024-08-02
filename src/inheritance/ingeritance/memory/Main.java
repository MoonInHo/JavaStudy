package inheritance.ingeritance.memory;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(); // 힙 영역에 Car 인스턴스 생성

        GasCar gasCar = new GasCar(); // 힙 영역에 Car(부모), GasCar(자식) 인스턴스 모두 생성 후 단일 객체로 묶음
        gasCar.move(); // 타입으로 지정된 인스턴스의 멤버를 먼저 확인 후 없을 경우 부모 인스턴스 메소드 확인
    }
}
