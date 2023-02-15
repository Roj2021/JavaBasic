package class10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {

        int [] numbers=new int[5];
        Scanner scanner=new Scanner(System.in);

        /*
        numbers[0]=40;
        numbers[1]=50;
        numbers[3]=60;
        numbers[2]=70;
        numbers[4]=80;
        // Below code take the numbers from user and store them in the array its good but a lot
         */
         /*
         numbers[0]=Scanner.nextInt();
        numbers[1]=Scanner.nextInt();
        numbers[3]=Scanner.nextInt();
        numbers[2]=Scanner.nextInt();
        numbers[4]=Scanner.nextInt();
         */


        System.out.println(Arrays.toString(numbers));

    }
}
