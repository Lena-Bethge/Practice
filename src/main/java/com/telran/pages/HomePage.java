package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {
        super(driver);

    }

    @FindBy(id = "login_link")
    WebElement LoginOrRegLink;

    public LoginOrRegisterPage clickOnLoginLink() {
        click(LoginOrRegLink);
        return new LoginOrRegisterPage(driver);
    }

    @FindBy(css = ".alertinner.wicon")
    WebElement ConfirmationOfRegistration;

    public HomePage verifyTextThanksForRegistering(String text) {
        if (ConfirmationOfRegistration.getText().equalsIgnoreCase(text)) {
            System.out.println("Correct: " + ConfirmationOfRegistration.getText());
        } else {
            System.out.println("Incorrect: " + ConfirmationOfRegistration.getText());
        }
        return this;

    }

    @FindBy(id = "logout_link")
    WebElement logOutLink;

    public HomePage logOut() {
        click(logOutLink);
        return this;
    }

    @FindBy(css = ".alertinner.wicon")
    WebElement getConfirmationOfLogin;

    public HomePage verifyTextWelcomeBack(String text) {
        getConfirmationOfLogin.getText().equalsIgnoreCase(text);
        System.out.println(getConfirmationOfLogin.getText());
        return this;
    }

    @FindBy(xpath = "//a[@href='/en-gb/catalogue/']")
    WebElement allProducts;

    public AllProductsPage clickOnAllProductsLink() {
        click(allProducts);
        return new AllProductsPage(driver);
    }

    @FindBy(xpath = "//*[.='Register'][1]")
    WebElement alertRegister;

    public HomePage verifyTextUserAlreadyExist() {
        click(alertRegister);
        return this;
    }
}
