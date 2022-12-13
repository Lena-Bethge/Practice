package com.telran.pages;

import com.telran.pages.data.UserData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BuyBookFormPage extends BasePage{

    public BuyBookFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "id_first_name")
    WebElement firstName;

    @FindBy(id = "id_last_name")
    WebElement lastName;

    @FindBy(id = "id_line1")
    WebElement address;

    @FindBy(id = "id_line4")
    WebElement city;

    @FindBy(id = "id_postcode")
    WebElement postCode;


    public BuyBookFormPage fillRequiredFields (String firstUserName, String lastUserName,
                                               String addressUser, String cityUser, String postCodeUser) {
        type(firstName,firstUserName);
        type(lastName,lastUserName);
        type(address,addressUser);
        type(city,cityUser);
        type(postCode,postCodeUser);
        return this;
    }

    @FindBy (id = "id_country")
    WebElement country;

    public BuyBookFormPage selectCountry(String text) {
        click(country);
        Select select = new Select(country);
        select.selectByVisibleText(text);
        return this;
    }

    @FindBy(xpath = "//*[.='Continue']")
    WebElement continueBtn;

    public BuyBookFormPage clickContinueBtn() {
        click(continueBtn);
        return this;
    }
}
