package com.amazontest;

import com.amazon.data.DataProviders;
import com.amazon.pages.HomePage;
import com.amazon.pages.SignInPage;
import com.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignInValidation extends TestBase {


    @Test(dataProviderClass = DataProviders.class, dataProvider = "credentials", enabled = false)
    public void validateLogin(String user, String password) {

        SignInPage signInPage = PageFactory.initElements(driver,SignInPage.class);
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);

        homePage.mouseOverOnAccountListNavBtn();
        homePage.clickOnSignInBtn();

        signInPage.sendKeyOnUserInputField(user);
        signInPage.clickOnContinueBtn();
        signInPage.sendKeyOnPasswordInputField(password);
        signInPage.clickOnSignInBtn();

    }

}
