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

    @FindBy(xpath = "//*[text()='Go']")
    WebElement buttonGo;

    public boolean isButtonGoPresent() {
        return buttonGo.isDisplayed();
    }

    @FindBy(xpath = "//*[@class='nav-link mt-2 mt-lg-0']")
    WebElement accountButton;

    public boolean isAccountButtonDisplayed() {
        return accountButton.isDisplayed();
    }

    @FindBy(id = "logout_link")
    WebElement logOut;


    public boolean isLogOutLinkDisplayed() {
        return logOut.isDisplayed();
    }

    @FindBy(xpath = "//*[.='Oscar']")
    WebElement logoBtn;

    public boolean isLogoOscarDisplayed() {
        return logoBtn.isDisplayed();
    }


    @FindBy(xpath = "//span[.='Toggle Dropdown']")
    WebElement dropdownArrow;


    public boolean isViewBasketArrowDisplayed() {
        return dropdownArrow.isDisplayed();
    }

    @FindBy(css = "li > a[href*=clothing_1]")
    WebElement clothingLink;

    public boolean isClothingLinkDisplayed() {
        return clothingLink.isDisplayed();
    }

    @FindBy(css = "li > a[href*=books_2]")
    WebElement bookLink;

    public boolean isBookLinkDisplayed() {
        return bookLink.isDisplayed();
    }

    @FindBy(css = "li > a[href*=fiction_3]")
    WebElement fictionLink;

    public boolean isFictionLinkDisplayed() {
        return fictionLink.isDisplayed();
    }

    @FindBy(css = "li > a[href*=computers-in-literature_4]")
    WebElement compInLiterature;

    public boolean isComputInLiteratDisplayed() {
        return compInLiterature.isDisplayed();
    }

    @FindBy(css = "li > a[href*=non-fiction_5]")
    WebElement nonFiction;

    public boolean isNonFictionDisplayed() {
        return nonFiction.isDisplayed();
    }

    @FindBy(css = "li > a[href*=essential-programming_6]")
    WebElement essentialProgr;

    public boolean isEssentialProgrammingDisplayed() {
        return essentialProgr.isDisplayed();
    }

    @FindBy(css = "li > a[href*=hacking_7]")
    WebElement hacking;

    public boolean isHackingDisplayed() {
        return hacking.isDisplayed();
    }

    @FindBy(xpath = "//*[@class='page-item disabled']")
    WebElement pagenationBtn;

    public boolean isPagenationLinkDisplayed() {
        return pagenationBtn.isDisplayed();
    }

    @FindBy(xpath = "(//*[@class='page-link'])[2]")
    WebElement nextLink;

    public boolean isNextLinkDisplayed() {
        return nextLink.isDisplayed();
    }

    @FindBy(xpath = "//div[@class='btn-group']/button[1]")
    WebElement viewBasketBtn;

    public BasketPage clickOnViewBasketButton() {
        click(viewBasketBtn);
        return new BasketPage(driver);
    }
}
