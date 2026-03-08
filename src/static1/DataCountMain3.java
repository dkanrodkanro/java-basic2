package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);

        // static 변수의 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); // 이건 추천 안 한다. 왜냐하면 내가 나중에 읽든 다른 사람이 읽든
        // 이걸 보면 인스턴스 변수인지 static 변수인지 한 번에 보고 알 수 없다. 이런식으로 코드를 짜면 나중에
        // 리펙토링하거나 기능 추가할 때 변수마다 이 변수가 클래스 변수인지 인스턴스 변수인지 일일이 확인해야 한다.
        // 한마디로 클래스.변수로 작성하면 안 써도 될 시간과 노력을 써야된다. 배려해줘라. 남이 안 해줘도 난 해줘야지.

        // 클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
