package project1.web.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
    WebDriver driver;
    public CheckOutPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public  void basicTestTC() throws InterruptedException {

        driver.findElement(By.xpath("//b[text()='zara coat 3']/../..//button[text()=' Add To Cart']")).click();

    }
}
