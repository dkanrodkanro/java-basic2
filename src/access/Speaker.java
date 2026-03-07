package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        if (volume <= 0) {
            System.out.println("최저 음량입니다.");
        } else {
            volume -= 10;
            System.out.println("volumeDown 호출");
        }
    }

    void showCurrentVolume() {
        System.out.println("현재 음량: " + volume);
    }
}
