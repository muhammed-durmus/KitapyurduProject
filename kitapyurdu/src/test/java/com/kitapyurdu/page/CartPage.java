package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CartPage {

    Methods methods;

    public CartPage() {
        methods = new Methods();
    }

    //Sepetim sayfasına gitme
    public void goToCart() {
        methods.click(By.id("cart"));
        methods.waitBySeconds(2);
        methods.click(By.id("js-cart"));
    }

    //Ürün adedini arttırma
    public void raiseQuantity(By by, String quantity) {
        methods.findElement(by).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), quantity);
        methods.click(By.cssSelector("[title='Güncelle']"));
        methods.waitBySeconds(3);
    }
}
