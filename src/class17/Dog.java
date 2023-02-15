package class17;

public class Dog {


    String name;
    String bread;
    String color;
    int age;
    double weight;


    Dog(String dogName,String dogBread,String dogColor, int dogAge,
        double dogWeight){
        name=dogName;
        bread=dogBread;
        color=dogColor;
        age=dogAge;
        weight=dogWeight;

    }

    void printInfo(){
        System.out.println("Name "+name+" Bread "+bread+" Color "+color+" Age "+age+" Weight "+weight);
    }

}
