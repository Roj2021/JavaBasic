package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {

        MethodsPractice mp=new MethodsPractice();
      boolean isEven=  mp.isEven(15);

        System.out.println(isEven);

        //call isEven method for the number 100 12 20

        boolean isEven2=mp.isEven2(100);
        System.out.println(isEven2);
        System.out.println(mp.isEven(12));
        System.out.println(mp.isEeven1(20));

    }
}
