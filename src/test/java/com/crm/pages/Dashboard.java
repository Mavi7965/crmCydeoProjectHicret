package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

    public Dashboard(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//div[@class='feed-add-post-form-variants']/span[5]")
    public WebElement moreButton;

    @FindBy(xpath = "(//span[.='Appreciation'])[1]")
    public WebElement appreciationButton;

    @FindBy(xpath ="//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageContent;

////span[@class='feed-add-post-destination feed-add-post-destination-all-users']

    @FindBy(xpath = "//div[@class='feed-add-post-destination-wrap']/span/span[.='All employees']") // !!!
    public WebElement allEmployeesRecip;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelButton;

    ////tagName[contains(@attribute, 'value')]
    @FindBy(xpath = "(//div[@class='feed-post-title-block']/following-sibling::div/div/div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement messageString;

    @FindBy(xpath = "//div/span/span/span[@class='feed-add-post-del-but']")
    public WebElement delRecipientBttn;

    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement errorMsgAboutPerson;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement errorMsgAboutMessage;

    @FindBy(xpath = "//span[.='Send message …']")
    public WebElement sendMessageWriting;













}
