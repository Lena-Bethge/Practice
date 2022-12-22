package com.telran.oscarLatestVersion.tests;

import com.telran.pages.BasketPage;
import com.telran.pages.HomePage;
import com.telran.pages.LoginOrRegisterPage;
import com.telran.pages.data.UserData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UIHomePageTests extends TestBaseLV {

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).clickOnLoginLink();
        new LoginOrRegisterPage(driver)
                //.registration(UserData.USER_EMAIL,UserData.USER_REGISTER_PASSWORD,UserData.USER_REGISTER_CONFIRM_PASSWORD)
                .login(UserData.USER_EMAIL,UserData.USER_PASSWORD);
    }

    @Test
    public void presenceOfButtonGo() {
        Assert.assertTrue(new HomePage(driver).isButtonGoPresent());
    }

    @Test
    public void presenceOfAccountButton() {
        Assert.assertTrue(new HomePage(driver).isAccountButtonDisplayed());
    }

    @Test
    public void presenceOfLogOutLink() {
        Assert.assertTrue(new HomePage(driver).isLogOutLinkDisplayed());
    }

    @Test
    public void presenceOfLogoOscar() {
        Assert.assertTrue(new HomePage(driver).isLogoOscarDisplayed());
    }

    @Test
    public void presenceOfViewBasketButton() {
        Assert.assertTrue(new BasketPage(driver).isViewBasketDisplayed());
    }

    @Test
    public void presenceDropDownArrow(){
        Assert.assertTrue(new HomePage(driver).isViewBasketArrowDisplayed());
    }

    @Test
    public void presenceClothingLink() {
        Assert.assertTrue(new HomePage(driver).isClothingLinkDisplayed());
    }

    @Test
    public void presenceBookLink() {
        Assert.assertTrue(new HomePage(driver).isBookLinkDisplayed());
    }

    @Test
    public void presenceFictionLink() {
        Assert.assertTrue(new HomePage(driver).isFictionLinkDisplayed());
    }

    @Test
    public void presenceComputersInLiteratureLink() {
        Assert.assertTrue(new HomePage(driver).isComputInLiteratDisplayed());
    }

    @Test
    public void presenceNonFictionLink() {
        Assert.assertTrue(new HomePage(driver).isNonFictionDisplayed());
    }

    @Test
    public void presenceEssentialProgrammingLink() {
        Assert.assertTrue(new HomePage(driver).isEssentialProgrammingDisplayed());
    }

    @Test
    public void presenceHackingLink() {
        Assert.assertTrue(new HomePage(driver).isHackingDisplayed());
    }

    @Test
    public void presencePagenationLink() {
        Assert.assertTrue(new HomePage(driver).isPagenationLinkDisplayed());
    }

    @Test
    public void presencePagenationNextLink() {
        Assert.assertTrue(new HomePage(driver).isNextLinkDisplayed());
    }

}

