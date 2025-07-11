interface Animal{
    int eyes = 2;  // This is implicitly public static final
    void walk();
    void eat();
}

interface Herbivore{
    void eatPlants();
    default void describe() {
        System.out.println("I am a herbivore");
    }
}

class Dog implements Animal{
    public void walk(){
        System.out.println("Dog is walking");
    }
    
    public void eat(){
        System.out.println("Dog is eating meat");
    }
}

class Cow implements Animal, Herbivore{
    public void walk(){
        System.out.println("Cow is walking slowly");
    }
    
    public void eat(){
        System.out.println("Cow is eating");
    }
    
    public void eatPlants(){
        System.out.println("Cow is eating grass");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.walk();
        d.eat();
        
        Cow c = new Cow();
        c.walk();
        c.eat();
        c.eatPlants();
        c.describe();
        
        // Accessing interface constant
        System.out.println("Animals have " + Animal.eyes + " eyes");
    }
}

