package com.virgingames.steps;

import com.virgingames.pages.homepage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class myHomepageStep {
    @Given("^user is on homepage$")
    public void userIsOnHomepage() {
        System.out.println("user is on homepage");
    }

    @When("^user clicks on accept all cookies$")
    public void userClicksOnAcceptAllCookies() {
        new homepage().clickOnAcceptCookies();
    }

    @Then("^user verify welcome message \"([^\"]*)\"$")
    public void userVerifyWelcomeMessage(String message){
        Assert.assertEquals(new homepage().verifyWelcomeText(),message,"incorrect message");
    }

    @And("^user clicks on casino$")
    public void userClicksOnCasino() {
        new homepage().clickCasino();
    }

//    @And("^verify there are (\\d+) popular casino games$")
//    public void verifyThereArePopularCasinoGames(int expected) {
//     Assert.assertEquals(expected,new homepage().numberItems(),"not matched");
//
//    }

    @Then("^prints name of all popular casino games$")
    public void printsNameOfAllPopularCasinoGames() {
      new homepage().listItems();
    }





    @And("^see there are (\\d+) classic casino games$")
    public void seeThereAreClassicCasinoGames(int a) {
        int b=new homepage().numberItems();
        Assert.assertEquals(a,b,"pass");
    }
}
