package project1.web.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CatlogPage extends AbstractComponents{
    WebDriver driver;

    public CatlogPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }


    @FindBy(css="b")
    List<WebElement> requiredProducts;
    public  void addtocart(String dynamicValue)  {

        WebElement requiredProduct  = requiredProducts.stream().filter(prod->prod.getText().equalsIgnoreCase(dynamicValue)).findFirst().orElse(null);
        requiredProduct.findElement(By.xpath(""));

    }



}
