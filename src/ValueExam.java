public class ValueExam {
    public static void main(String[] args) {
        String str1 = "123456";
        String strd = "123.56";
        System.out.println(Integer.valueOf(str1));
        System.out.println(Double.valueOf(strd));
        System.out.println(str1 + strd);
        System.out.println(Integer.valueOf(str1)+Double.valueOf(strd));
    } //end of main
} //end of ValueExam