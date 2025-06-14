package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    By removeItemButton = By.cssSelector("input[value='Remove']");
    By proceedToCheckout = By.xpath("//input[@value='Proceed to checkout']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void removeFirstItem() {
        driver.findElements(removeItemButton).get(0).click();
    }

    public void proceedToCheckout() {
        driver.findElement(proceedToCheckout).click();
    }
}
