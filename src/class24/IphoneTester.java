package class24;

public class IphoneTester {
    public static void main(String[] args) {

        Phone [] phones={new Samsung(),new Iphone()};

        for(Phone po:phones){
            po.unlockPhone();
            po.SendText();
            po.displatPictures();

        }
    }
}
