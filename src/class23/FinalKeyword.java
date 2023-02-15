package class23;

public class FinalKeyword {

   final double gravity=9.8;
    final double PI=3.4;
    final double LightSpeed=299792458;

    final void tryChaningGravity(){
       // gravity=1.6 ;//we get an error because this variable is marked final

    }


}
class Child extends FinalKeyword{
  //  void tryChaningGravity(){
       // gravity=1.6 ;//we get an error because this variable is marked final

    }

