package com.telran.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Scanner;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void click(WebElement element) {
        element.click();
    }

    public void type(WebElement element,String text) {
        if (text != null) {
            element.click();
            element.clear();
            element.sendKeys(text);
        }
    }

    public Screenshot takeScreenshotWithScrollDown() {
    Screenshot screen = new AShot()
            .shootingStrategy(ShootingStrategies.viewportPasting(ShootingStrategies.scaling(1.5f), 1000))
            .takeScreenshot(driver);
        try {
            ImageIO.write(screen.getImage(),"png",new File(System.currentTimeMillis() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return screen;
    }

    public void clickWithJSExecutor(WebElement element,int x,int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + x + "," + y + ")");
        element.click();
    }


}
