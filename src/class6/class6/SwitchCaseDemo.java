package class6.class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country="USA ";

        switch (country.toLowerCase()){ // converts the text to lowercase

            case "usa":
                System.out.println("Burgers");
                break;

            case "italy":
                System.out.println("Pasta");
                break;

            case "afgahanistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country ");



        }
    }
}
