package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initilization {

    WebDriver driver;
    public static void suitInit(){

    }
    public  void testInit(String url) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }
    public static void classInit(){

    }
    public static void methodInit(){

    }

}
