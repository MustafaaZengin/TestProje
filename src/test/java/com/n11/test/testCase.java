package com.n11.test;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.support.ui.WebDriverWait;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class testCase extends page {
    WebDriverWait wait= new WebDriverWait(driver,500);

    @Test
    public void test_1_1_WebSiteControl(){
        driver.get("http://www.n11.com");
        waitForPageLoad();
        Assert.assertTrue(driver.getTitle().equals("n11.com - Alışverişin Uğurlu Adresi"));
        System.out.println("N11 Sitesi Açıldı");
    }
    @Test
    public void test_1_2_loginPageReadyControl(){
        findByClassName("btnSignIn").click();
        wait.until(elementClickableById("loginButton"));
        Assert.assertTrue(driver.getTitle().equals("Giriş Yap - n11.com"));
        System.out.println("Kullanıcı giriş sayfası");
    }
    @Test
    public void test_1_3_loginControl(){
        findById("email").sendKeys("mz.mustafa.zengin@gmail.com");
        findById("password").sendKeys("12345m12345");
        findById("loginButton").click();
        waitForPageLoad();
        Assert.assertTrue(findByClassName("user").getText().equals("Mustafa Zengin"));
        System.out.println("Kullanıcı Girişi Başarılı ...");
    }
    @Test
    public void test_1_4_searchControl() throws InterruptedException{
        wait.until(elementClickableById("searchData"));
        findById("searchData").sendKeys("bilgisayar");
        findByClassName("searchBtn").click();
        System.out.println("Bilgisayar için sonuç bulundu");
    }
    @Test
    public void test_1_5_clickPageAndPageTwoOpenedControl(){
        findByXpad("//*[@class='pagination']/a[2]").click();
        waitForPageLoad();
        Assert.assertTrue(driver.getTitle().contains("Bilgisayar - n11.com - 2/"));
        System.out.println("2. Sayfa Gösterimde ...");
    }
    @Test
    public void test_1_6_productSelected(){
     //   findByXpad(".//*[@id='p-266973503']/div[1]/a").click();
        wait.until(elementClickableByXpad(".//*[@class='columnContent ']/div[1]/a"));
        findByXpad(".//*[@class='columnContent ']/div[1]/a").click();
        System.out.println(" Ürün Seçildi ");
    }
    @Test
    public void test_1_7_addClickBasket(){
        wait.until(elementClickableByClassName("btnAddBasket"));
        findByClassName("btnAddBasket").click();
        System.out.println(" Sepete Eklendi ");
    }
    @Test
    public void test_1_8_clickBasket(){
        wait.until(elementClickableByClassName("myBasket"));
        findByClassName("myBasket").click();
        System.out.println(" Sepete  ");
    }
   /* @Test
    public void test_1_9_spinnerArrow(){
        wait.until(elementClickableByClassName("spinnerArrow"));
        findByClassName("spinnerArrow").click();
        System.out.println(" Sepetteki ürün sayısı arttırıldı ");
    }*/
    @Test
    public void test_2_1_deleteBasket() throws InterruptedException{
        wait.until(elementClickableByXpad(".//*[@class='prodDetail']/div[3]/div[2]/span[1]"));
        findByXpad(".//*[@class='prodDetail']/div[3]/div[2]/span[1]").click();
        System.out.println("Sepet Silindi.");
    }
}