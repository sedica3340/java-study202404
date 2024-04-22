package day10.inter.practice;

// 미디어 재생을 위한 인터페이스
interface MediaPlayable {
    void play();

    void pause();

    void stop();
}

// 비디오 재생을 위한 클래스
class VideoPlayer extends MediaPlayer implements MediaPlayable {

    @Override
    public void play() {
        System.out.println("비디오가 재생됩니다.");
    }

    @Override
    public void pause() {
        System.out.println("비디오가 일시정지됩니다.");
    }

    @Override
    public void stop() {
        System.out.println("비디오 재생이 종료됩니다.");
    }
}

// 오디오 재생을 위한 클래스
class AudioPlayer extends MediaPlayer implements MediaPlayable {

    @Override
    public void play() {
        System.out.println("오디오가 재생됩니다.");
    }

    @Override
    public void pause() {
        System.out.println("오디오가 일시정지 됩니다.");
    }

    @Override
    public void stop() {
        System.out.println("오디오 재생이 종료됩니다.");
    }
}

// 이미지 디스플레이를 위한 클래스
class ImageDisplay extends MediaPlayer implements MediaPlayable {

    @Override
    public void play() {
        System.out.println("이미지 디스플레이가 재생됩니다.");
    }

    @Override
    public void pause() {
        System.out.println("이미지 디스플레이가 일시정지됩니다.");
    }

    @Override
    public void stop() {
        System.out.println("이미지 디스플레이가 종료됩니다.");
    }
}

// 미디어 플레이어 관리 클래스
class MediaPlayer {
    private MediaPlayable[] mediaList = new MediaPlayable[0];

    public void addMedia(MediaPlayable media) {
        MediaPlayable[] temp = new MediaPlayable[mediaList.length + 1];
        for (int i = 0; i < mediaList.length; i++) {
            temp[i] = mediaList[i];
        }
        temp[mediaList.length] = media;
        mediaList = temp;
    }

    public void playAll() {
        // 반복문을 통해 모든 media를 재생시킴
        for (MediaPlayable media : mediaList) {
            media.play();
        }
    }
}

// Main 클래스
public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        player.addMedia(new VideoPlayer());
        player.addMedia(new AudioPlayer());
        player.addMedia(new ImageDisplay());

        player.playAll();  // 모든 미디어 파일 재생 (각각의 play메서드 호출)
    }
}
