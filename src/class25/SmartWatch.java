package class25;

interface  WashAble {
     default void wash() {

    }
}

    public class SmartWatch implements WashAble{


    @Override
    public   void wash() {
            System.out.println("You can wash this smartwatch with out any issues");
        }

    }
    //Press the power button to turn me on
    class Phone implements WashAble{


      public   void wash() {
            System.out.println("I am IP65 Rated you can wash me ");
        }

        void Inverter () {
            System.out.println("");

        }
    }
