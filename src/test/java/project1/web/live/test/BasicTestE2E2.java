package project1.web.live.test;

import controller.TestController;
import elementAction.PerformElementAction;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import project1.web.live.pages.*;

import java.time.Duration;



public class BasicTestE2E2  extends TestController {

    @Test
    public static void basicTestTC()  {
//
        try {
//            LandingPage landingPage=new LandingPage(driver);
//            CheckOutPage checkOutPage=new CheckOutPage(driver);
//            ConfirmationPage confirmationPage=new ConfirmationPage(driver);
//            CatlogPage catlogPage=new CatlogPage(driver);
//            AbstractComponents abstractComponents=new AbstractComponents(driver);
//
//
//            landingPage.login("syedhannan@gmail.com","syeD@313");
//
//            Thread.sleep(1000);
//            catlogPage.addtocart(product);
////            List<WebElement> products = driver.findElements(By.xpath("//*[@class='card-body']/h5/b"));
////            WebElement prod = products.stream().filter(item -> item.getText().equalsIgnoreCase(product)).findFirst().orElse(null);
//
////            Thread.sleep(3000);
//            WebElement tabCart = driver.findElement(By.xpath("//button[@class='btn btn-custom' and contains(text(),'Cart ')]"));
//            tabCart.click();
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//button[@type='button' and contains(text(),'Checkout')]")).click();
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//div[contains(text(),'CVV Code ')]/..//input[1]")).sendKeys("132");
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//div[contains(text(),'Name on Card ')]/..//input[1]")).sendKeys("hsnnsn");
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("India");
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//span[text()=' India']")).click();
//            Thread.sleep(5000);
//
//            WebElement ele = driver.findElement(By.xpath("//a[text()='Place Order ']"));
//            wait.until(ExpectedConditions.elementToBeClickable(ele));
//            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
////            Actions act = new Actions(driver);
////            act.click().perform();
//            ele.click();
//
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//h1[text()=' Thankyou for the order. ']")).isDisplayed();
            String action = null;
            String xpath = null;
            PerformElementAction t=new PerformElementAction();
            t.performElementAction(xpath,action);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            browser().close();
        }
    }
}
