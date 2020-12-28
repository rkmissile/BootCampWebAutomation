package com.amazon.pages;

import com.base.TestBase;
import com.reports.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends TestBase {

    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    private WebElement accountListNavBtn;

    @FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[@id='nav-flyout-accountList']/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]")
    private WebElement signInBtn;


    public void mouseOverOnAccountListNavBtn() {

        Actions actions = new Actions(driver);
        actions.moveToElement(accountListNavBtn).build().perform();
        ExtentTestManager.log("mouse is overed on accountListNavBtn");

    }

    public void clickOnSignInBtn() {
        signInBtn.click();
    }


}
