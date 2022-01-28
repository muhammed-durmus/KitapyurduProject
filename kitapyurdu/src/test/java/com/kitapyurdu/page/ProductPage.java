package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {
    Methods methods;

    public ProductPage() {
        methods = new Methods();
    }

    //Oyuncak araması yapma
    public void search() {
        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.click(By.cssSelector(".button-search"));
    }

    // 7.ürüne kadar sayfayı kaydırma
    public void scrollToSeventhProduct() {
        methods.scrollWithAction(By.cssSelector("div:nth-of-type(7) > .grid_7.omega"));
        methods.waitBySeconds(3);
    }

    // Ürünleri favorilere ekleme
    public void addToFavorites() {
        methods.addFavorites(By.cssSelector(".product-cr"), By.cssSelector(".add-to-favorites"));
        methods.waitBySeconds(4);
    }

}
