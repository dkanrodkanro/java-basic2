package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showCurrentVolume();

        speaker.volumeUp();
        speaker.showCurrentVolume();

        speaker.volumeUp();
        speaker.showCurrentVolume();

        for (int i = 0; i <= 10; i++) {
            speaker.volumeDown();
            speaker.showCurrentVolume();
        }

        // 필드에 직접 접근
        /* System.out.println("volume 필드 직접 접근 수정");
        speaker.volume = 200;Speaker.java에 있는 int volume;의 접근제어자를 private로 바꿔서 이제 외부에서 직접 접근이 안됨
        speaker.showCurrentVolume(); */

    }
}
