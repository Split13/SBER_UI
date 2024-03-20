package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class SberCarParam {
    public SelenideElement driveFull  = $(byXpath("(//div/div[@class='horizontal-filter-block__checkboxes-item custom-control custom-checkbox'])[2]"));
    public SelenideElement driveFront  = $(byXpath("//label[@for='arrFilter_640_2872832194']"));
    public SelenideElement transmissionAuto  = $(byXpath("//label[@for='arrFilter_638_3090825616']"));
    public SelenideElement carType  = $(byXpath("//label[@title='седан']"));
    public SelenideElement dropMenuColor  = $(byXpath("//label[@aria-label='Цвет']"));
    public SelenideElement fuel  = $(byXpath("//label[@for='arrFilter_629_3390690323']"));
    public SelenideElement engineCapacity  = $(byXpath("//div[@aria-label='pick end value']"));
    public SelenideElement colorWhite  = $(byXpath("//label[@for='arrFilter_289_3783457942']"));
    public SelenideElement showAll = $(byXpath("//a[@class='sbl-btn sbl-btn_medium']"));
    public SelenideElement clickOnCar = $(byXpath("//a[@class='sbl-btn sbl-btn_medium w-100 sbl-btn_detail']"));
    public SelenideElement fullDescription = $(byXpath("//a[@class='sbl-btn sbl-btn_medium sbl-btn_text sbl-btn_secondary w-100']"));
    public SelenideElement firstPageList = $(byXpath("//img[@alt='Jetta']"));










}
