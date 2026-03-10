package poly.overriding;

public class OverridingMain {
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

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("vaule = " + poly.value); // 변수는 오버라이딩이 안됨
        poly.method(); // 메소드는 오버라이딩이 됨 80강 8:30을 보면 오버라이딩된 메소드가 우선권을 가진다 함.
        /* 오버라이딩은 부모 타입에서 정의한 메소드를 자식이 재정의하는 것인데, 만약 손자가 또 오버라이딩하면
        손자가 우선권을 가진다.
         */
    }
}
