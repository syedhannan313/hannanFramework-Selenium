package controller;

public class Initilization extends Browser {

    public static void suitInit(){

    }
    public  void testInit(String url) throws InterruptedException {

        browser().get(url);
        browser().manage().window().maximize();
        Thread.sleep(5000);
    }
    public static void classInit(){

    }
    public static void methodInit(){

    }

}
