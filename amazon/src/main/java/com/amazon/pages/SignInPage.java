package com.amazon.pages;


import com.base.TestBase;
import com.reports.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends TestBase {

    @FindBy(xpath = "//h1[contains(text(),'Sign-In')]")
    private WebElement signInHeader;

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement userInfoInputField;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueBtn;

    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement passwordInputField;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    private WebElement signInBtn;

    public void sendKeyOnUserInputField(String users) {

        userInfoInputField.clear();
        userInfoInputField.sendKeys(users);
        ExtentTestManager.log("user info has been input");

    }

    public void clickOnContinueBtn() {

        continueBtn.click();

    }

    public void sendKeyOnPasswordInputField(String password) {

        passwordInputField.clear();
        passwordInputField.sendKeys(password);
        ExtentTestManager.log("password info has been input");

    }

    public void clickOnSignInBtn() {

        signInBtn.click();

    }


}
