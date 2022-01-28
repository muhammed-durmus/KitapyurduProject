package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;

public class PurchasePage {
    Methods methods;

    public PurchasePage() {
        methods = new Methods();
    }

    //Satın alma sayfasına gitme
    public void getPurchasePage() {
        methods.click(By.cssSelector(".right > .button.red"));
    }

    // Adres bilgilerini doldurma
    public void shipping() {
        methods.click(By.cssSelector("[href='\\#tab-shipping-new-adress']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-firstname-companyname"), "Muhammed");
        methods.sendKeys(By.id("address-lastname-title"), "Durmuş");
        methods.selectItemFromDropBox(By.id("address-zone-id"), "İstanbul");
        methods.waitBySeconds(5);
        methods.selectItemFromDropBox(By.xpath("/html//select[@id='address-county-id']"), "BAĞCILAR");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-address-text"), "meyveli sk. No:1905 Daire:44");
        methods.sendKeys(By.id("address-telephone"), "4224444444");
        methods.sendKeys(By.id("address-mobile-telephone"), "5444444444");
        methods.waitBySeconds(5);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(3);
        methods.click(By.id("button-checkout-continue"));

    }

    //Ödeme bilgilerini doldurma
    public void paymentMethod() {
        methods.waitBySeconds(5);
        methods.sendKeys(By.id("credit-card-owner"), "Muhammed Durmuş");
        methods.sendKeys(By.id("credit_card_number_1"), "4355");
        methods.sendKeys(By.id("credit_card_number_2"), "0843");
        methods.sendKeys(By.id("credit_card_number_3"), "5508");
        methods.sendKeys(By.id("credit_card_number_4"), "4358");
        methods.selectItemFromDropBox(By.id("credit-card-expire-date-month"), "12");
        methods.selectItemFromDropBox(By.id("credit-card-expire-date-year"), "2026");
        methods.sendKeys(By.id("credit-card-security-code"), "000");
        methods.waitBySeconds(5);
    }

}
