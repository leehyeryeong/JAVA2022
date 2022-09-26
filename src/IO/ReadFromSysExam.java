package IO;

import java.io.IOException;

public class ReadFromSysExam {
    public static void main(String[] args) {
        byte b[] = new byte[1024];
        int len = 0;
        try {
            len = System.in.read(b);
            System.out.write(b, 0, len);
        } catch(IOException e) {
            System.out.println("입력 실패");
        } //end of try catch
    } //end of main
} //end of IO.ReadFromSysExam