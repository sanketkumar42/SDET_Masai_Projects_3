package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

    By addToCartButton = By.cssSelector("input[value='Add to cart']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addFirstProductToCart() {
        driver.findElements(addToCartButton).get(0).click();
    }
}
