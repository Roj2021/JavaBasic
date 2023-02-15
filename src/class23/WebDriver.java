package class23;

public class WebDriver {

    public void startBrowser() {System.out.println("starting the browser");}
    public void openURL() {System.out.println("opening a url ");}
    public void testLoginPage() {System.out.println("checking if login page works");}
    public void closeBrowser() {System.out.println("closing the browser");}
}
    class Chrome extends WebDriver{


        @Override
        public void startBrowser() {
            System.out.println("starting Google Chorme ");
        }

        @Override
        public void openURL() {
            System.out.println("opening a url ");
        }

        @Override
        public void testLoginPage() {
            System.out.println("checking if login page works");
        }

        @Override
        public void closeBrowser() {
            System.out.println("closing the browser");
        }
    }
class Safari extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("starting the browser");
    }

    @Override
    public void openURL() {
        System.out.println("opening a url in Safari ");
    }

    @Override
    public void testLoginPage() {
        System.out.println("checking if login page works");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the browser");
    }
}
class FireFox extends WebDriver{
    @Override
    public void startBrowser() {System.out.println("opening  the FireFox browser");}

    @Override
    public void openURL() {System.out.println("opening a url");}

    @Override
    public void testLoginPage() {
        System.out.println("checking if login page works");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the browser");
    }
}

