package class24;

public class AnimalTester {
    public static void main(String[] args) {

        Animal [] arr={new Cat(),new Dog()};
        for(Animal animal:arr){
            animal.speak();
            animal.speak();
        }
    }
}
