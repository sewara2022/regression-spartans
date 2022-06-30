package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.LoginPage;

import static stepDefinitions.TestSuiteSetUp.driver;


import static org.junit.Assert.assertTrue;

public class PurchaseBookPickUp {

    LoginPage login = new LoginPage();

    @Given("User is on Demo WebShop home page")
    public void user_is_on_demo_web_shop_home_page() {

        String website = "http://demowebshop.tricentis.com";
        driver.manage().deleteAllCookies();
        driver.get(website);


    }

    @When("User logs in")
    public void user_logs_in() {
        login.with("qwerty2245@abc.com", "123456");
    }
    @When("Customer adds a book to the cart")
    public void customer_adds_a_book_to_the_cart()  {

        driver.findElement(By.cssSelector(".top-menu a[href=\"/books\"]")).click();
        driver.findElement(By.cssSelector(".product-title a[href=\"/computing-and-internet\"]")).click();
        driver.findElement(By.cssSelector(".add-to-cart-panel #add-to-cart-button-13")).click();

    }
    @When("Customer proceeds to check out")
    public void customer_proceeds_to_check_out() {
        WebDriverWait wait=new WebDriverWait(driver,55);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href=\"/cart\"]//span[.=\"(3)\"]")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Shopping cart\n(5)")));


        driver.findElement(By.cssSelector("#topcartlink")).click();
//        driver.findElement(By.cssSelector(".ico-cart .cart-label")).click();

//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".inputs #CountryId")));

        WebElement dropDown = driver.findElement(By.cssSelector(".inputs #CountryId"));
        Select country = new Select(dropDown);
        country.selectByIndex(1);

//        WebElement dropDown1 = driver.findElement(By.cssSelector(".inputs #StateProvinceId"));
//        Select state = new Select(dropDown1);
//        state.selectByValue("Florida");

        driver.findElement(By.cssSelector("input#termsofservice")).click();
        driver.findElement(By.cssSelector("button#checkout")).click();
    }
    @When("Customer fills up Billing Address")
    public void customer_fills_up_billing_address() {

        WebElement dropDown4 = driver.findElement(By.cssSelector("#billing-address-select"));
        Select newAddress = new Select(dropDown4);
        newAddress.selectByIndex(1);

        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".inputs #BillingNewAddress_CountryId")));

        WebElement dropDown2 = driver.findElement(By.cssSelector(".inputs #BillingNewAddress_CountryId"));
        Select country1 = new Select(dropDown2);
        country1.selectByIndex(1);

        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector(".inputs #BillingNewAddress_StateProvinceId")),"AA (Armed Forces Americas)"));

        WebElement dropDown3 = driver.findElement(By.cssSelector(".inputs #BillingNewAddress_StateProvinceId"));
        Select state1 = new Select(dropDown3);
        state1.selectByIndex(14);

        driver.findElement(By.cssSelector("#BillingNewAddress_City")).sendKeys("asdf",Keys.ENTER);
        driver.findElement(By.cssSelector("#BillingNewAddress_Address1")).sendKeys("Aqtobe",Keys.ENTER);
        driver.findElement(By.cssSelector("#BillingNewAddress_ZipPostalCode")).sendKeys("04000", Keys.ENTER);
        driver.findElement(By.cssSelector("#BillingNewAddress_PhoneNumber")).sendKeys("965470", Keys.ENTER);
        driver.findElement(By.cssSelector(".buttons#billing-buttons-container input[title=\"Continue\"]")).click();

    }
    @When("Customer chooses pick up in store")
    public void customer_chooses_pick_up_in_store() {
        driver.findElement(By.cssSelector(".selector #PickUpInStore")).click();
        driver.findElement(By.cssSelector("#opc-shipping input[type=\"button\"]")).click();


    }
    @When("Customer submits the order")
    public void customer_submits_the_order()  {
        driver.findElement(By.cssSelector("#paymentmethod_2")).click();
        driver.findElement(By.cssSelector("#payment-method-buttons-container .button-1")).click();

        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#CardholderName")));

        driver.findElement(By.cssSelector("#CardholderName")).sendKeys("abcd qwerty",Keys.ENTER);
        driver.findElement(By.cssSelector("#CardNumber")).sendKeys("123456789999", Keys.ENTER);
        driver.findElement(By.cssSelector("td #CardCode")).sendKeys("097", Keys.ENTER);
        driver.findElement(By.cssSelector("#opc-payment_info input[type=\"button\"]")).click();

    }
    @Then("Customer can see success message")
    public void customer_can_see_success_message() {
        driver.findElement(By.cssSelector("#opc-confirm_order input[type=\"button\"]")).click();
        boolean successMsg = driver.findElement(By.cssSelector(".title")).isDisplayed();
        assertTrue(successMsg);

    }

}
