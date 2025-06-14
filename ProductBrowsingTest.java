package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pageObjects.HomePage;
import pageObjects.ProductPage;

public class ProductBrowsingTest {
    WebDriver driver;
    HomePage home;
    ProductPage product;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        home = new HomePage(driver);
        product = new ProductPage(driver);
    }

    @Test
    public void testSearchProduct() {
        home.searchProduct("Laptop");
        product.addFirstProductToCart();
        // Add assertions as needed
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
