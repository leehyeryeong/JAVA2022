package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderExam {
    public static void main(String[] args) {
        String a = "", b = "";
        int sum = 0;
        float average = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter the string(정수) > ");
            a = in.readLine();
            System.out.print("Enter the stinrg(정수) > ");
            b = in.readLine();
        } catch(IOException e) {
            System.out.println(e);
        } //end of try catch
        System.out.println("your input is "+a+", "+b);
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        sum = c+d;
        average = (float)sum/2;
        System.out.println(a+" + "+b+" = "+sum);
        System.out.println("평균 = "+average);
    } //end of main
} //end of BufferedReaderExam