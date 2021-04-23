package com.workflow.eComms;

import base.TestBase;
import com.google.common.io.Files;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class StepDefinitions extends TestBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I go to the home page$")
    public void i_go_to_the_home_page() throws Throwable {
        driver.get(CONFIG.getProperty("URL"));
    }
    @Given("^I click the Sign in link$")
    public void i_click_the_Sign_in_link() throws Throwable {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @And("^I Enter an email \"([^\"]*)\" address$")
    public void iEnterAnEmailAddress(String email) throws Throwable {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    @And("^I enter a password \"([^\"]*)\"$")
    public void iEnterAPassword(String password) throws Throwable {
        driver.findElement(By.id("passwd")).sendKeys(password);
    }

    @When("^I click the Sign in button$")
    public void i_click_the_Sign_in_button() throws Throwable {
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("^I verify that I am logged in$")
    public void i_verify_that_I_am_logged_in() throws Throwable {
        String expectedUser = "Davin Riches";
        String actualUser = driver.findElement(By.cssSelector("span")).getText();
        Assert.assertEquals(expectedUser, actualUser);
    }

    @Then("^I sign out successfully$")
    public void i_sign_out_successfully() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();

    }

    @Given("^I enter a new email address$")
    public void i_enter_a_new_email_address() throws Throwable {
        random = 100 + (int)(Math.random()*((1000-1) +1));
        driver.findElement(By.id("email_create")).sendKeys("test2" + random + "@gmail.com");
    }

    @Given("^I click the create an account button$")
    public void i_click_the_create_an_account_button() throws Throwable {
        driver.findElement(By.id("SubmitCreate")).click();
    }

    @Given("^I click the radio button$")
    public void i_click_the_radio_button() throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.id("id_gender1")).click();
        Thread.sleep(1000);
    }

    @Given("^I enter a new \"([^\"]*)\" address$")
    public void i_enter_a_new_address(String email) throws Throwable {
        driver.findElement(By.id("email_create")).sendKeys(email);
    }

    @Given("^I enter my \"([^\"]*)\" & \"([^\"]*)\"$")
    public void i_enter_my(String firstname, String lastname) throws Throwable {
        driver.findElement(By.id("customer_firstname")).sendKeys(firstname);
        driver.findElement(By.id("customer_lastname")).sendKeys(lastname);
    }

    @And("^I verify that the email address is prepopulated$")
    public void i_verify_that_the_email_address_is_prepopulated() {
        String expectedEmail = "teanna.riches4@gmail.com";
        String actualEmail = driver.findElement(By.id("email")).getText();
        Assert.assertEquals(expectedEmail, actualEmail);
    }

    @Given("^I create a \"([^\"]*)\"$")
    public void i_create_a(String password) throws Throwable {
        driver.findElement(By.id("passwd")).sendKeys(password);
    }

    @Given("^I enter my D\\.O\\.B$")
    public void i_enter_my_D_O_B() throws Throwable {
        new Select(driver.findElement(By.id("days"))).selectByValue("21");
        Thread.sleep(2000);
        new Select(driver.findElement(By.id("months"))).selectByValue("5");
        Thread.sleep(2000);
        new Select(driver.findElement(By.id("years"))).selectByValue("2000");
        Thread.sleep(1000);
    }

    @Given("^I enter my Address, City and Postal code$")
    public void i_enter_my_Address_City_and_Postal_code() throws Throwable {
        driver.findElement(By.id("address1")).sendKeys("35 Abbots street");
        driver.findElement(By.id("city")).sendKeys("Manchester");
        driver.findElement(By.id("postcode")).sendKeys("90210");
    }

    @Given("^I select my State and Country$")
    public void i_select_my_State_and_Country() throws Throwable {
        new Select(driver.findElement(By.id("id_state"))).selectByValue("24");
        Thread.sleep(2000);
        new Select(driver.findElement(By.id("id_country"))).selectByValue("21");
    }

    @Given("^I enter my mobile number$")
    public void i_enter_my_mobile_number() throws Throwable {
        driver.findElement(By.id("phone_mobile")).sendKeys("07898989899");
    }

    @Given("^I assign an address alias$")
    public void i_assign_an_address_alias() throws Throwable {
        driver.findElement(By.id("alias")).sendKeys("Biggs");
    }

    @Given("^I click the register button$")
    public void i_click_the_register_button() throws Throwable {
        driver.findElement(By.id("submitAccount")).click();
    }

    @Then("^I sign out$")
    public void i_sign_out() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
    }

    @Then("^I verify that \"([^\"]*)\" has registered$")
    public void iVerifyThatHasRegistered(String user) throws Throwable {
        String expectedUser = user;
        String actualUser = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assert.assertEquals(expectedUser, actualUser);
    }

    @Given("^I click the contact us button$")
    public void i_click_the_contact_us_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
    }

    @Given("^I click the Subject Heading$")
    public void i_click_the_Subject_Heading() throws Throwable {
        Thread.sleep(2000);
        new Select (driver.findElement(By.id("id_contact"))).selectByValue("2");
        Thread.sleep(2000);
    }

    @Given("^I enter my email address$")
    public void i_enter_my_email_address() throws Throwable {
        driver.findElement(By.id("email")).sendKeys("test12@gmail.com");
    }

    @Given("^I enter my order reference$")
    public void i_enter_my_order_reference() throws Throwable {
        driver.findElement(By.id("id_order")).sendKeys("999008");
    }

    @Given("^I enter a message$")
    public void i_enter_a_message() throws Throwable {
        driver.findElement(By.id("message")).sendKeys("This is a test run :)");
    }

    @Given("^I attach a file$")
    public void i_attach_a_file() throws Throwable {
        driver.findElement(By.id("fileUpload")).sendKeys("/Users/gideonlewis/Documents/CVs");
    }

    @When("^I click the send button$")
    public void i_click_the_send_button() throws Throwable {
        driver.findElement(By.id("submitMessage")).click();
        Thread.sleep(3000);
    }

    @Then("^I verify that Contact us was successful$")
    public void i_verify_that_Contact_us_was_successful() throws Throwable {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(scrFile, new File("/Users/gideonlewis/Desktop/Testing/Image1.jpg"));
    }

    @Then("^I see an error \"([^\"]*)\" message details$")
    public void iSeeAnErrorMessageDetails(String errormessage) throws Throwable {
        Assert.assertEquals(errormessage, driver.findElement(By.cssSelector("ol > li")).getText());
    }
}
