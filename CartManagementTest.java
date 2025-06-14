package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pageObjects.*;

public class CartManagementTest {
    WebDriver driver;
    HomePage home;
    ProductPage product;
    CartPage cart;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        home = new HomePage(driver);
        product = new ProductPage(driver);
        cart = new CartPage(driver);
    }

    @Test
    public void testAddAndRemoveProduct() {
        home.searchProduct("Laptop");
        product.addFirstProductToCart();
        cart.removeFirstItem();
        // Add assertions as needed
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
