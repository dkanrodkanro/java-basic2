package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("Parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("Parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod() 실행
        // 자바 16부터 추가된 기능으로 패턴 매칭 인스턴스오브라는 기능이 있다.
        // CastingMain5.java 파일과 비교해보면 안다.
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}
