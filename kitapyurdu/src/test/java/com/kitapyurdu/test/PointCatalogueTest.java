package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.LoginPage;
import com.kitapyurdu.page.PointCataloguePage;
import org.junit.Test;

public class PointCatalogueTest extends BaseTest {
    @Test
    public void catalogueTest() {
        PointCataloguePage pointCataloguePage = new PointCataloguePage();
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        pointCataloguePage.getPointCataloguePage();
        pointCataloguePage.addRandomProductToCart();

    }
}
