package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SaucedemoPage;

public class SaucedemoStepdefinitions {

    SaucedemoPage saucedemoPage=new SaucedemoPage();
    String ilkUrunIsim="";

    @Then("Username kutusuna {string} yazar")
    public void usernameKutusunaYazar(String username) {
        saucedemoPage.userNameBox.sendKeys(username);

    }

    @And("Password kutusuna {string} yazar")
    public void passwordKutusunaYazar(String password) {
        saucedemoPage.passwordBox.sendKeys(password);

    }

    @Then("Souce login butonuna basar")
    public void souce_login_butonuna_basar() {
        saucedemoPage.loginButton.click();

    }
    @When("lk urunun ismini kaydeder ve bu urunun sayfasina gider")
    public void lk_urunun_ismini_kaydeder_ve_bu_urunun_sayfasina_gider() {
        ilkUrunIsim=saucedemoPage.ilkUrunElement.getText();
        saucedemoPage.ilkUrunElement.click();


    }
    @When("Add to Cart butonuna basar")
    public void add_to_cart_butonuna_basar() {
        saucedemoPage.addToCartButton.click();

    }
    @Then("Alisveris sepetine tiklar")
    public void alisveris_sepetine_tiklar() {
        saucedemoPage.alisverisSepeti.click();

    }
    @Then("Sectigi urunun basarili olarak sepete eklendigini control eder")
    public void sectigi_urunun_basarili_olarak_sepete_eklendigini_control_eder() {
        String actualUrunIsim=saucedemoPage.sepetUrunElement.getText();
        Assert.assertEquals(ilkUrunIsim,actualUrunIsim);

    }


}
