package class15;

public class MPractice4 {

    /*
    create a method that takes two number as parameter and return the larger n
    umber time 10 mints

   name==> largerNumber
   parameters=> int num1, int num2
    {
    if{


     */
    int largerNumber(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;

        }
    }

    public static void main(String[] args) {
        MPractice4 mp=new MPractice4();
        System.out.println(mp.largerNumber(12,13));
    }
}

