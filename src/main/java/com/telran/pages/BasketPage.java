package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage{

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='btn btn-default']")
    WebElement viewBasketBtnHP;

    public BasketPage clickViewBasketButton() {
        click(viewBasketBtnHP);
        return this;
    }

    @FindBy(xpath = "//*[.='Proceed to checkout']")
    WebElement buyBook;

    public BasketPage clickProceedToCheckoutButton() {
        click(buyBook);
        return this;
    }
}
