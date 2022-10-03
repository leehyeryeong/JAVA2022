package src.exception;

public class NullPointExam {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println("문자열: "+str.length());
        } catch (NullPointerException e) {
            System.out.println("e.toString(): "+e.toString());
        } finally {
            System.out.println("무조건 실행");
        }
    }
}
