package class24;

public class FinalDemo {
    public static void main(String[] args) {
        final int num; //we have created a constant variable
        num=20;
        //num=30; not possible because the variable  is declared final



    }
    void noOneShouldOverrideIt(){
        System.out.println(" This method should never overridden otherwise it might break the code base ");
    }
}
class Nelson extends FinalDemo{
    /* System.out.println(" Let me do that ");
    cant override this method as is declared as final
    */
}

