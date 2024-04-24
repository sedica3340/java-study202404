package day12.io.bytestream;

import day12.io.FileExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 바이트 기반 출력 스트림 예제 : 영상, 이미지, 텍스트 등 모든 데이터 출력가능
public class FileOutputExample {

    public static void main(String[] args) {

        String message = "멍멍이는 멍멍멍 왈왈왈!\n야옹이는 냐냐냥~";


        // try with resource : close가 필요한 하드웨어 접근 코드에 대해
        // 메모리 자원 반납처리를 자동화 해주는 문법
//        FileOutputStream fos = null;
        try (FileOutputStream fos =  new FileOutputStream(FileExample.ROOT_PATH + "/hello/pet.txt")){
//            fos = new FileOutputStream(FileExample.ROOT_PATH + "/hello/pet.txt");
            fos.write(message.getBytes());
        } catch (FileNotFoundException e) {
            // root path 생성
            System.out.println("해당 경로를 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("출력에 이상이 발생했습니다.");
        } finally {
//            System.out.println("이 코드는 무조건 실행 됨");
            // 파일 입출력과 같은 코드는 하드웨어에 직접 접근하는 코드이므로
            // 보통 사용 후 메모리 정리를 해줘야 다음 실행에 문제가 생길 여지가 줄어듬
//            try {
////                fos.close();
//            } catch (IOException e) {
//                System.out.println("스트림을 닫는데 실패했을지도");
//            } catch (NullPointerException e ) {
//                System.out.println("존재하지 않는 객체입니다.");
//            }
        }

    }
}
