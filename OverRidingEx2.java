class Animal {
    public void bark() {
        System.out.println("동물이 내는 소리");
    }
}
class Cat extends Animal {
    public void bark() {
        System.out.println("야옹");
    }
}
class Dog extends Animal {
    public void bark() {
        super.bark();
        System.out.println("멍멍");
    }
}
public class OverRidingEx2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.bark();
        Cat c = new Cat();
        c.bark();
        Dog d = new Dog();
        d.bark();
    }
}
