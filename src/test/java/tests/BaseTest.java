package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.FileDownloadMode;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.App;

import static com.codeborne.selenide.Selenide.*;


public class BaseTest {
    App app = new App();


    @BeforeTest
    public void setup(){
        Configuration.holdBrowserOpen = true;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        open("https://www.google.com/");
    }

    @AfterTest
    public void tearDown() {
        closeWebDriver();
    }
}
