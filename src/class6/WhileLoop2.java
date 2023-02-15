package class6;

public class WhileLoop2 {
    public static void main(String[] args) {

        int number=1;
        while(number<5){
            System.out.println(number);
            number++;

        }
        System.out.println("************");
        int number2=0;
        while (number2<10){
            System.out.println(number2);
            number2+=2;
        }
        // write a loop to print numbers from 1 to 100
        // write a loop to print odd numbers from 1 to 15
        // write a loop to print these number 5,10,15,20,25,30.... 50
        System.out.println("******");
        int num1=1;
        while (num1<=100){
            System.out.println(num1);
            num1++;
        }
        System.out.println("****************   ");
        int num2=1;
        while (num2<=15){
            System.out.println(num2);
            num2+=2;
        }
        System.out.println("**********************");
        int num3=5;
        while (num3<=50){
            System.out.println(num3);
            num3+=5;
        }

    }
}
