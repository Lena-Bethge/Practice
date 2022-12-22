package com.telran.oscarLatestVersion.tests;

import com.telran.pages.AllProductsPage;
import com.telran.pages.BasketPage;
import com.telran.pages.HomePage;
import com.telran.pages.LoginOrRegisterPage;
import com.telran.pages.data.UserData;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


    public class AllProductTest extends TestBaseLV {


        @BeforeMethod
        public void ensurePrecondition() {
            new HomePage(driver).clickOnLoginLink();
            new LoginOrRegisterPage(driver).login(UserData.USER_EMAIL,UserData.USER_PASSWORD);
            new HomePage(driver).clickOnAllProductsLink();
        }

        @Test
        public void addToBasketButtonTest() {
            new AllProductsPage(driver).addToBasket();
            new HomePage(driver).clickOnViewBasketButton();
            Assert.assertTrue(new BasketPage(driver).firstBookTitle().contains("The shellcoder's handbook"));
            Assert.assertTrue(new BasketPage(driver).lastBookTitle().contains("The Cathedral & the"));
        }

        @AfterMethod
        public void tearDown() {
            new BasketPage(driver).removeFirstBook();
            new BasketPage(driver).removeLastBook();

        }
    }


