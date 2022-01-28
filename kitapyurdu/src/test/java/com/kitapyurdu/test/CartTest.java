package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.CartPage;
import com.kitapyurdu.page.LoginPage;
import com.kitapyurdu.page.PointCataloguePage;
import org.junit.Test;
import org.openqa.selenium.By;

public class CartTest extends BaseTest {

    @Test
    public void cartTest() {
        CartPage cartPage = new CartPage();
        PointCataloguePage pointCataloguePage = new PointCataloguePage();
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        pointCataloguePage.getPointCataloguePage();
        cartPage.goToCart();
        cartPage.raiseQuantity(By.name("quantity"), "4");
    }
}
