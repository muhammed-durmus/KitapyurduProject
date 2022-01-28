package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.AccountPage;
import com.kitapyurdu.page.LoginPage;
import org.junit.Test;

public class AccountTest extends BaseTest {
    @Test
    public void loginControlTest() {
        AccountPage accountPage = new AccountPage();
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        accountPage.loginControl();
    }
}
