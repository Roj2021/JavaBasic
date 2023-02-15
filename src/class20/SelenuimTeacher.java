package class20;

public class SelenuimTeacher extends Teacher {
    public static void main(String[] args) {

        SelenuimTeacher selenium=new SelenuimTeacher();
        selenium.homework();//public
        selenium.grade();//protected available through the inheritance

        //selenium.scholarship();// default not available

    }
}
