package class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {


        String str=" kJGONkKkek356&^%78()(*";

        System.out.println(str.replaceAll("[A-K]","#"));
        System.out.println(str.replaceAll("[a-z]","#"));
        System.out.println(str.replaceAll("[0-9]","[#"));
        System.out.println(str.replaceAll("[A-Za-z]","#"));

    }
}
