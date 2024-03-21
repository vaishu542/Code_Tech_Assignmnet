abstract class Animal5{
    abstract public void sound();
}
class Dog5 extends Animal5{
    @Override
    public void sound(){
        System.out.println("The dog says: woof woof");
    }
}
public class Q5 {
    public static void main(String[] args) {
        Animal5 dog = new Dog5();
        dog.sound();

    }
}
