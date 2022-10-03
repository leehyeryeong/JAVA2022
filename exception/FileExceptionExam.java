package src.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExceptionExam {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("test.java");
        } catch (FileNotFoundException e) {
            System.out.println("e.toString(): "+e.toString());
        }
    }
}
