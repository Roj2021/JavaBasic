package class19;

public class BankAccount { // parent class or super class

    long accountNumber;
    double money;

    void deposit(){
        System.out.println("Deposit methods from Bank account class");

    }
}
  class Checking extends BankAccount{ // child class or subclassed or derived class

    double interest;
    void transfer(){
        System.out.println("transfer methods from Checking class");

    }

        }
class Savings extends BankAccount{

    double profit;

    void takeProfit(){
        System.out.println("Profit method from Saving class");
    }

  }
  class SuperSaving extends Savings{

    void superSaving(){
        System.out.println("Super saving methods from SuperSaving class;");
    }
  }