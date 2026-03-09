package extends1.super2;

public class ClassC extends ClassB{
    public ClassC() {
        super(10, 20); // 부모 클래스에 기본 생성자가 없으면 개발자가 직접 정의를 해줘야 한다.
        System.out.println("ClassC 생성자");
    }
}
