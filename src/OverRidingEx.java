class Shape { //draw() 메소드를 가지고 있다.
    //draw() 메소드는 Shape를 출력
    public Shape next;
    public Shape() {
        next = null;
    } //end of Shape
    public void draw() {
        System.out.println("Shape");
    } //end of draw
} //end of Shape
class Line extends Shape {
    @Override //컴파일러가 읽도록 하는 주석 = 어노테이션
    public void draw() {
        System.out.println("Line");
    } //end of draw
} //end of Line
//Rect
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("Rect");
    } //end of draw
} //end of Rect
//Circle
class Cir extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    } //end of draw
} //end of Circle
//Triangle
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle");
    } //end of draw
} //end of Triangle
public class OverRidingEx {
    static void paint(Shape p) {
        p.draw(); //p가 가리키는 객체 내에 오버라이딩 된 draw() 호출
    } //end of paint
    public static void main(String[] args) {
        Line line = new Line();
        paint(line); //길게 쓴 거
        paint(new Shape());
        paint(new Line()); //짧게 쓴 거
        paint(new Rect());
        paint(new Cir());
        paint(new Triangle());
    } //end of main
} //end of OverRidingEx