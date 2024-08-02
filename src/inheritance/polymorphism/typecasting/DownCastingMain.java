package inheritance.polymorphism.typecasting;

public class DownCastingMain {

    public static void main(String[] args) {

        // ----- 다운 캐스팅 기초 -----
        Parent parent = new Child();
        // parent.childMethod(); // 컴파일 에러. 자식 타입 호출 불가능

        Child childInstance1 = (Child) parent; // 다운 캐스팅 -> 부모 타입을 자식 타입으로 형 변환
        childInstance1.childMethod();

        Parent childInstance2 = new Child();
        ((Child) childInstance2).childMethod(); // 일시적 다운 캐스팅

        // ----- 다운 캐스팅 문제 상황 -----
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제 없이 수행

        // Parent parent2 = new Parent();
        // Child child2 = (Child) parent2;
        // child2.childMethod(); // 예외 발생. child2 는 Child 의 타입으로 변경만 했을 뿐 인스턴스를 가지지 않음
    }
}
