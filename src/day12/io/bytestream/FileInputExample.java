package day12.io.bytestream;

import day12.io.FileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 바이트 기반 출력 스트림 예제 : 영상, 이미지, 텍스트 등 모든 데이터 출력가능
public class FileInputExample {

    public static void main(String[] args) {

        String message = "";


        try (FileInputStream fis = new FileInputStream(FileExample.ROOT_PATH + "/hello/pet.txt")) {
            int data = 0;
            for (; (data = fis.read()) != -1; ) {
                message += (char)data;
                System.out.write(data);
            }
                System.out.flush();
//            System.out.println(message);
        } catch (FileNotFoundException e) {
            // root path 생성
            System.out.println("해당 경로를 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("출력에 이상이 발생했습니다.");
        }

    }
}
