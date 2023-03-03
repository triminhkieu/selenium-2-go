/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.swp.selenium.go;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author Admin
 */
public class Selenium2Go {

    public static void main(String[] args) {
        searchGoogle();
    }
    //test case 1: check if the Google search engine returns websites as desired
    //steps:
    //1. Open a certain browser, e.g. Chrome
    //2. Type the UI: https://google.com
    //3. Type the keyword: "See tinh"
    //4. Hit enter
    //expected:
    // a list of web pages with the keyword "See tinh" included are showed as the desired
    // are showed as the expected!
    public static void searchGoogle() {
        WebDriver myBrowser;
        String driverPath = "chromedriver.exe";
        System.setProperty("Webdriver.chrome.driver", driverPath);
        
        ChromeOptions options = new ChromeOptions();
        //khai bao cac tham so khi mo trinh duyet: an danh, ngon ngu
        options.addArguments("--incognito");
        options.addArguments("--lang=ja-JP");
        
        myBrowser = new ChromeDriver(options); //trinh duyet duoc tai vao RAM, appear on desktop
                                        //myBrowser laf bien object tro vao tab trinh duyet
        myBrowser.get("https://google.com");
        myBrowser.manage().window().maximize();
        WebElement txtSearchBox = myBrowser.findElement(By.name("q"));
        txtSearchBox.sendKeys("See tinh");
        txtSearchBox.submit(); //nhan enter tren o search
    }
}
