public class SubstringExam {
    public static void main(String[] args) {
        String strData1 = "I Love You";
        String strData3;
        strData3 = strData1.substring(7);
        System.out.println(7);
        //start부터 end-1까지 문자열을 리턴
        System.out.println("strData3.substring(7) -> " + strData3);
        strData3 = strData1.substring(2, 5);
        System.out.println("strData3.substring(2, 5) -> " + strData3);
    } //end of main
} //end of SubstringExam