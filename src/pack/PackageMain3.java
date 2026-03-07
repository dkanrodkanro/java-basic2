package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
        // 경로가 다른데 이름이 같으면 하나는 임포트할 수 있는데 하나는 임포트 못해서 경로 일일이 다 적어줘야 함.
    }
}
