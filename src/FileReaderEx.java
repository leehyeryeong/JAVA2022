import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        FileReader in = null;
        try {
            in = new FileReader("c:\\windows\\system.ini");
            int c;
            while((c = in.read()) != -1) {
                //한문자씩 파일 끝까지 읽는다.
                System.out.print((char)c);
            }
            in.close();
        }catch (IOException e) {
            System.out.println("입출력 오류");
        } //end of try
    } //end of main
} //end of FileReaderEx