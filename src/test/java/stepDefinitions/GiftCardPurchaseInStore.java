package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetUp.driver;


public class GiftCardPurchaseInStore {

    @When("Customer adds a giftCard to the cart")
    public void customer_adds_a_gift_card_to_the_cart() {

        driver.findElement(By.partialLinkText("Gift Card")).click();
        driver.findElement(By.partialLinkText("$50 Physical Gift Card")).click();
        driver.findElement(By.cssSelector("#giftcard_3_RecipientName")).sendKeys("rule");
        driver.findElement(By.cssSelector("#giftcard_3_Message")).sendKeys("kind regards ABC");
        driver.findElement(By.cssSelector("input#add-to-cart-button-3")).click();


    }
    @Then("Customer can verify success message")
    public void customer_can_verify_success_message() {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#opc-confirm_order input[type=\"button\"]")));

        driver.findElement(By.cssSelector("#opc-confirm_order input[type=\"button\"]")).click();

        String expected = "Your order has been successfully processed!";
        wait.until(ExpectedConditions.textToBe(By.cssSelector(".title"),expected));

        String actual = driver.findElement(By.cssSelector(".title")).getText();
        assertEquals(expected,actual);

    }
}
