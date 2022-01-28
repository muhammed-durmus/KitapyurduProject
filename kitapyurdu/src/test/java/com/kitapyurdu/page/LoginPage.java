package com.kitapyurdu.page;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;
    Logger logger = LogManager.getLogger(LoginPage.class);

    public LoginPage() {
        methods = new Methods();
    }

    //Giriş yapmak
    public void login() {
        methods.click(By.cssSelector(".login.menu-top-button"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-email"), "m.drms1905@gmail.com");
        methods.sendKeys(By.id("login-password"), "1q2w3e4r5t");
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(5);
    }

    //Çıkış yapmak
    public void logout() {
        methods.mouseHover(By.cssSelector(".login.menu.top"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".login ul li:nth-of-type(4)"));
        methods.waitBySeconds(4);
    }
}
