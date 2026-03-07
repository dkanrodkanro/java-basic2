package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        // 어디든 public 호출 가능
        accessData.publicField = 1;
        accessData.publicMethod();

        // 같은 패키지 default 호출 가능
        accessData.defaultField = 2;
        accessData.defaultMethod();

        // 같은 패키지 private 호출 불가능
        // accessData.privateField = 3;오류남
        // accessData.privateMethod();오류남

        accessData.innerAccess();
        // innerAccess 자체는 public 메소드니까 호출이 된다. 근데 innerAccess안에 있는 private 들은 왜
        // 호출이 되냐면 그 private 들은 외부의 AccessInnerMain 클래스에서 호출하는게 아니다. 같은 클래스 내에 있는
        // innerAcceess 메소드에서 호출한거다. 그래서 호출이 된다.
    }
}
