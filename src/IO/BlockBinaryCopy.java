package IO;

import javax.crypto.spec.PSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BlockBinaryCopy {
    public static void main(String[] args) {
        File src = new File("C:\\Windows\\Web\\Wallpaper\\Theme1\\img2.jpg");
        File dest = new File("copy_img2.jpg");

        try {
            FileInputStream fi = new FileInputStream(src); //입력 스트림
            FileOutputStream fo = new FileOutputStream(dest); //출력 스트림

            byte[] buf = new byte[1024*10]; //10kb 버퍼
            while(true) {
                int n = fi.read(buf); //버퍼 크기만큼 읽기. n은 실제 읽은 바이트
                fo.write(buf, 0, n); //buf[0]부터 n 바이트 쓰기
                if(n < buf.length) { break; } //버퍼 크기보다 작게 읽었다.==파일 끝에 도달했다.
            } //end of while
            fi.close();
            fo.close();
            System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사");
        } catch(IOException e) {
            System.out.println("파일 복사 오류");
        } //end of try catch
    } //end of main
} //end of BlockBinaryCopy