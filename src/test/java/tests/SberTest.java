package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import jdk.jfr.Description;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class SberTest extends BaseTest {
    @Test
    @Description("Find car at Lizing")
    @Tag("smoke")
    public void findSberCar() throws InterruptedException {
        getWebDriver().manage().window().maximize();
        app.googlePage.googleSearch.setValue("СберЛизинг");
        app.googlePage.googleSearch.sendKeys(Keys.ENTER);
        app.googlePage.searchSber.click();
        app.sberPage.sberLeasing.click();
        app.sberCarParam.driveFull.click();
        app.sberCarParam.driveFront.click();
        app.sberCarParam.transmissionAuto.click();
        app.sberCarParam.carType.click();
        app.sberCarParam.fuel.click();
        Thread.sleep(3);
        SelenideElement engineCapacity  = $(byXpath("//div[@class='el-slider__button el-tooltip__trigger el-tooltip__trigger']"));
        actions().clickAndHold(engineCapacity).moveByOffset(-40,0).release().build().perform();
        app.sberCarParam.dropMenuColor.click();
        app.sberCarParam.colorWhite.click();
        app.sberCarParam.showAll.click();

        String list = String.valueOf(app.sberCarParam.firstPageList.findElements(byXpath("//img[@alt='Jetta']")).stream().toList());
        String jetta = "Jetta";
        boolean containsJetta = list.contains(jetta);
        System.out.println("Наличие нужной Джетты в списке " + containsJetta);

        app.sberCarParam.clickOnCar.click();
        app.sberCarParam.fullDescription.click();

    }

}
