package class24;

public abstract class Phone {
    /*
    create a phone class lets create abstract method like displayPicture
    unlockPhone
    sendText
    2 child classes Iphone Samsung Google and provide specific implementation
    lets write code to achieve runtime polymorphism

     */
    abstract void unlockPhone();
    abstract void SendText();
    abstract void displatPictures();


}
class Iphone extends Phone{
    @Override
    void unlockPhone() {
        System.out.println("FaceId to unlock the Phone");
    }

    @Override
    void SendText() {
        System.out.println("lets us the IMessage to send the text ");

    }

    @Override
    void displatPictures() {
        System.out.println("IPhotos to browse the pictures");

    }
}
class Samsung extends Phone{
    @Override
    void unlockPhone() {
        System.out.println("Using fingerPrint sensor or camera");
    }

    @Override
    void SendText() {
        System.out.println("Message app to send the message");
    }

    @Override
    void displatPictures() {
        System.out.println("Gallery app to browse ");

    }
}
