package project1.web.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatlogPage extends AbstractClass{
    WebDriver driver;
    public CatlogPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(,this);
//        super.driver;"?"
    }

    @FindBy(id="//b[text()='zara coat 3']/../..//button[text()=' Add To Cart']")
    WebElement requiredProduct;
    public  void addtocart()  {

        requiredProduct.click();

    }
}
