package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 2; // 상속 관계 or 같은 패키지면 부를 수 있음
        // defaultValue = 3; 다른 패키지에서 접근 불가, 컴파일 오류
        // privateValue = 4; 다른 패키지, 클래스에서 접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); // 상속 관계 or 같은 패키지면 부를 수 있음
        // defaultMethod(); 다른 패키지에서 접근 불가, 컴파일 오류
        // privateMethod(); 다른 패키지, 클래스에서 접근 불가, 컴파일 오류

        printParent();
    }
}
