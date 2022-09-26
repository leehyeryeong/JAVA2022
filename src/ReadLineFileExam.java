import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineFileExam {
    public static void main(String[] args) {
        String fname = "BufferInput.txt";
        try {
            FileReader fr = new FileReader(fname);
            BufferedReader br = new BufferedReader(fr);
            String s = "";
            while((s = br.readLine()) != null) {
                System.out.println(s);
            } //end of while
            br.close();
            fr.close();
        } catch(IOException e) {
            System.out.println(e.toString());
        } //end of try catch
    } //end of main
} //end of ReadLineFileExam