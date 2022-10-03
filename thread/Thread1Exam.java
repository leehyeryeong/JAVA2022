package src.thread;

class TopTop extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print(i+" \t");
        }
    }
}
public class Thread1Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        TopTop d = new TopTop();
        d.start();
        System.out.println("프로그램 종료");
    }
}
