package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수1
        final int data1;
        data1 = 10; // 최초 한 번만 할당 가능, 또 할당하려고 하면 컴파일 오류 남

        // final 지역 변수2
        final int data2 = 20;

        method(10);
    }

    static void method(final int parameter) {
        // parameter = 30; 이거 안됨 받아온거 그냥 써야 됨.
    }
}
