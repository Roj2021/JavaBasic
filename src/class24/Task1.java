package class24;

public class Task1 {

    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */
    public static void main(String[] args) {
        Computer[] computers = {new Apple(), new HP()};

        for(Computer c:computers){
            c.playVideo();
            c.browserInternet();

            if(c instanceof Apple){ //we are checking if the variable c contains the object of an Apple
                Apple apple=(Apple) c;//converting the variable c back to an apple object
                apple.installApp();
                apple.editVideo();
            }

        }
    }

}
class Computer{
    int RAM;
    int Storage;
    String OS;
    void playVideo(){
        System.out.println("Video is playing");
    }
    void browserInternet(){
        System.out.println("Browse the internet ");
    }

}
class Apple extends Computer{


    @Override
    void playVideo() {
        System.out.println("Playing the video on quick time player");
    }

    @Override
    void browserInternet() {
        System.out.println("Browsing the internet usin safari");

    }
    void editVideo(){
        System.out.println("Editing on video");
    }
    void installApp(){
        System.out.println("installing the apps from App Store");
    }
}
class HP extends Computer {
    @Override
    void playVideo() {
        System.out.println("Browsing using chrome ");
    }

    @Override
    void browserInternet() {
        System.out.println("playing the video using VLC player");
    }
    void installApps(){
        System.out.println("You can install all apps");
    }
}