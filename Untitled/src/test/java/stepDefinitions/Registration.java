package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import static stepDefinitions.TestSuiteSetUp.driver;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Registration {

    @Given("I have chosen to sign up")
    public void i_have_chosen_to_sign_up() {
        String website = "http://demowebshop.tricentis.com";
        driver.get(website);
        driver.findElement(By.className("ico-register")).click();
    }

    @When("I sign up with valid details")
    public void i_sign_up_with_valid_details() {
        Random ran = new Random();
        int ranNum = ran.nextInt();
        String email = String.format("%s%s@gmail.com", "johnWick",ranNum);
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("ABC", Keys.ENTER);
        driver.findElement(By.id("LastName")).sendKeys("ABCD", Keys.ENTER);
        driver.findElement(By.id("Email")).sendKeys(email, Keys.ENTER);
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        driver.findElement(By.id("register-button")).click();
    }

    @Then("I should see a confirmation message")
    public void i_should_see_a_confirmation_message() {
        boolean successMsg = driver.findElement(By.className("result")).isDisplayed();
        assertTrue(successMsg);
    }

    @When("I sign up with an email address that has already registered")
    public void i_sign_up_with_an_email_address_that_has_already_registered() {
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("ABC", Keys.ENTER);
        driver.findElement(By.id("LastName")).sendKeys("ABCD", Keys.ENTER);
        driver.findElement(By.id("Email")).sendKeys("qwerty2245@abc.com", Keys.ENTER);
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        driver.findElement(By.id("register-button")).click();

    }
    @Then("I should be told that the email is already registered")
    public void i_should_be_told_that_the_email_is_already_registered() {

        String errorMessage = driver.findElement(By.className("validation-summary-errors")).getText();
        assertEquals("The specified email already exists", errorMessage);
    }
    @Then("I should be offered the option to recover my password")
    public void i_should_be_offered_the_option_to_recover_my_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    }
