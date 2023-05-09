package javademo.filedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PrintOnlyFile {
    public static void main(String[] args) {

        File dir = new File("C:\\Users\\duan9\\Desktop");

        if (!dir.exists()) {
            System.out.println("Wrong Path.");
            return;
        }

        for (File f : dir.listFiles()) {
            if (f.isFile()) {
                System.out.println(f.getName());
            }
        }
    }
}
