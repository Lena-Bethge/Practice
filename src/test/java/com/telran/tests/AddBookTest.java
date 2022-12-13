package com.telran.tests;

import com.telran.pages.*;
import com.telran.pages.data.PositiveAllertsData;
import com.telran.pages.data.UserData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddBookTest extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        new HomePage(driver).clickOnLoginLink();
        new LoginOrRegisterPage(driver).login(UserData.USER_EMAIL,UserData.USER_PASSWORD);
    }

    @Test
    public void addBookTest() {
        new HomePage(driver).clickOnAllProductsLink().clickOnAddToBasketButton();
        new BasketPage(driver).clickViewBasketButton();
        new BasketPage(driver).clickProceedToCheckoutButton();
        new BuyBookFormPage(driver).fillRequiredFields(UserData.FIRST_NAME,
                UserData.LAST_NAME,UserData.ADDRESS,UserData.CITY,UserData.POST_CODE);
        new BuyBookFormPage(driver).selectCountry("United States").clickContinueBtn();
        new PaymentPage(driver).clickContinueButton().clickPlaceOrderBtn().clickLogoHP();
        Assert.assertTrue(new PaymentPage(driver).verifyOrderConfirmText().contains(PositiveAllertsData.CONFIRMATION_OF_ORDER));

    }
}
