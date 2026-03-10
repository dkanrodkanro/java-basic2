package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        // 단 자식의 기능을 호출하려고 하면 컴파일 오류가 발생한다.
        // poly.childMethod();

        // 이럴 때 다운 캐스팅을 한다.
        Child child = (Child) poly; // 참고로 poly의 참조값을 child에 복붙하는 거여서 poly는 본인의 주소값을
        // 계속 가지고 있다.
        child.childMethod();
        // 보면 알겠지만 노란줄이 생겼다. 자바에서 경고하는거다. 하지말라고, 문제 생긴다고. 하지만 할 수는 있다.
        // 근데 웬만하면 다운캐스팅 하지 마라. 런타임에서 터질수도 있다. 차라리 코드 설계를 다시짜는게 좋다.

        // 일시적 다운캐스팅(해당 메서드를 호출하는 순간만 다운캐스팅)
        ((Child) poly).childMethod();
    }
}
