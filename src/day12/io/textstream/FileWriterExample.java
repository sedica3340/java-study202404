package day12.io.textstream;

import day12.io.FileExample;
import util.SimpleInput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {

        String targetPath = FileExample.ROOT_PATH + "/hello/hobby.txt";

        try (FileWriter fw = new FileWriter(targetPath)){
            String hobby = SimpleInput.input("취미를 입력하세요 !! \n>>");
            String outputMessage = String.format("내 취미는 %s입니다.\n", hobby);
            fw.write(outputMessage);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
