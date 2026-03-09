package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a) {
        super(); // 생성자를 안 만들어서 자바에서 기본 생성자 만들어줄 때는 super();이거 안 써도 됨. 자바에서 알아서
        // 만들어줌. 근데 개발자가 생성자를 직접 만들면 이걸 써줘야함. 이걸 안 써주면 부모 생성자를 호출안해서 컴파일 오류
        // 생긴다고 함.
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }
}
