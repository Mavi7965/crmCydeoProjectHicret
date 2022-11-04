package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IconPage {

    public IconPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@id='feed-add-post-grat-type-selected']")
    public WebElement icon;

        @FindBy(xpath = "//div[@class='feed-add-grat-list-row']/span")
        public List<WebElement> icons;


    @FindBy(xpath = "//div[@class='feed-add-grat-list-row']//span[@title='Heart']")
    public WebElement selectIconHeart;

    @FindBy(xpath = "//div[@class='feed-add-grat-list-row']//span[@title='Smile']")
    public WebElement selectIconSmile;

    @FindBy(xpath = "//a[@class='feed-add-grat-link']")
    public WebElement addEmployeeBtnForIcon;



    @FindBy(xpath = "(//a[@class='bx-finder-company-department-employee  bx-finder-element'])[2]")
    public WebElement addEmployeeToIcon;

    @FindBy(xpath = "//div[@class='feed-grat-block feed-info-block feed-grat-block-large']/span/div[contains(@class,'smile')]")
    public WebElement sentIcon;


}
