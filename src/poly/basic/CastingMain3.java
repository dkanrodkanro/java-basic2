package poly.basic;

// upcasting vs downcasting
public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업캐스팅은 앞에 (Parent) 생략 가능, 오히려 생략을 권장한다.
        // 앞에 (Parent)는 무조건 들어가야 한다. 자바가 자동으로 캐스팅 해주냐(생략을 해도 되냐) 안 해주냐(생략을
        // 하면 안되냐)의 차이이다.
        Parent parent2 = child; // 생략 가능

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
