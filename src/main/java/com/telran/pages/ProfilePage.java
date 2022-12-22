package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends HomePage {

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//*[.='Profile'])[3]")
    WebElement ProfileBtn;

    public ProfilePage verifyPageHeaderProfile() {
        click(ProfileBtn);
        return this;
    }
}
