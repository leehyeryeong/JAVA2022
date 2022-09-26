import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
        byte b[] = new byte[6];             //비어있는 byte 배열 선언
        try {
            FileInputStream fin = new FileInputStream("test.out");
            int n = 0, c;
            while((c = fin.read()) != -1) {   //파일의 끝(EOF)
                b[n] = (byte)c;             //읽은 바이트를 배열에 저장
                n++;
            } //end of while
            System.out.println("test.out에서 읽은 배열을 출력합니다.");
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i]+" ");
            } //end of for
            fin.close();
        } catch (IOException e) {
            System.out.println("test.out에서 읽지 못했습니다. 경로를 확인해주세요.");
        } //end of try catch
    } //end of main
} //end of FileInputStreamEx