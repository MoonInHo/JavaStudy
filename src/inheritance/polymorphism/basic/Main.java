package inheritance.polymorphism.basic;

public class Main {

    public static void main(String[] args) {

        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        // poly.childMethod(); // 부모 타입으로 선언 되어 호출 불가

        // Child child1 = new Parent(); // 컴파일 에러. 자식은 부모를 담을 수 없음
    }
}
