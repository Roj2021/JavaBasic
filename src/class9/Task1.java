package class9;

public class Task1 {
    public static void main(String[] args) {
        // Task 1: print numbers from 1 to 50 expect those that are divisible by 3

        for(int i = 1; i <= 50; i++){
            if(i%3!=0){
                System.out.println(i);
            }
        }
    }
}
