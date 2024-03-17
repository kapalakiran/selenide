import com.codeborne.selenide.CollectionCondition;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class SampleTest {



    @Test
    public void test1(){

        open("https://selenide.org/index.html");
        $$("div[class*=main-menu-pages] a").shouldHave(CollectionCondition.size(7));
    }

    @Test
    public void test2(){
        open("https://reqres.in/");
        $("i[class*=fa-cloud-download]").shouldBe(visible).click();
        System.out.println($("a[style='text-decoration: none']").getText());
    }
}
