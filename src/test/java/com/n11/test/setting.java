package com.n11.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setting {
    protected static WebDriver driver;
    static String webSiteMainUrl="http://www.n11.com";

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver1.exe");
         driver=new ChromeDriver();
    }
    @AfterClass
    public static void after() throws InterruptedException{
        Thread.sleep(3000);
    }
    public  String getUrl(){
        return webSiteMainUrl;
    }
    public WebDriver getDriver(){
        return driver;
    }
}
