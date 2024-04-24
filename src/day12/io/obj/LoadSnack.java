package day12.io.obj;

import day12.io.FileExample;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class LoadSnack {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream(FileExample.ROOT_PATH + "/hello/snack.sav")) {

            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Snack> snackList = (List<Snack>) ois.readObject();

            System.out.println(snackList);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
