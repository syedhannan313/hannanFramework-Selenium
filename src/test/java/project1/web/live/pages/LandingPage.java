package project1.web.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
     WebDriver driver;
   public LandingPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }


    @FindBy(id="userEmail")
    WebElement inputuserEmail;

    @FindBy(id="userPassword")
    WebElement inputuserPassword;

    @FindBy(id="login")
    WebElement btnlogin;
    public  void login(String username,String passwoed) throws InterruptedException {

        inputuserEmail.sendKeys(username);
        inputuserPassword.sendKeys(passwoed);
        Thread.sleep(1000);
        btnlogin.click();
        Thread.sleep(1000);
    }
}
