abstract class Animal3{
    abstract void makeSound();
    abstract void display();
}
class Mammal3 extends Animal3{
    private String specieName;
    public Mammal3(String specieName) {
        this.specieName=specieName;
    }
    public void display(){
        System.out.println("Type : Mammal");
        System.out.println("Name :"+specieName);
    }
    @Override
    public void makeSound(){
        System.out.println("Mammal Sound");
    }
}
class Bird3 extends Animal3{
    private String specieName;
    public Bird3(String specieName) {
        this.specieName=specieName;
    }
    public void display(){
        System.out.println("Type : Bird");
        System.out.println("Name :"+specieName);
    }
    @Override
    public void makeSound(){
        System.out.println("Bird Sound");
    }

}
class Fish3 extends Animal3{
    private String specieName;
    public Fish3(String specieName) {
        this.specieName=specieName;
    }
    public void display(){
        System.out.println("Type : Fish");
        System.out.println("Name :"+specieName);
    }
    @Override
    public void makeSound(){
        System.out.println("Fish Sound");
    }
}
public class Q3 {
    public static void main(String[] args) {

//                                  For mammals
            Mammal3 mammal = new Mammal3("Lion");
            mammal.display();
            mammal.makeSound();

//                                   For Birds
        Bird3 bird = new Bird3("Parrot");
        bird.display();
        bird.makeSound();

//                                    For Fish
        Fish3 fish = new Fish3("Shark");
        fish.display();
        fish.makeSound();
    }
}
