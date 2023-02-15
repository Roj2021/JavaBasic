package class20;

public class Parent {

    String name;
    static String lastName;

    Parent(){
        System.out.println(" I am a parent class construction");
    }


    public static void hello() {
        Parent p=new Parent();

        System.out.println("public method hello from parent class");
    }
    protected static void bye(){
        System.out.println("proctedd method bye from parent class");
    }
    private void money(){
        System.out.println("private money from parent");
    }


}
