//  Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.
public class Main {
    public static void main(String[] args) {
        //make instance of class
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();


        // call

        animal.makeSound();
        bird.makeSound();
        cat.makeSound();
    }
}