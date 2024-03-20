package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SberPage {
    public SelenideElement cookies  = $(byXpath("//button[@class='sbl-btn sbl-btn_large m-0']"));
    public SelenideElement sberLeasing  = $(byXpath("//a[@href='/automall/#marketplace-horizontal-filter-title']"));

}
