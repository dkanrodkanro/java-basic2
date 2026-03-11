package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    /* 이게 무슨 소리냐면 soundAnimal 메소드의 매개변수는 Animal animal이다. 메인 메소드에서 soundAnimal 메소드를
    호출할 때 매개변수로 dog, cat, caw를 넣는데 이 변수들이 참조하는 인스턴스는 각각 Dog, Cat, Caw 클래스다.
    이 클래스들은 모두 Animal 클래스를 참조하고 있는데 이 말은 soundAnimal 메소드의 매개변수로 들어가는 값들이
    Animal animal = new Dog(), new Cat(), new Caw();라는 말이다. 그럼 이건 업캐스팅일까 다운캐스팅일까?
    부모 클래스의 변수에 자식 클래스의 인스턴스를 담는 업캐스팅이다. Animal의 자식인 Dog, Cat, Caw는 sound 메서드를
    오버라이딩했으므로 원래 animal.sound();하면 Animal 클래스의 sound() 메서드가 실행되야 하지만 Dog, Cat, Caw
    클래스의 sound() 메서드를 실행한다.
     */
    // 타입을 맞추니까 하나의 메서드에서 실행 가능하고, 메서드 오버라이딩으로 각각의 메서드를 실행 가능하다.
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
