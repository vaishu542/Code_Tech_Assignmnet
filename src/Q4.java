
import java.util.ArrayList;

class Animal {
    private String species;
    private int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Species: " + species);
        System.out.println("Age: " + age);
    }
}

class Mammal extends Animal {
    private String furColor;

    public Mammal(String species, int age, String furColor) {
        super(species, age);
        this.furColor = furColor;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fur Color: " + furColor);
    }
}

class Bird extends Animal {
    private String featherColor;

    public Bird(String species, int age, String featherColor) {
        super(species, age);
        this.featherColor = featherColor;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Feather Color: " + featherColor);
    }
}
class Fish extends Animal {
    private String scaleColor;

    public Fish(String species, int age, String scaleColor) {
        super(species, age);
        this.scaleColor = scaleColor;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Scale Color: " + scaleColor);
    }
}

class Zoo {
    private ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listAllAnimals() {
        for (Animal animal : animals) {
            animal.displayDetails();
            System.out.println();
        }
    }

    public void identifyAnimals(String type) {
        System.out.println("Animals of type " + type + ":");
        for (Animal animal : animals) {
            if (type.equals("Mammal") && animal instanceof Mammal) {
                animal.displayDetails();
                System.out.println();
            } else if (type.equals("Bird") && animal instanceof Bird) {
                animal.displayDetails();
                System.out.println();
            } else if (type.equals("Fish") && animal instanceof Fish) {
                animal.displayDetails();
                System.out.println();
            }
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addAnimal(new Mammal("Tiger", 5, "Orange"));
        zoo.addAnimal(new Bird("Eagle", 3, "Brown"));
        zoo.addAnimal(new Fish("Goldfish", 1, "Gold"));

        System.out.println("All animals in the zoo:");
        zoo.listAllAnimals();
        System.out.println();

        zoo.identifyAnimals("Mammal");
        zoo.identifyAnimals("Bird");
        zoo.identifyAnimals("Fish");
    }
}

