package inheritance.ingeritance.contructor;

public class Child extends Parent {

    public Child() {
        this(0); // this() 도 사용 가능하나 상속관계에 있는 생성자는 언젠가 한번은 반드시 부모의 생성자를 호출 해야 함
    }

    public Child(int a) {
        super();
        System.out.println("자식 생성자 호출 : " + a);
    }

    public Child(int a, int b) { // super() 는 생략 가능
        System.out.println("자식 생성자 호출 : " + a + " + " + b + " = " + a+b);
    }
}
