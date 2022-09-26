class Point {
    private int x, y;

    public Point() {
        this.x  = this.y = 0;
    } //end of Point

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    } //end of Point

    /* public void set(int x, int y) {
        this.x = x;
        this.y = y;
    } //end of set */

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
} //end of Point

class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y); //Point의 생성자 Point(x, y)를 호출
        this.color = color;
    } //end of ColorPoint
//    public void setColor(String color) {
//        this.color = color;
//    } //end of setColor
    public void showColorPoint() {
        System.out.println(color);
        showPoint(); //Point 클래스의 좌표 출력 메서드
    } //end of showColorPoint
} //end of ColorPoint
public class ColorPointEx {
    public static void main(String[] args) {
    Point p = new Point();
//    p.set(1, 2);
    p.showPoint();

    ColorPoint cp = new ColorPoint(5, 6, "blue");
    //ColorPoint(int x, int y, String color); 생성을 이용
    //다시 Point(int x, int y) 생성자를 호출
    //cp.set(3, 3);
    //cp.setColor("red");
    cp.showColorPoint();
    } //end of main
} //end of ColorPointEx