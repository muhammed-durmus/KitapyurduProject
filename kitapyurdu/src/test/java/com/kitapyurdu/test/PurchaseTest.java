package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.CartPage;
import com.kitapyurdu.page.LoginPage;
import com.kitapyurdu.page.PurchasePage;
import org.junit.Test;

public class PurchaseTest extends BaseTest {
    @Test
    public void buy() {
        PurchasePage purchasePage = new PurchasePage();
        CartPage cartPage = new CartPage();
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        cartPage.goToCart();
        purchasePage.getPurchasePage();
        purchasePage.shipping();
        purchasePage.paymentMethod();
    }
}
