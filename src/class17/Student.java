package class17;

public class Student {

    /*
    Create a class call it Student define 4 instance fields like id name age weight
    create 5 objects of this class do this task without constructors and with constructors
     */
    String id;
    String name;
    int age;
    double weight;

   public Student(String sName,String sId,int sAge){
        id=sId;
        name=sName;
        age=sAge;


    }
    void printInfo(){
        System.out.println(name+" "+id+" "+age+" "+weight);

    }




}
