package elementAction;

import controller.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PerformElementAction extends Findelement {

    public void performElementAction(String elementname, String action, String... dynamicvalues) {
        String locator = this.getlocatorString(elementname,dynamicvalues);
        WebElement element = this.getWebElement(elementname);
        String[] locatorString = locator.split("=");

        if (browser() != null) {
            try {
                switch (action) {

                    case "click":
                        element.click();
                        break;

                    case "clear":
                        element.clear();
                        break;
                    case "enterText":
                        element.sendKeys(dynamicvalues[1]);
                        break;
                    case "getText":
                        element.getText();
                        break;

                    case "getAttribute":
                        element.getAttribute(dynamicvalues[1]);
                        break;
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public String  getText(String elementname, String action, String... dynamicvalues) {
        String locator = this.getlocatorString(elementname);
        WebElement element = this.getWebElement(elementname);
        String[] locatorString = locator.split("=");
        String text=null;
        if (browser() != null) {
            try {
                switch (action) {

                    case "getText":
                        element.getText();
                        break;

                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
        return text;
    }
    public String  getAttribute(String elementname,String attributename, String action, String... dynamicvalues) {
        String locator = this.getlocatorString(elementname);
        WebElement element = this.getWebElement(elementname);
        String[] locatorString = locator.split("=");
        String attributenvalue=null;
        if (browser() != null) {
            try {
                switch (action) {
                    case "getAttribute":
                        attributenvalue=   element.getAttribute(attributename);
                        break;
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
        return attributenvalue;
    }
    public Boolean    performElementverify(String elementname, String action, String... dynamicvalues) {
        String locator = this.getlocatorString(elementname);
        WebElement element = this.getWebElement(elementname);
        String[] locatorString = locator.split("=");
        Boolean verify=false;
        if (browser() != null) {
            try {
                switch (action) {
                    case "isDisplayed":
                        element.isDisplayed();
                        break;
                    case "isEnabled":
                        element.isEnabled();
                        break;
                    case "isSelected":
                        element.isSelected();
                        break;
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
        return verify;
    }

}
