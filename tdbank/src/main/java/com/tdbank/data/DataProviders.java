package com.tdbank.data;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "searchData")
    public Object[] getSearchData() {
        return new Object[]{"Core Java Books", "Selenium Books", "Data Structure Books"};
    }

    @DataProvider(name = "credentials")
    public Object[][] getCredentials() {
        return new Object[][]{{"abcd@gmail.com", "admin123"}};
    }

    @DataProvider(name = "userInfo")
    public Object[] getUserinfo() {
        return new Object[]{"abcd@gmail.com"};
    }

    @DataProvider(name = "passwordInfo")
    public Object[] getPasswordInfo() {
        return new Object[]{"12345678"};
    }




}
