package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import utils.CommonMethods;

public class MainPageSteps extends CommonMethods {

    @Given("kullanıcı enuygun.com sayfasına gider")
    public void kullanıcı_enuygun_com_sayfasına_gider() {
        click(mainPage.cerezKabulEt);
    }

    @When("kullanıcı {string} {string} gidis {string} {string} donus {string} {string} {int} yolcu bilet seçimi yapar")
    public void kullanıcı_gidis_donus_yolcu_bilet_seçimi_yapar(String depDay, String depMonth, String arrDay, String arrMonth, String departurePort, String destPort, int adultPassenger) {
        click(mainPage.gidisDonusField);
        click(mainPage.neredenField);
        sendText(mainPage.neredenField, departurePort);
        mainPage.neredenField.sendKeys(Keys.ENTER);
        click(mainPage.nereyeField);
        sendText(mainPage.nereyeField, destPort);
        mainPage.nereyeField.sendKeys(Keys.ENTER);
        click(mainPage.gidisTarihiField);
        for (int i = 0; i < 12; i++) {
            if (mainPage.firstMonth.getText().equals(depMonth)) {
                for (int j = 0; j < mainPage.firstMonthActiveDepartureDays.size(); j++) {
                    if (mainPage.firstMonthActiveDepartureDays.get(i).getText().equals(depDay)) {
                        mainPage.firstMonthActiveDepartureDays.get(i).click();
                        break;
                    }
                }
            } else if (mainPage.secondMonth.getText().equals(depMonth)) {
                for (int j = 0; j < mainPage.firstMonthActiveDepartureDays.size(); j++) {
                    if (mainPage.firstMonthActiveDepartureDays.get(i).getAttribute("data-day").equals(depDay)) {
                        mainPage.firstMonthActiveDepartureDays.get(i).click();
                        break;
                    }
                }
            } else {
                click(mainPage.departureMonthForwardButton);
            }
        }


    }

    /* @When("kullanıcı 25 temmuz gidis 10 agustos donus verilen kriterlere göre bilet seçimi yapar")
     public void kullanıcı_verilen_kriterlere_göre_bilet_seçimi_papar() throws InterruptedException {
         click(mainPage.gidisDonusField);
         click(mainPage.neredenField);
         Thread.sleep(1000);
         click(mainPage.populerIstanbul);
         Thread.sleep(1000);
         click(mainPage.nereyeField);
         Thread.sleep(1000);
         click(mainPage.populerAnkara);
         click(mainPage.bosAlan);
         click(mainPage.gidisTarihiField);
         for (int i = 0; i < 12; i++) {
             if (mainPage.firstMonth.getText().equals("Temmuz 2024")) {
                 click(mainPage.firstMonthActiveDepartureDaySelect);
                 break;
             } else if (mainPage.secondMonth.getText().equals("Temmuz 2024")) {
                 click(mainPage.secondMonthActiveDepartureDaySelect);
                 break;
             } else {
                 click(mainPage.departureMonthForwardButton);
             }
         }
     }
 */
    @When("kullanıcı çıkan sonuçları filtreler")
    public void kullanıcı_çıkan_sonuçları_filtreler() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("kullanıcı çıkan sonuçlardan kalkış saatlerini doğrular")
    public void kullanıcı_çıkan_sonuçlardan_kalkış_saatlerini_doğrular() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
