package day11.practice.song;

import org.w3c.dom.ls.LSOutput;
import util.SimpleInput;

import java.util.Set;

import static util.SimpleInput.input;

// 프로그램의 입출력 처리 담당
public class ArtistView {

    private static ArtistRepository repository;

    static {
        repository = new ArtistRepository();
    }

    // 프로그램 실행
    public static void start() {
        repository.load();
        for (; true; ) {
            String userInput = menuOpen();

            switch (userInput) {
                case "1":
                    addSong();
                    break;
                case "2":
                    searchSong();
                    break;
                case "3":
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
            SimpleInput.stop();
        }
    }

    public static String menuOpen() {
        System.out.println("****** 음악 관리 프로그램 ******");
        System.out.printf("# 현재 등록된 가수: %d명\n", repository.getArtistMap().size());
        System.out.println("# 1. 노래 등록하기");
        System.out.println("# 2. 노래 정보 검색");
        System.out.println("# 3. 프로그램 종료");
        System.out.println("=============================");
        return input(">> ");
    }

    public static void addSong() {
        System.out.println("# 노래 등록을 시작합니다.");
        String artistName = input("- 가수명: ");
        String songName = input("- 노래명: ");

        boolean flag = repository.makeArtist(artistName, songName);
        if(repository.getArtistMap().get(artistName).getSongList().size() >= 2) {
            System.out.printf(flag ? "%s님의 노래목록에 %s곡이 추가되었습니다.\n" : "[%s]곡은 이미 등록된 노래입니다.\n", artistName, songName, songName);
        } else {
            System.out.printf(flag ? "%s님이 신규등록 되었습니다.\n" : "[%s]곡은 이미 등록된 노래입니다.\n", artistName, songName);
        }
        // 등록된 내용 세이브파일에 저장하기
        repository.save();
    }

    public static void searchSong() {
        outer:
        for (; true; ) {
            System.out.println("# 검색할 가수명을 입력하세요.");
            String artistName = input("- 가수명: ");
            Set<String> songList = Set.of();
            try {
                songList = repository.findSong(artistName).getSongList();
            } catch (Exception e) {
                System.out.println("존재하지 않는 가수입니다.");
                continue outer;
            }

            int i = 1;
            for (String s : songList) {
                System.out.printf("* %d. %s\n", i, s);
                i++;
            }
            break;
        }
    }
}
