class Person {
    int age;
    public String name;
    protected int height;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
} //end of Person
class Student extends Person {
    public void set() {
        age = 31;       //default 멤버 접근 가능
        name = "형섭리"; //public 멤버 접근 가능
        height = 183;   //protected 멤버 접근 가능
        setWeight(82);  //weight = 82;
    } //end of set
} //end of Student
public class InheritanceEx {
    public static void main(String[] args) {

    } //end of main
} //end of InheritanceEx