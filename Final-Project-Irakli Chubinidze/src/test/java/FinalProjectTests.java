import Pages.Rest;
import Pages.MainPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Configuration.baseUrl;

@Listeners({SoftAsserts.class})
public class FinalProjectTests {
    private MainPage mainP = new MainPage();
    private Rest restP = new Rest();
    public FinalProjectTests(){
        Configuration.timeout=3000;
        Configuration.browser="chrome";
        Configuration.browserSize="1920x1080";
        baseUrl="https://www.swoop.ge/";
    }

    @Test(priority = 0)
    public void firstTask(){
        mainP.Open();
        mainP.OpenLoginModal();
        mainP.Login("iraklichubinidze@mail.ru", "dontuse mail.ru");
        mainP.GetAuthInfo().should(appear);
        mainP.GetAuthInfo().shouldHave(exactText("მეილი ან პაროლი არასწორია, თუ დაგავიწყდათ პაროლი,გთხოვთ ისარგებლოთ პაროლის აღდგენის ფუნქციით!"));
        mainP.GetPasswordField().text().isEmpty();
    }

    @Test(priority = 1)
    public void secondTask(){
        mainP.Open();
        mainP.OpenLoginModal();
        mainP.SelectJuridialRegister();
        mainP.GetWarningText().should(appear);
        mainP.GetSubscriptionCheckbox().shouldBe(checked);
    }

    @Test(priority = 3)
    public void fourthTask(){
        restP.clickRest();
        restP.fillFilter("170", "180");
        restP.searchClick();
        sleep(3000);
        System.out.println($$(".discounted-prices"));
    }
}
