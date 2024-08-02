package inheritance.polymorphism.typecasting;

public class InstanceOfMain {

    public static void main(String[] args) {

        Parent parent1 = new Parent();
        System.out.println("-- Parent1 호출 --");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("-- Parent2 호출 --");
        call(parent2);
    }

    private static void call(Parent parent) {
        if (parent instanceof Child child) { // parent 가 Child 의 인스턴스인지 확인
            System.out.println("Child의 인스턴스 맞음");
            // Child child = (Child) parent; // Java 16 부터 instanceOf 검증과 동시에 변수 선언 가능
            child.childMethod();
        } else {
            System.out.println("Child의 인스턴스 아님");
        }
    }
}
