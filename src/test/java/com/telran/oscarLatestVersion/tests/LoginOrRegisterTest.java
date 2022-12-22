package com.telran.oscarLatestVersion.tests;

import com.telran.pages.HomePage;
import com.telran.pages.LoginOrRegisterPage;
import com.telran.pages.data.NegativeAllertsData;
import com.telran.pages.data.PositiveAllertsData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.DataProviders;

public class LoginOrRegisterTest extends TestBaseLV {


    @BeforeMethod
    public void ensurePrecondition() {
        new HomePage(driver).clickOnLoginLink();
    }

    @Test(dataProviderClass = DataProviders.class,dataProvider = "usingFile")
    public void registerNewUserWithDataProviders(String userEmail,String userPassword,String userConfirmPassword) {
        new LoginOrRegisterPage(driver).registration(userEmail,userPassword,userConfirmPassword);
        new HomePage(driver).verifyTextThanksForRegistering (PositiveAllertsData.CONFIRMATION_OF_REGISTER);
    }

    @Test(dataProviderClass = DataProviders.class,dataProvider = "usingFile")
    public void registrationExistingUser(String userEmail,String userPassword,String userConfirmPassword) {
        new LoginOrRegisterPage(driver).registration(userEmail,userPassword,userConfirmPassword);
        new HomePage(driver).verifyTextUserAlreadyExist();
    }

    @Test(dataProviderClass = DataProviders.class,dataProvider = "usingFile1")
    public void registrationWithWrongPassword(String userEmail,String userPassword,String userConfirmPassword) {
        new LoginOrRegisterPage(driver).registration(userEmail,userPassword,userConfirmPassword);
        new HomePage(driver).verifyTextUserAlreadyExist();

    }

    @Test(dataProviderClass = DataProviders.class,dataProvider = "usingFile2")
    public void registrationWithWrongEmail(String userEmail,String userPassword,String userConfirmPassword) {
        new LoginOrRegisterPage(driver).registration(userEmail,userPassword,userConfirmPassword);
        new HomePage(driver).verifyTextUserAlreadyExist();

    }

    @Test(dataProviderClass = DataProviders.class,dataProvider = "usingFile3")
    public void loginWithValidData(String userEmail, String userPassword) {
        new LoginOrRegisterPage(driver).login(userEmail,userPassword);
        new HomePage(driver).verifyTextWelcomeBack(PositiveAllertsData.CONFIRMATION_OF_LOGIN);
    }

    @Test(dataProviderClass = DataProviders.class,dataProvider = "usingFile4")
    public void loginWithInvalidPassword(String userEmail, String userPassword) {
        new LoginOrRegisterPage(driver).login(userEmail,userPassword);
        Assert.assertTrue(new LoginOrRegisterPage(driver).verifyWarningText().contains(NegativeAllertsData.WARNING_LOGIN_TEXT));
    }
}


