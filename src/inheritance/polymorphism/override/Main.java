package inheritance.polymorphism.override;

public class Main {

    public static void main(String[] args) {

        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); // Parent 타입으로 선언 되었으므로 Parent 의 멤버를 반환
        poly.method(); // 부모의 메소드를 자식이 오버라이딩 할 경우 오버라이딩 된 메소드가 호출의 절대적 우선권을 가짐
    }
}
