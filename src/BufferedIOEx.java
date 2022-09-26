import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedIOEx {
    public static void main(String[] args) {
        FileReader fin = null;
        int c;
        try {
            fin = new FileReader("test2.txt");
            BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
            while((c = fin.read()) != -1) {
                out.write(c);
            } //end of while
            //파일 데이터가 모두 출력된 상태
            //new Scanner(System.in).nextLine(); //엔터키를 입력하면 출력
            out.flush(); //버퍼에 남아있는 문자 모두 출력
            out.close();
            fin.close();
        } catch(IOException e) {
            e.printStackTrace();
        } //end of try catch
    } //end of main
} //end of BufferedIOEx