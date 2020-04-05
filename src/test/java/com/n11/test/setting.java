package com.n11.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class setting {
    protected static WebDriver driver;
    static WebDriverWait wait;
    static String webSiteMainUrl="http://www.n11.com";

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
         driver=new ChromeDriver();
    }
    @AfterClass
    public static void after() throws InterruptedException{
        System.out.println("MustafaZengin");
        // Thread.sleep(3000);
    }
    public  String getUrl(){
        return webSiteMainUrl;
    }
    public WebDriver getDriver(){
        return driver;
    }
}
