package IO;

import java.io.IOException;
import java.io.InputStream;

public class InputExam {
    public static void streamTest(InputStream is) {
        try {
            while(true) {
                int i = is.read();
                if(i == -1) break;
                char c = (char)i;
                System.out.print(c);
            } //end of while
        } catch(IOException e) {
            System.out.println(e);
        } //end of try catch
        System.out.println();
    } //end of streamTest
    public static void main(String[] args) {
        streamTest(System.in);
    } //end of main
} //end of IO.InputExam