package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    By firstName = By.id("BillingNewAddress_FirstName");
    By lastName = By.id("BillingNewAddress_LastName");
    By email = By.id("BillingNewAddress_Email");
    By country = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address = By.id("BillingNewAddress_Address1");
    By zipCode = By.id("BillingNewAddress_ZipPostalCode");
    By phone = By.id("BillingNewAddress_PhoneNumber");
    By continueButton = By.xpath("//input[@value='Continue']");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterBillingDetails(String fName, String lName, String emailAddr, String countryName, String cityName, String addressLine, String zip, String phoneNum) {
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(email).sendKeys(emailAddr);
        driver.findElement(country).sendKeys(countryName);
        driver.findElement(city).sendKeys(cityName);
        driver.findElement(address).sendKeys(addressLine);
        driver.findElement(zipCode).sendKeys(zip);
        driver.findElement(phone).sendKeys(phoneNum);
        driver.findElement(continueButton).click();
    }
}
