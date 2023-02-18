package elementAction;

import controller.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Findelement extends Browser {

    public WebElement getWebElement(String xpath) {

        String[] locatorString = xpath.split("=");
        WebElement element = null;
        if (browser() != null) {
            try {
                switch (locatorString[0]) {

                    case "id":
                        element = browser().findElement(By.id(locatorString[1]));
                        break;

                    case "xpath":
                        element = browser().findElement(By.xpath(locatorString[1]));
                        break;
                    case "className":
                        element = browser().findElement(By.className(locatorString[1]));
                        break;
                    case "linktext":
                        element = browser().findElement(By.linkText(locatorString[1]));
                        break;
                    case "css":
                        element = browser().findElement(By.cssSelector(locatorString[1]));
                        break;
                    case "partialLinkText":
                        element = browser().findElement(By.partialLinkText(locatorString[1]));
                        break;
                    case "tagName":
                        element = browser().findElement(By.tagName(locatorString[1]));
                        break;
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
        return element;
    }
    public String getlocatorString(String xpath,String... dynamicvalues) {

        String[] locatorString = xpath.split("=");
        String element = null;
        if (browser() != null) {
            try {
                switch (locatorString[0]) {

                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
        return element;
    }
}
