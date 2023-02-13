package project1.web.live.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbstractComponents {

    WebElement driver;
    
//            PageFactory.initElements(driver,this);
    @FindBy(xpath="//button[@class='btn btn-custom' and contains(text(),'Cart ')]")
    WebElement cart;

    public  void clickOnCart()  {
        cart.click();
    }

}
