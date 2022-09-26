public class Circle {
    int radius;
    String name;

    public Circle() {
        radius = 1;
        name = "";
    } //생성자 1, 반지름 1, 이름은 빈칸으로 초기화

    public Circle(int r, String n) {
        radius = r;
        name = n;
    } //생성자 2, 매개변수가 존재하는 생성자

    public Circle(int r) {
        radius = r;
    } //end of Circle

    public Circle(String n) {
        name = n;
    } //end of Circle

    public double getArea() {
        return 3.14 * radius * radius;
    } //end of getArea
    public static void main(String[] args) {
        Circle pizza = new Circle(10, "자바피자"); //선언과 동시에 초기화
        //pizza.radius = 10;
        //pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area + "입니다.");

        Circle donut = new Circle();    //Circle 클래스로 도넛 객체 생성
        //donut.radius = 2;
        //donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area + "입니다.");

        Circle circle3 = new Circle(5);
        circle3.name = "피자";
        area = circle3.getArea();
        System.out.println(circle3.name + "의 면적은 " + area + "입니다.");

        Circle circle4 = new Circle("도넛");
        circle4.radius = 7;
        area = circle4.getArea();
        System.out.println(circle4.name + "의 면적은 " + area + "입니다.");
    } //end of main
} //end of Circle