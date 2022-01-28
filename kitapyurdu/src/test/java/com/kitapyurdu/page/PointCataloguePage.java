package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;

public class PointCataloguePage {
    Methods methods;

    public PointCataloguePage() {
        methods = new Methods();
    }

    //Puan kataloğunda Türk klesiklerini görüntüleme
    //Tüm kitaplar başlığından hobi kategorisini seçme
    public void getPointCataloguePage() {
        methods.click(By.className("logo-icon"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".lvl1catalog > .common-sprite"));
        methods.waitBySeconds(5);
        methods.click(By.cssSelector("img[title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(4);
        methods.selectByText(By.xpath("//*[@class='sort']/select"), "Yüksek Oylama");
        methods.waitBySeconds(5);
        methods.mouseHover(By.xpath("//*[@class='mn-strong common-sprite' and contains(text(),'Tüm Kitaplar')]"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//div[@class='subCategories']//a[@href='kategori/kitap-hobi/1_212.html']"));
        methods.waitBySeconds(4);
    }

    //Rastgele bir ürünü sepete ekleme
    public void addRandomProductToCart() {
        methods.selectRandomProduct(By.cssSelector(".product-cr"), By.cssSelector(".add-to-cart"));
        methods.waitBySeconds(5);
    }
}
