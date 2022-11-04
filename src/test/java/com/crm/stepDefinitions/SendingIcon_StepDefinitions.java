package com.crm.stepDefinitions;

import com.crm.pages.IconPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class SendingIcon_StepDefinitions {

    IconPage iconPage= new IconPage();


    @When("user clicks the icon")
    public void user_clicks_the_icon() {
        iconPage.icon.click();
        Assert.assertTrue(iconPage.icons.size()==14);
    }
    @When("user selects an icon and clicks on it")
    public void user_selects_an_icon_and_clicks_on_it() {

        iconPage.selectIconSmile.click();
    }

    @When("user adds a recipient for sending the icon")
    public void user_adds_a_recipient_for_sending_the_icon() {
       iconPage.addEmployeeBtnForIcon.click();
       iconPage.addEmployeeToIcon.click();


    }

    @Then("user should see the icon is sent")
    public void user_should_see_the_icon_is_sent() {
        Assert.assertTrue(iconPage.sentIcon.isDisplayed());
    }



}
