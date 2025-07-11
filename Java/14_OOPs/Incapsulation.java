 abstract class Animal{
    abstract void walk();
 }

 class Dog extends Animal{
    public void walk(){
        System.out.println("Dog is walking");
    }
 }
 class Cat extends Animal{
    public void walk(){
        System.out.println("Cat is walking");
    }
 }


public class Incapsulation {
 public static void main(String[] args) {
    Dog d = new Dog();  
    d.walk();
    Cat c = new Cat();
    c.walk();
 }
}
