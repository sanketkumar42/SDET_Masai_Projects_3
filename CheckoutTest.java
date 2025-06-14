package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pageObjects.*;

public class CheckoutTest {
    WebDriver driver;
    HomePage home;
    ProductPage product;
    CartPage cart;
    CheckoutPage checkout;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        home = new HomePage(driver);
        product = new ProductPage(driver);
        cart = new CartPage(driver);
        checkout = new CheckoutPage(driver);
    }

    @Test
    public void testCheckoutProcess() {
        home.searchProduct("Laptop");
        product.addFirstProductToCart();
        cart.proceedToCheckout();
        checkout.enterBillingDetails("John", "Doe", "john.doe@example.com", "India", "Mumbai", "123 Main St", "400001", "9876543210");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
