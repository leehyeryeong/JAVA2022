package IO;

import java.io.*;
import java.util.StringTokenizer;
class sungDatasExams {
    public void readingData(String fname) throws IOException {
        try {
            FileReader fr = new FileReader(new File(fname));
            BufferedReader br = new BufferedReader(fr);
            String csvStr = "";
            String tmpStr = "";
            do {
                tmpStr = br.readLine();
                if(tmpStr != null) {
                    csvStr += tmpStr + "\t";
                } //end of if
            } while(tmpStr != null);

            StringTokenizer parse = new StringTokenizer(csvStr, "\t");
            int length = parse.countTokens()/4;
            String[] name = new String[length];
            String[] address = new String[length];
            double[] math = new double[length];
            double[] English = new double[length];
            double[] total = new double[length];
            double[] avg = new double[length];
            for(int i = 0; i < length; i++) {
                name[i] = parse.nextToken();
                address[i] = parse.nextToken();
                math[i] = Double.valueOf(parse.nextToken()).doubleValue();
                English[i] = Double.valueOf(parse.nextToken()).doubleValue();
                total[i] = math[i] + English[i];
                avg[i] = total[i]/2.0;
            } //end of for1
            for(int i = 0; i < length; i++) {
                System.out.println(name[i]+"\t"+address[i]+"\t"+math[i]+"\t" +
                        English[i]+"\t"+total[i]+"\t"+avg[i]);
            } //end of for2
        } catch(IOException e) {
            System.out.println(e);
        } //end of try catch
    } //end of readingData
} //end of sungDatasExam
public class DatasMain {
    public static void main(String[] args) {
        sungDatasExams wd = new sungDatasExams();
        try {
            wd.readingData("writed.txt");
        } catch(IOException e) {
            e.printStackTrace();
        } //end of try catch
    } //end of main
} //end of DatasMain