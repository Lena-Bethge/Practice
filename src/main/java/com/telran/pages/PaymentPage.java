package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage{

    public PaymentPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "view_preview")
    WebElement continueBtn2;


    public PaymentPage clickContinueButton() {
        click(continueBtn2);
        return this;
    }

    @FindBy(id = "place-order")
    WebElement placeOrderBtn;

    public PaymentPage clickPlaceOrderBtn() {
        click(placeOrderBtn);
        return this;
    }

    @FindBy(xpath = "//body/div[1]/div[1]/p[1]")
    WebElement getConfirmationOnBuy;

    public String verifyOrderConfirmText() {
        return getConfirmationOnBuy.getText();

    }
}
