package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FavoritesPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public FavoritesPage() {
        methods = new Methods();
    }

    //Favorilerim sayfasına gitme
    public void goToFavoritesPage() {
        methods.mouseHover(By.cssSelector(".my-list .common-sprite"));
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".menu.my-list.top > ul  div > ul > li:nth-of-type(1) > a"));
        methods.waitBySeconds(5);
    }

    //Favorilere eklenen ürünlerin kontrolü
    public void verifyTheFavorites() {
        goToFavoritesPage();
        methods.waitBySeconds(5);
        String str = methods.getText(By.cssSelector(".favorite-tag > span"));
        logger.info("Favori ürün sayısı:" + str);
        Assert.assertEquals("4", str); // Favori ürün kontrolü
    }

    //Attribute alarak,ilgili attribute sahip ürünü favorilerden kaldırmak
    public void deleteFavorite() {
        String attribute = methods.getAttribute(By.xpath("//*[@class='product-cr'][3]"), "id");
        logger.info("id: " + attribute);
        String str = attribute;
        String id = str.replace("product-", "");
        logger.info("Unique id: " + id);
        methods.click(By.cssSelector(".display > .display-item.sprite"));
        methods.waitBySeconds(5);
        methods.mouseHover(By.cssSelector("div:nth-of-type(3) > .image"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//*[@onclick='removeFromFavorites(" + id + ");']"));
        methods.waitBySeconds(5);
    }
}
