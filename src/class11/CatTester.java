package class11;

public class CatTester {
    public static void main(String[] args) {


        // creating object from the Cat class

        Cat cat1=new Cat();
        cat1.name="lego";
        cat1.bread="Van Cat";
        cat1.age=2;
        cat1.color="grey";
        cat1.attitude=false;
        cat1.eat();

        Cat cat2=new Cat();
        cat2.name="loki";
        cat2.bread="Domestic";
        cat2.color="White";

        System.out.println(cat2.bread);

        cat2.speak();

    }
}
