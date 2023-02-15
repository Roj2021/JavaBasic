package class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {

        boolean summer = true;

        int temp = 75;

        while (summer) {

            if (temp <= 100) {
                System.out.println("I Love summer is Temperature " + temp);

            } else {
                System.out.println("it is very hot " + temp);
                break;
            }
            temp += 5;

        }
        System.out.println("***********************");



        }
    }

