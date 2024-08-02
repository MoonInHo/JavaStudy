package inheritance.ingeritance.memory;

public class GasCar extends Car {

    @Override
    public void move() {
        System.out.println("가스차를 천천히 움직입니다.");
    }

    public void fillUp() {
        System.out.println("기름을 주유합니다");
    }
}