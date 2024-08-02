package inheritance.polymorphism.typecasting;

public class UpCastingMain {

    public static void main(String[] args) {

        // ----- 업 캐스팅 기초 -----
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업 캐스팅 생략 가능, 생략 권장
        Parent parent2 = child; // 업 캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();

        // 상속 관계의 자식 인스턴스 생성 시 부모 타입 인스턴스도 모두 생성되므로 업 캐스팅은 안전성 보장
    }
}
