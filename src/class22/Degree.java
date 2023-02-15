package class22;

public class Degree {
    /*
    Create a class 'Degree' having a method 'getPrerequisite' that prints "
    "To get a degree you need high school diploma"".
     Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
     In Masters class override method 'getPrerequisite'.
     Call the method by creating an object of each of the three classes.
     */


    void setGetPrerequisite(){
        System.out.println("To get a Degree we need a high school Diploma");
    }


}

class Bachelor extends Degree{

}
class Master extends Degree{

    void GetPrerequisite() {
        System.out.println("To get a Master Degree we need a Bachelor Degree first");

    }
}
class  DegreeTester{
    public DegreeTester() {
        super();
    }

    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.setGetPrerequisite();
        Bachelor bachelor=new Bachelor();
        bachelor.setGetPrerequisite();
        Master master=new Master();
        master.GetPrerequisite();
    }
}
