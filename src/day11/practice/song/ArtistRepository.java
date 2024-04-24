package day11.practice.song;


import day12.io.FileExample;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 가수 객체 여러개를 관리 (조회, 수정, 삭제, 생성, ...)
public class ArtistRepository {

    // 세이브파일 위치 경로
    public static final String SAVE_PATH = FileExample.ROOT_PATH + "/hello/song.sav";

    // 가수들을 담을 자료구조를 선언
    // key: 가수이름 value: 가수객체(가수명, 노래리스트)
    private Map<String, Artist> artistMap;

    public ArtistRepository() {
        this.artistMap = new HashMap<>();
    }

    public Map<String, Artist> getArtistMap() {
        return artistMap;
    }

    public void setArtistMap(Map<String, Artist> artistMap) {
        this.artistMap = artistMap;
    }

    // 가수 정보 생성
    public boolean makeArtist(String artistName, String songName) {
        if (!artistMap.containsKey(artistName)) {
            Set<String> songList = new HashSet<>(Set.of(songName));
            Artist artist = new Artist(artistName, songList);
            artistMap.put(artistName, artist);
        } else {
            return artistMap.get(artistName).getSongList().add(songName);
        }
        return true;
    }

    // 가수 정보 탐색
    public Artist findSong(String artistName) {
        return artistMap.get(artistName);
    }


    public void save() {
        try (FileOutputStream fos = new FileOutputStream(SAVE_PATH)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(artistMap);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void load() {
        File file = new File(SAVE_PATH);
        if (file.exists()) {
            try (FileInputStream fis = new FileInputStream(SAVE_PATH)) {
                ObjectInputStream ois = new ObjectInputStream(fis);
                this.artistMap = (Map<String, Artist>) ois.readObject();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
