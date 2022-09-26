public class AppendExam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer(" JAVA Programmer");
        StringBuffer sb2 = new StringBuffer(" Project");
        StringBuffer str1 = null;
        StringBuffer str2 = null;
        str1 = sb1.append(" Project");
        str2 = sb1.append(sb2);
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1 = " + sb2);
        System.out.println("sb1 = " + str1);
        System.out.println("sb1 = " + str2);
        System.out.println();
    } //end of main
} //end of AppendExam