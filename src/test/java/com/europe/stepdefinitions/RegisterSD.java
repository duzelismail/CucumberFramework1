package com.europe.stepdefinitions;

import com.europe.pages.AmazonRegisterPage;
import com.europe.utilities.Driver;
import com.europe.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class RegisterSD {
    AmazonRegisterPage arp = new AmazonRegisterPage();



    @Given("kullanici amazon ana sayfasina gider")
    public void kullanici_amazon_ana_sayfasina_gider() {
        ReusableMethods.amazonMainPage();
        ReusableMethods.wait(1000);

    }
    @Given("mausu hello,anmelden butonuna götürür")
    public void mausu_hello_anmelden_butonuna_götürür() {
        arp.registerNav.click();
    }
    @Given("erstellen butonuna tiklar")
    public void erstellen_butonuna_tiklar() {
        arp.erstellen.click();
    }

    @When("kullanici bilgileri girer ve submit eder")
    public void kullanici_bilgileri_girer_ve_submit_eder() {
        arp.nameBox.sendKeys("Ahmet karaca");
        arp.emailBox.sendKeys("akaraca123344352@uzp.com");
        arp.passwordBox.sendKeys("Ap12345.");
        arp.passwordCheck.sendKeys("Ap12345.");
        arp.submitButton.click();
    }


    @Then("kullanici puzzlei görür")
    public void kullaniciPuzzleiGörür() {
        String expectedText = "Lösen Sie dieses Puzzle, um Ihr Konto zu schützen.";
        String puzzleText = arp.puzzleText.getText();

        Assert.assertEquals(expectedText,puzzleText);
    }
}
