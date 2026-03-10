package poly.basic;

// 다운캐스팅을 자바에서 자동으로 해주지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child = (Child) parent1;
        child.childMethod(); // 문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.childMethod(); // 문제 없어 보이지만 아님. 런타임 오류남. parent2는 Parent 클래스로 만든 인스턴스
        // 임. 근데 위의 parent1은 Child 클래스로 만든 인스턴스임. Child는 Parent를 상속받고 있어서 내용물에 Parent
        // 가 기본적으로 포함되어 있음. 그래서 문제가 안 생김. 하지만 parent2는 Parent 클래스로 만듬. 그리고 Parent
        // 클래스 안에는 Child가 없음. 이럴 경우 문제가 생김. parent2가 가리키는 주소에는 Child가 없음. 근데
        // 다운 캐스팅으로 강제로 Child를 가리키게 해도 없는 걸 가리키게 하니 문제가 생김
    }
}
