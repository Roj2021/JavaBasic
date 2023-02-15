package class15;

import com.sun.jdi.Method;

import java.util.Scanner;

public class MethodsDemo1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter  a number");
        scanner.nextLine();

        System.out.println("You entered ");

        Methods methods=new Methods();

        //String num2=methods.doSomething();

        String c= methods.method2();



    }
}
