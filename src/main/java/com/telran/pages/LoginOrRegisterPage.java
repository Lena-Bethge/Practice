package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collection;

public class LoginOrRegisterPage extends BasePage{

    public LoginOrRegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "id_registration-email")
    WebElement idRegistrEmail;

    @FindBy(id = "id_registration-password1")
    WebElement idRegistrationPassword1;

    @FindBy(id = "id_registration-password2")
    WebElement idRegistrationPassword2;

    @FindBy(xpath = "//*[@value='Register']")
    WebElement registerButton;

    @FindBy(id = "id_login-username")
    WebElement loginUserName;

    @FindBy(id = "id_login-password")
    WebElement loginPassword;

    @FindBy(xpath = "//*[@value='Log In']")
    WebElement loginButton;

    @FindBy (xpath = "//div[@class='alert alert-danger'][2]")
    WebElement alert;


    public HomePage registration(String emailAddress, String password, String confirmPassword) {
        type(idRegistrEmail,emailAddress);
        type(idRegistrationPassword1,password);
        type(idRegistrationPassword2,confirmPassword);
        click(registerButton);
        return new HomePage(driver);
    }

    public HomePage login(String emailAddress, String password) {
        type(loginUserName,emailAddress);
        type(loginPassword,password);
        click(loginButton);
        return new HomePage(driver);
    }

    public HomePage loginWithInvalidPassword(String emailAddress, String password) {
        type(loginUserName,emailAddress);
        type(loginPassword,password);
        click(loginButton);
        return new HomePage(driver);
    }

    @FindBy(xpath = "(//*[@class='alert alert-danger'])[2]")
    WebElement warningText;

    public String verifyWarningText() {
        return warningText.getText();
    }
}
