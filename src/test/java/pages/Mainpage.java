package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class Mainpage extends CommonMethods {

    @FindBy(xpath = "//button[text() = 'KABUL ET']")
    public WebElement cerezKabulEt;

    @FindBy(xpath = "//div[text() = 'Gidiş-dönüş']")
    public WebElement gidisDonusField;

    @FindBy(xpath = "//input[@name = 'origin']")
    public WebElement neredenField;

    @FindBy(xpath = "//input[@name = 'destination']")
    public WebElement nereyeField;




    /*@FindBy(xpath = "//div[@data-testid = 'autosuggestion-custom-item-istanbul-city-country']")
    public WebElement istanbulSec;

    @FindBy(xpath = "//div[@data-testid = 'autosuggestion-custom-item-ankara-esenboga-havalimani-city-country']")
    public WebElement ankaraSec;*/


    @FindBy(xpath = "//div[text() = 'Gidiş Tarihi']")
    public WebElement gidisTarihiField;

    @FindBy(xpath = "//button[@data-testid= 'enuygun-homepage-flight-departureDate-month-back-button']")
    public WebElement departureMonthBackButton;

    @FindBy(xpath = "//button[@data-testid= 'enuygun-homepage-flight-departureDate-month-forward-button']")
    public WebElement departureMonthForwardButton;

    /*@FindBy(xpath = "//div[@data-testid= 'enuygun-homepage-flight-departureDate-label']")
    public WebElement departureDatePicker;*/

    /*@FindBy(xpath = "(//h3[@data-testid= 'enuygun-homepage-flight-departureDate-month-name-and-year'])[1]")
    public WebElement departureMonth;

    @FindBy(xpath = "(//h3[@data-testid= 'enuygun-homepage-flight-departureDate-month-name-and-year'])[1]")
    public WebElement arrivalMonth;*/

    @FindBy(xpath = "(//h3[@data-testid= 'enuygun-homepage-flight-departureDate-month-name-and-year'])[1]")
    public WebElement firstMonth;

    @FindBy(xpath = "(//h3[@data-testid= 'enuygun-homepage-flight-departureDate-month-name-and-year'])[2]")
    public WebElement secondMonth;

    /*@FindBy(xpath = "//button[@data-testid= 'datepicker-active-day']")
    public WebElement allDaysOfMonth;*/


    @FindBy (xpath = "(//button[@data-testid ='datepicker-active-day'])")
    public List<WebElement>  firstMonthActiveDepartureDays;

    @FindBy(xpath = "(//button[text()= '25'])[2]")
    public WebElement secondMonthActiveDepartureDaySelect;

    @FindBy(xpath = "//div[@data-testid= 'enuygun-homepage-flight-returnDate-label']")
    public WebElement returnDatePicker;

    @FindBy(xpath = "//button[@data-testid= 'enuygun-homepage-flight-returnDate-month-back-button']")
    public WebElement returnMonthBackButton;

    @FindBy(xpath = "//button[@data-testid= 'enuygun-homepage-flight-returnDate-month-forward-button']")
    public WebElement returnMonthForwardButton;

    @FindBy(xpath = "//span[text() = 'Gidiş kalkış / varış saatleri']")
    public WebElement gidisKalkisVarisSaatleri;

    @FindBy(xpath = "(//div[@class = 'rc-slider-handle rc-slider-handle-1'])[1]")
    public WebElement gidişSaatiSlider1;

    @FindBy(xpath = "(//div[@class = 'rc-slider-handle rc-slider-handle-2'])[1]")
    public WebElement gidişSaatiSlider2;

    @FindBy(xpath = "(//div[@class = 'flight-departure-time']")
    public WebElement gidisKalkisSaatlerListesi;





    public Mainpage(){
        PageFactory.initElements(driver,this);
    }


}
