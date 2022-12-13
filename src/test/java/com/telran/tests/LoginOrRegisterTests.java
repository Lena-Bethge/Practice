package com.telran.tests;

import com.telran.pages.HomePage;
import com.telran.pages.LoginOrRegisterPage;
import com.telran.pages.data.PositiveAllertsData;
import com.telran.pages.data.UserData;
import com.telran.pages.data.NegativeAllertsData;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginOrRegisterTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions() {
        new HomePage(driver).clickOnLoginLink();
    }


    @Test
    public void registerPositiveTest() {
       new LoginOrRegisterPage(driver).registration(UserData.USER_REGISTER_EMAIL,
               UserData.USER_REGISTER_PASSWORD, UserData.USER_REGISTER_CONFIRM_PASSWORD);
       new HomePage(driver).verifyTextThanksForRegistering (PositiveAllertsData.CONFIRMATION_OF_REGISTER);

     }

     @Test
     public void loginPositiveTest() {
        new LoginOrRegisterPage(driver).login(UserData.USER_EMAIL,UserData.USER_PASSWORD);
        new HomePage(driver).verifyTextWelcomeBack (PositiveAllertsData.CONFIRMATION_OF_LOGIN);
     }

    @Test
    public void loginNegativeTestWithInvalidPass() {
        new LoginOrRegisterPage(driver).loginWithInvalidPassword(UserData.USER_EMAIL,UserData.USER_INVALID_PASSWORD);
        Assert.assertTrue(new LoginOrRegisterPage(driver).verifyWarningText().contains(NegativeAllertsData.WARNING_LOGIN_TEXT));
    }


     @AfterMethod
    public void logOut() {
         new HomePage(driver).logOut();
     }
}
