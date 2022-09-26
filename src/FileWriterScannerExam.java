import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class FileWriterScannerExam {
    public static void main(String[] args) {
        FileWriter fin = null;
        int c;
        try {
            fin = new FileWriter("Phone.txt");
            while(true) {
                Scanner scan = new Scanner(System.in);
                System.out.println("전화번호 입력 프로그램입니다.");
            }
        } catch(IOException e) {

        } //end of try catch
    } //end of main
} //end of FileWriterScannerExam