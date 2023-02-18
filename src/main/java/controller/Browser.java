package controller;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Browser {

    public static   WebDriver browser() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        return  driver;
    }

}
