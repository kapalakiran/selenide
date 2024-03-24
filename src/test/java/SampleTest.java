import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import org.groww.GrowwHomePage;
import org.testng.annotations.Test;
import org.walmart.WalmartHome;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class SampleTest {



    @Test(enabled = false)
    public void test1(){
        open("https://selenide.org/index.html");
        $$("div[class*=main-menu-pages] a").shouldHave(CollectionCondition.size(7));
    }

    @Test(enabled = false)
    public void test2(){
        open("https://reqres.in/");
        $("i[class*=fa-cloud-download]").shouldBe(visible).click();
        System.out.println($("a[style='text-decoration: none']").getText());
    }

    @Test(enabled = false)
    public void test3(){
        open("https://www.walmart.com/");
        new WalmartHome().searchItem();
    }

    @Test
    public void test4() {
        open("https://groww.in/");
        new GrowwHomePage().searchStock();
    }
}
