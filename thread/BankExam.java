package src.thread;

class Bank {
    private int money = 10000; //계좌 초기 금액
    public int getMoney() { //money 값을 return
        return this.money;
    } //end of getMoney
    public void setMoney(int money) { //money 세팅
        this.money = money;
    } //end of setMoney
    public void saveMoney(int save) { //입금
        int m = this.getMoney();
        try {
            Thread.sleep(500); //0.5초간 정지 후 실행
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        this.setMoney(m+save); //기존 예금액 + 지금 입금액
    } //end of saveMoney
    public void minusMoney(int minus) {
        int m = this.getMoney();
        try {
            Thread.sleep(500);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        this.setMoney(m-minus); //기존 예금액 - 출금액
    } //end of minusMoney
} //end of Bank
class Family1 extends Thread { //Thread 상속 받아서 구현
    public void run() { //Thread 해야 할 작업을 구현
        synchronized (BankExam.mybank) {
            BankExam.mybank.saveMoney(5000);
        }
        System.out.println("save Money(5000): "+BankExam.mybank.getMoney());
    } //end of run
} //end of Family1
class Family2 extends Thread { //Thread 상속 받아서 구현
    public void run() { //Thread 해야 할 작업을 구현
        synchronized (BankExam.mybank) {
            BankExam.mybank.minusMoney(2000);
        }
        System.out.println("minus Money(2000): "+BankExam.mybank.getMoney());
    } //end of run
} //end of Family2
public class BankExam {
    public static Bank mybank = new Bank();
    public static void main(String[] args) {
        System.out.println("원금: "+mybank.getMoney());
        Family1 f1 = new Family1();
        Family2 f2 = new Family2();

        f1.start(); //f1 스레드 시작
        try {
            Thread.sleep(200); //0.2초
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        f2.start(); //f2 스레드 시작
        try {
            Thread.sleep(200); //0.2초
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } //end of main
} //end of BankExam
