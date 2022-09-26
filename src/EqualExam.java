public class EqualExam {
    public static void main(String[] args) {
        String str1 = "mirim";
        String str2 = "mirim";
        String str3 = new String("highschool");
        String str4 = new String("highschool");
        String str5 = "test";
        String str6 = new String("test");

        if(str1 == str2) System.out.println("주소 같다.");
        else System.out.println("주소 다르다.");
        if(str3 == str4) System.out.println("주소 같다.");
        else System.out.println("주소 다르다.");
        if(str1.equals(str2)) System.out.println("내용 같다.");
        else System.out.println("내용 다르다.");
        if(str3.equals(str4)) System.out.println("내용 같다.");
        else System.out.println("내용 다르다.");
        //위까지 책에 있는 내용
        if(str5 == str6) System.out.println("주소 같다.");
        else System.out.println("주소 다르다.");
        if(str5.equals(str6)) System.out.println("내용 같다.");
        else System.out.println("내용 다르다.");
    } //end of main
} //end of EqualExam