package project1.web.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractComponents {

    WebDriver driver;
    public AbstractComponents(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    
    @FindBy(xpath="//button[@class='btn btn-custom' and contains(text(),'Cart ')]")
    WebElement cart;

    public  void waitForElement(By findBy) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(findBy));
    }
    public  void clickOnCart()  {
        cart.click();
    }

}
