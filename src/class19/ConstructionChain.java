package class19;

public class ConstructionChain {

    ConstructionChain(){
        System.out.println("I am non argument constructor");
    }
    ConstructionChain(String str){
        this(); // making a call to non argument constructor
        //this() --> ALWAYS must be on the first line
        System.out.println(str);
    }
    ConstructionChain(int number){
        this("hello");
        System.out.println("This is constructor with int parameter");

    }

    public static void main(String[] args) {
        ConstructionChain obj=new ConstructionChain(10);
        System.out.println("-------End of the code-------");
    }
}
