package inheritance.ingeritance.contructor;

public class Grandchild extends Child {

    public Grandchild(int a) {
        super(a); // 부모에 매개 변수 없는 생성자가 존재하지 않아 super 호출 생략 불가
        System.out.println("자손 생성자 호출 : " + a);
    }

    public Grandchild(int a, int b) {
        super(a, b);
        System.out.println("자손 생성자 호출 : " + a + " + " + b + " = " + a+b);
    }
}
