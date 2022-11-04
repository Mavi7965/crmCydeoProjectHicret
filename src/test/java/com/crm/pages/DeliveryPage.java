package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryPage {

    public DeliveryPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Add more']")
    public WebElement addMoreRecipButton;

    @FindBy(xpath = "//a[.='Recent']")
    public WebElement recentBtnRecipient;


    @FindBy(xpath = "//a[.='Employees and departments']")
    public WebElement employeesBtnRecipient;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-employee-info']/div[.='helpdesk22@cybertekschool.com']")
    public WebElement employeeRecipient;

    @FindBy(xpath = "//a[.='E-mail users']")
    public WebElement emailUsersBtnRecipient;

    @FindBy(id = "feed-add-post-destination-input")
    public WebElement cursorForEmailUsers;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closeIcon;

    @FindBy(xpath = "//div[@class='feed-post-title-block']//a[@href='/company/personal/user/512/']")
    public WebElement proofOfDelivery;





}
