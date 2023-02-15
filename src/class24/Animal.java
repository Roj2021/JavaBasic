package class24;

public abstract class Animal {
    /*
    define the speak eat methods and create subclasses and override the speak eat methods

     */
   abstract void speak();


}
class Dog extends Animal{

    @Override
    void speak() {
        System.out.println("Wuff wuff");
    }
}
class Cat extends Animal{

    @Override
    void speak() {
        System.out.println("Meow meow");
    }
}
