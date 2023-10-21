package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuAppPage;

public class HerokuappStepdefinitions {

    HerokuAppPage herokuAppPage=new HerokuAppPage();

    @When("Add element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuAppPage.addElementButonu.click();
    }

    @When("Delete butonu goronor oluncaya kadar bekler")
    public void delete_butonu_goronor_oluncaya_kadar_bekler() {
        //Buton implicitly wait süresi içinde görünün olduğundan bu adımda kod yazılmadı
    }

    @Then("Delete butonunun gorunur oldugunu test eder")
    public void deleteButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(herokuAppPage.deleteButonu.isDisplayed());
    }

    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuAppPage.deleteButonu.click();
    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {

        try {
            if (herokuAppPage.deleteButonu.isDisplayed()){
                Assert.assertTrue(false);
            }
        } catch (NoSuchElementException e) {
            Assert.assertTrue(true);
        }
    }


}
