package class19;

public class Test {
    public static void main(String[] args) {

        BankAccount ba=new BankAccount();
        ba.accountNumber=757686940;
        ba.money=1000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);


        System.out.println("--- Creating an object of checking account");

        Checking check=new Checking();
        //feature from parent
        check.accountNumber=5768;
        check.money=780;
        //feature from checking class itself
        check.interest=0;

        check.deposit(); //from parents
        check.transfer(); //from child

        System.out.println("--------Creating an Object of Saving account");

        Savings save=new Savings();
        save.accountNumber=12356;
        save.money=1089;
        save.profit=100;
        //save.interest =0,  sibling b



    }


}
