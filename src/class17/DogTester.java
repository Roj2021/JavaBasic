package class17;

public class DogTester {
    public static void main(String[] args) {

        Dog husky=new Dog("Husky", "Husky the dog","White",2,25.2);
        Dog bullDog=new Dog("Bulldog","Bulldog the dog","Red",3,27.1);
        Dog labrador=new Dog("Labrador","Labrador the dog","Grey",4,28.0);


        labrador.printInfo();
        bullDog.printInfo();
        husky.printInfo();

    }
}
