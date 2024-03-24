package org.walmart;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class WalmartHome {

    By homePageUserName = By.cssSelector("input[data-automation-id='header-input-search']");
    public  void searchItem(){
        $(homePageUserName).sendKeys(   new Faker().beer().name()+  Keys.ENTER);

    }
}
