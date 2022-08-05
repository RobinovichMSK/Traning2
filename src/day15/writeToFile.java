package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class writeToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFile");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Test stroki-1");
        pw.println("Test stroki-2");

        pw.close();
    }
}
