abstract class Calculator {
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
} //end of Calculator
public class GoodCalc extends Calculator {
    @Override
    public int add(int a, int b) {
        return a+b;
    } //end of add

    @Override
    public int subtract(int a, int b) {
        return a-b;
    } //end of subtract

    @Override
    public double average(int[] a) {
        double sum  = 0;
        for(int i = 0; i<a.length; i++) {
            sum += a[i];
        } //end of for
        return sum/a.length;
    } //end of average

    public static void main(String[] args) {
        GoodCalc c = new GoodCalc();
        System.out.println(c.add(2, 3));
        System.out.println(c.subtract(2, 3));
        System.out.println(c.average(new int[] {2, 3, 4}));
    } //end of main
} //end of GoodCalc