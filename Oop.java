class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
public class Oop {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        a.sound();
        d.sound();
    }
    
}
