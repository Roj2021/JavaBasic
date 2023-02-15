package class16;

public class Task7 {

    /*
    ) Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
2) Create a method that will take a String as a parameter and returns reversed String.
 Method should be available to all classes within your project and accessible by class name.
3) Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
Method should be available inside the class only where it was declared and executed by calling it is name.

     return type=>int
     name=> sumArrayElements
     parameters=> int[] arr
     access modifier = default

     */
      int sumArrayElements(int[] array){

        int sum=0;
        for(int num:array){
            sum+=num;

        }
        return sum;

    }

    public static void main(String[] args) {

        int[] arr={10,25,35,45};
        Task7 task7=new Task7();

        System.out.println(task7.sumArrayElements(arr));
    }


}
