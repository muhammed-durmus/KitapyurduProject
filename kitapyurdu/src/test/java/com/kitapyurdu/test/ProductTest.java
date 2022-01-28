package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.page.FavoritesPage;
import com.kitapyurdu.page.LoginPage;
import com.kitapyurdu.page.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {
    @Test
    public void searchTest() {
        ProductPage productPage = new ProductPage();
        productPage.search();
    }

    @Test
    public void scrollAndAddFavoritesTest() {
        ProductPage productPage = new ProductPage();
        LoginPage loginPage = new LoginPage();
        FavoritesPage favoritesPage = new FavoritesPage();
        loginPage.login();
        productPage.search();
        productPage.scrollToSeventhProduct();
        productPage.addToFavorites();
        favoritesPage.verifyTheFavorites();
    }
}
