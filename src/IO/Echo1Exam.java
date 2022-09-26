package IO;

import java.io.IOException;

public class Echo1Exam {
    public static void main(String[] args) {
        int bt;
        try {
            bt = System.in.read();
            System.out.println((char)bt);
        } catch(IOException e) {
            System.out.println(e);
        } //end of try catch
    } //end of main
} //end of IO.Echo1Exam