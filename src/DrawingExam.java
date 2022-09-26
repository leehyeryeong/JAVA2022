class Shapes {
    public void draw() {
        System.out.println("도형 그리기");
    }
}
class Circles extends Shape {
    private String type = "원";
    public void draw() {
        System.out.println(type+" 그리기");
    }
    public void painting() {
        System.out.println("색 칠하기");
    }
}
public class DrawingExam {
    public static void main(String[] args) {
        Circles c = new Circles();
        c.draw();
        Shape s = new Shape();
        s.draw();
//      s.painting();
    }
}