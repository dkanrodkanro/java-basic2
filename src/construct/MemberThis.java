package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
        // 필드랑 파라미터가 이름이 다르면 필드 앞에 this. 안 써도 됨.
    }
}
