package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.FavoritesPage;
import com.kitapyurdu.page.LoginPage;
import com.kitapyurdu.page.ProductPage;
import org.junit.Test;

public class FavoritesTest extends BaseTest {

    @Test
    public void favoritesTest() {
        FavoritesPage favoritesPage = new FavoritesPage();
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        loginPage.login();
        productPage.search();
        productPage.addToFavorites();
        favoritesPage.verifyTheFavorites();
        favoritesPage.deleteFavorite();
    }
}
