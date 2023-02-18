package controller;

import org.testng.annotations.*;

public class TestController extends Initilization  {

    @BeforeSuite()
    public static void suitInitilization(){
        suitInit();
    }

    @Parameters({"url"})
    @BeforeTest
    public  void testInitilization(@Optional String url) throws InterruptedException {
        testInit(url);
    }
    @BeforeClass
    public static void classInitilization(){
        classInit();
    }
    @BeforeMethod
    public static void methodInitilization(){
        methodInit();
    }
}
