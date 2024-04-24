package day12.io.textstream;

import day06.member.Member;
import day12.io.FileExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderExample {

    public static void main(String[] args) {

        String targetPath = FileExample.ROOT_PATH + "/hello/member.txt";
        try (FileReader fr = new FileReader(targetPath)) {


            BufferedReader br = new BufferedReader(fr);

            List<Member> memberList = new ArrayList<>();

            for (; true; ) {
                String s = br.readLine();
                if (s == null) break;
                String[] split = s.split(",");
                Member member = new Member(
                        split[0],
                        split[2],
                        split[1],
                        split[3],
                        Integer.parseInt(split[4])
                );
                memberList.add(member);
            }
            System.out.println(memberList);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
