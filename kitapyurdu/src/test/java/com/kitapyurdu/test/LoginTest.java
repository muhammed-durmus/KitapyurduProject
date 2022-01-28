package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.LoginPage;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }

    @Test
    public void logoutTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        loginPage.logout();
    }
}
