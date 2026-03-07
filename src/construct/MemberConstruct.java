package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 아래가 바로 생성자다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 파라미터를 다르게하면 생성자를 추가할 수 있다.
    MemberConstruct(String name, int age) {
        this(name, age, 1);
    }
}
