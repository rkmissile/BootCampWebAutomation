package com.amazon.data;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "searchData")
    public Object[] getSearchData() {
        return new Object[]{"Core Java Books", "Selenium Books", "Data Structure Books"};
    }

    @DataProvider(name = "credentials")
    public Object[][] getCredentials() {
        return new Object[][]{{"Admin", "admin"}, {"aadmin", "admin123"}};
    }

}
