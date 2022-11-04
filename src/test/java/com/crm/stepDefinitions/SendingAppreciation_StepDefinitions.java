package com.crm.stepDefinitions;

import com.crm.pages.Dashboard;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SendingAppreciation_StepDefinitions {

    Dashboard dashboard = new Dashboard();
    Faker faker= new Faker();


    @When("user clicks More button and selects Appretiation option")
    public void user_clicks_more_button_and_selects_appretiation_option() {
        BrowserUtils.waitForVisibility(dashboard.moreButton, 10);

        BrowserUtils.scrollToElement(dashboard.moreButton);
        BrowserUtils.clickWithJS(dashboard.moreButton);

        BrowserUtils.waitForVisibility(dashboard.appreciationButton,10);

        BrowserUtils.scrollToElement(dashboard.appreciationButton);
        BrowserUtils.clickWithJS(dashboard.appreciationButton);

    }
    @When("user types message into the message field")
    public void user_types_message_into_the_message_field() {

        Driver.getDriver().switchTo().frame(dashboard.iframe);

        dashboard.messageContent.sendKeys("Hello World");
        BrowserUtils.sleep(2);

        Driver.getDriver().switchTo().parentFrame();

    }
    @When("user can see the recipient as {string} by default")
    public void user_can_see_the_recipient_as_by_default(String string) {

        BrowserUtils.sleep(3);

        Assert.assertTrue(dashboard.allEmployeesRecip.isDisplayed());
    }
    @When("user clicks send button")
    public void user_clicks_send_button() {

        BrowserUtils.waitForVisibility(dashboard.sendButton, 5);
        dashboard.sendButton.click();
        BrowserUtils.sleep(2);

    }
    @Then("verify the appreciation message is sent")
    public void verify_the_appreciation_message_is_sent() {
       // WebElement messageString= Driver.getDriver().findElement(By.xpath(""));
        Assert.assertTrue(dashboard.messageString.isDisplayed());
    }

    @When("user deletes the default recipient")
    public void user_deletes_the_default_recipient() {

        BrowserUtils.clickWithJS(dashboard.delRecipientBttn);
    }
    @Then("user should see the error message about recipient")
    public void user_should_see_the_error_message_about_recipient() {
        dashboard.errorMsgAboutPerson.isDisplayed();
    }


    @Then("user should see the error message about empty message")
    public void user_should_see_the_error_message_about_empty_message() {
        dashboard.errorMsgAboutMessage.isDisplayed();

    }

    @When("user clicks cancel button")
    public void user_clicks_cancel_button() {
        dashboard.cancelButton.click();
    }
    @Then("user should cancel successfully and see the writing Send Message")
    public void user_should_cancel_successfully_and_see_the_writing_send_message() {
        dashboard.sendMessageWriting.isDisplayed();
    }







}
