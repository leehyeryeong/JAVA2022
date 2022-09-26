interface PhoneInterface {
    final int TIMEOUT = 10000; //인터페이스에 상수 필드 선언
    void sendCall(); //인터페이스에서는 abstract 생략하여도 추상 메서드로 인식
    void receiveCall(); //추상 메서드
    default void printLogo() { //default 메서드
        System.out.println("** Phone **");
    } //end of printLogo
} //end of PhoneInterface
interface MobilePhoneInterface extends PhoneInterface{
    void sendSMS(); //추상 메서드
    void receiveSMS(); //추상 메서드
} //end of MobilePhoneInterface
interface MP3Interface {
    public void play();
    public void stop();
} //end of MP3Interface
class PDA {
    public int calculate(int x, int y) {
        return x+y;
    } //end of calculate
} //end of PDA
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
    //MobilePhoneInterface의 추상 메서드 구현
    @Override
    public void sendCall() {
        System.out.println("전화를 겁니다.");
    } //end of sendCall

    @Override
    public void receiveCall() {
        System.out.println("전화를 받습니다.");
    } //end of receiveCall

    @Override
    public void sendSMS() {
        System.out.println("문자를 보냅니다.");
    } //end of sendSMS

    @Override
    public void receiveSMS() {
        System.out.println("문자를 받습니다.");
    } //end of receiveSMS

    @Override
    public void play() {
        System.out.println("음악을 틉니다.");
    } //end of play

    @Override
    public void stop() {
        System.out.println("음악을 멈춥니다.");
    } //end of stop

    public void schedule(){
        System.out.println("일정을 관리합니다.");
    } //end of schedule
} //end of SmartPhone
class SamsungPhone implements PhoneInterface {
    //PhoneInterface의 모든 추상 메서드를 구현해야 함!!!
    @Override
    public void sendCall() {
        System.out.println("띠리링");
    } //end of sendCall

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    } //end of receiveCall

    public void flash() {
        System.out.println("전화기에 불이 켜졌습니다.");
    } //end of flash
} //end of PhoneInterface
public class InterfaceEx {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo(); //인터페이스에 존재하는 디폴트 메서드
        phone.sendCall(); //삼성폰에서 재정의한 메서드
        phone.receiveCall(); //삼성폰에서 재정의한 메서드
        phone.flash(); //삼성폰에만 있는 메서드

        SmartPhone sPhone = new SmartPhone();
        sPhone.printLogo();
        sPhone.sendCall();
        sPhone.play();
        System.out.println("3과 5를 더하면 "+sPhone.calculate(3, 5)+"입니다.");
        sPhone.schedule(); //SmartPhone에 존재하는 메서드
   } //end of main
} //end of InterfaceEx