package project1.web.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
    WebDriver driver;
    public ConfirmationPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public  void basicTestTC() throws InterruptedException {

        driver.findElement(By.id("userEmail")).sendKeys("syedhannan@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("syeD@313");
        Thread.sleep(1000);
        driver.findElement(By.id("login")).click();
        Thread.sleep(1000);
    }
}
