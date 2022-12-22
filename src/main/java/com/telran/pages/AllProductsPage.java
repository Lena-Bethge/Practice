package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllProductsPage extends BasePage{

    public AllProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//form[@action='/en-gb/basket/add/208/']")
    WebElement addToBasket;

    public AllProductsPage clickOnAddToBasketButton() {
        clickWithJSExecutor(addToBasket,200,0);
        return this;
    }

    @FindBy(xpath = "//form[@action='/en-gb/basket/add/209/']")
    WebElement addFirstBook;

    @FindBy(xpath = "//form[@action='/en-gb/basket/add/190/']")
    WebElement addLastBook;

    public AllProductsPage addToBasket() {
        clickWithJSExecutor(addFirstBook,200,0);
        clickWithJSExecutor(addLastBook,500,0);
        return this;
    }
}
