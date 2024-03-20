package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GooglePage {
    public SelenideElement googleSearch = $(byXpath("//textarea[@class='gLFyf']"));
    public SelenideElement searchSber = $(byXpath("//h3[@class='LC20lb MBeuO DKV0Md']"));

}
