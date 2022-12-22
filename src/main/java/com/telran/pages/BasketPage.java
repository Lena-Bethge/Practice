package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

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

    @FindBy(xpath = "//*[@class='btn btn-outline-secondary']")
    WebElement viewBasketBtn;

    public boolean isViewBasketDisplayed() {
        return viewBasketBtn.isDisplayed();
    }

    @FindBy(xpath = "//*[@class = 'basket_summary']/div[1]//h3")
    WebElement firstBookTittle;

    public String firstBookTitle() {
        return firstBookTittle.getText();
    }

    @FindBy(xpath = "//form[@class='basket_summary']/div[2]//h3")
    WebElement lastBookTittle;

    public String lastBookTitle() {
        return lastBookTittle.getText();
    }
    @FindBy(id = "id_form-0-quantity")
    WebElement quantityField;

    @FindBy(xpath = "(//div[@class='input-group-append'])[1]")
    WebElement updateBtn;

    public BasketPage removeFirstBook() {
        quantityField.clear();
        quantityField.sendKeys("0");
        click(updateBtn);
        return this;
    }

    @FindBy(xpath = "(//div[@class='input-group-append'])[1]")
    WebElement updateBtn2;

    public BasketPage removeLastBook() {
        quantityField.clear();
        quantityField.sendKeys("0");
        clickWithJSExecutor(updateBtn2,300,0);
        return this;
    }
}
