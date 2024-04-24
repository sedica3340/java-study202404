package day12.io;

import java.io.File;

public class FileExample {

    public static final String ROOT_PATH = "C:/Users/tjdwl/Desktop";

    public static void main(String[] args) {


        // 폴더 생성 명령
        // 파일 정보 객체 생성
        File directory = new File(ROOT_PATH + "/hello");

        if(!directory.exists()) directory.mkdir();

        File newFile = new File(ROOT_PATH + "/hello/food.txt");

        if(!newFile.exists()) {
            try {
                newFile.createNewFile();
            } catch (Exception e) {
                System.out.println("파일 생성에 실패했습니다.");
            }
        }


    }
}
