package class19;

public class DonkeyTest {
    public static void main(String[] args) {

        Donkey donkey=new Donkey("Pepper",3,29);
        // compiler does not give any DEFAULT constructor

        // default constructor creates by the compiler
        // when a programmer does not create one

        donkey.print();
        // Donkey's name is  null age is 0 and weight is 0.0
    }
}
