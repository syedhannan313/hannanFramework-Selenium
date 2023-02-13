package project1.web.live.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.TestController;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.crypto.KeyAgreementSpi;
import java.time.Duration;
import java.util.List;

public class BasicTestE2E  {

    @Test
    public static void basicTestTC() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/client");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String product = "zara coat 3";
        try {
            driver.findElement(By.id("userEmail")).sendKeys("syedhannan@gmail.com");
            driver.findElement(By.id("userPassword")).sendKeys("syeD@313");
            Thread.sleep(1000);
            driver.findElement(By.id("login")).click();
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//b[text()='zara coat 3']/../..//button[text()=' Add To Cart']")).click();

//            List<WebElement> products = driver.findElements(By.xpath("//*[@class='card-body']/h5/b"));
//            WebElement prod = products.stream().filter(item -> item.getText().equalsIgnoreCase(product)).findFirst().orElse(null);

//            Thread.sleep(3000);
            WebElement tabCart = driver.findElement(By.xpath("//button[@class='btn btn-custom' and contains(text(),'Cart ')]"));
            tabCart.click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[@type='button' and contains(text(),'Checkout')]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[contains(text(),'CVV Code ')]/..//input[1]")).sendKeys("132");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[contains(text(),'Name on Card ')]/..//input[1]")).sendKeys("hsnnsn");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("India");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[text()=' India']")).click();
            Thread.sleep(5000);

            WebElement ele = driver.findElement(By.xpath("//a[text()='Place Order ']"));
                   wait.until(ExpectedConditions.elementToBeClickable(ele));
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
//            Actions act = new Actions(driver);
//            act.click().perform();
            ele.click();

            Thread.sleep(2000);
            driver.findElement(By.xpath("//h1[text()=' Thankyou for the order. ']")).isDisplayed();


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            driver.close();
        }
    }
}
