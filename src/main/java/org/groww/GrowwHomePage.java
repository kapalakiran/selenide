package org.groww;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class GrowwHomePage {

   By globalSearch =  By.cssSelector("input[id*=globalSearch]");

   public  void searchStock() {
       $(globalSearch).sendKeys("TATASTEEL");
       $(globalSearch).pressEnter();
   }

}
