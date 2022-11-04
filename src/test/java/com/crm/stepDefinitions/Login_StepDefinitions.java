package com.crm.stepDefinitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    LoginPage loginPage= new LoginPage();

    @Given("user is on the crm login page")
    public void user_is_on_the_crm_login_page() {
        String url= ConfigurationReader.getProperty("URL");
        Driver.getDriver().get(url);
        BrowserUtils.waitForVisibility(loginPage.loginButton, 4);

    }
    @When("user type {string} into login inputbox")
    public void user_type_into_login_inputbox(String string) {
        loginPage.inputLogin.sendKeys(string);
    }
    @When("user type {string} into the password inputbox")
    public void user_type_into_the_password_inputbox(String string) {
        loginPage.inputPassword.sendKeys(string);
    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.loginButton.click();
        BrowserUtils.sleep(2);
    }
    @Then("verify that user should see crm home page")
    public void verify_that_user_should_see_crm_home_page() {

        BrowserUtils.verifyURLContains("stream");
    }




}
