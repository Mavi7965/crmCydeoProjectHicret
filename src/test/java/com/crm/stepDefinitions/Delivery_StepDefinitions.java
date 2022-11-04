package com.crm.stepDefinitions;

import com.crm.pages.DeliveryPage;
import com.crm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Delivery_StepDefinitions {

    DeliveryPage deliveryPage= new DeliveryPage();


    @When("user can click {string} button to add more recipient to sending appreciation")
    public void user_can_click_button_to_add_more_recipient_to_sending_appreciation(String string) {

        Assert.assertEquals("Add more", deliveryPage.addMoreRecipButton.getText());
        deliveryPage.addMoreRecipButton.click();

    }
    @When("user should see three options of recipient\\(recent, employees and departments, email users)")
    public void user_should_see_three_options_of_recipient_recent_employees_and_departments_email_users() {

        Assert.assertTrue(deliveryPage.recentBtnRecipient.isEnabled());
        Assert.assertTrue(deliveryPage.employeesBtnRecipient.isEnabled());
        Assert.assertTrue(deliveryPage.emailUsersBtnRecipient.isEnabled());
    }
    @When("user clicks an option of three delivery groups")
    public void user_clicks_an_option_of_three_delivery_groups() {
        deliveryPage.employeesBtnRecipient.click();
    }

    @When("user should select an expected recipient from there and close pop-up")
    public void user_should_select_an_expected_recipient_from_there_and_close_pop_up() {
        deliveryPage.employeeRecipient.click();
        BrowserUtils.sleep(2);
        deliveryPage.closeIcon.click();


    }

    @Then("user should be able to send the appreciation to the recipient")
    public void user_should_be_able_to_send_the_appreciation_to_the_recipient() {
        Assert.assertTrue(deliveryPage.proofOfDelivery.isDisplayed());


    }



}
