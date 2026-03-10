package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        // 이게 되는 이유가 자식 인스턴스를 만들면 그 안에 부모도 같이 만들어진다. 그래서 부모 타입의 변수는 자식 인스턴스
        // 안에 있는 부모 인스턴스를 가리키면 된다. 그 대신 자식 타입의 변수(여기선 childMethod())를 못쓴다.
        // 이제 역으로 자식 변수가 부모 인스턴스를 참조하려고 하면 당연히 안된다. 부모 인스턴스에는 부모밖에 없다.
        // 그럼 당연히 자식 타입 변수가 부모 인스턴스를 가져올 수 없다. 그리고 부모 클래스에는 자기 자식 클래스가 누구인지
        // 알려줄 코드가 없다. 코드가 없으니 자기 자식을 찾아갈 수도 없다. 그래서 자식 클래스의 메소드를 쓰려고 하면
        // 컴파일 오류난다.
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        // poly.childMethod(); 이거 오류난다.
    }
}
