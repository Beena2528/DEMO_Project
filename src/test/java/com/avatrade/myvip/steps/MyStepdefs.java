package com.avatrade.myvip.steps;

import com.avatrade.myvip.pages.DemoAccountPage;
import com.avatrade.myvip.pages.HomePage;
import com.avatrade.myvip.pages.TradePage;
import com.avatrade.myvip.utility.Utility;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.awt.*;
import java.awt.event.InputEvent;

public class MyStepdefs extends Utility {
    public static String email = getRandomString(5) + "@gmail.com";

    @Given("^I am on homePage$")
    public void iAmOnHomePage() {
    }

    @When("^I click on try free demo button$")
    public void iClickOnTryFreeDemoButton() {
        new HomePage().clickOnTryFreeDemo();
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String name) throws InterruptedException {
        Thread.sleep(10000);
        new DemoAccountPage().enterFirstName(name);

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName) throws InterruptedException {
        Thread.sleep(10000);
        new DemoAccountPage().enterLastName(lastName);

    }

    @And("^I enter email id$")
    public void iEnterEmailId() throws InterruptedException {
        Thread.sleep(10000);
        new DemoAccountPage().enterEmailId(email);

    }

    @And("^I enter phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String phoneNumber) throws InterruptedException {
        Thread.sleep(10000);
        new DemoAccountPage().enterPhoneNumber(phoneNumber);

    }

    @And("^I click on both check box$")
    public void iClickOnBothCheckBox() throws InterruptedException {
        Thread.sleep(10000);
        new DemoAccountPage().clickOnCheckButton();
        Thread.sleep(10000);
        new DemoAccountPage().clickOnCheckButton1();

    }

    @And("^I click on create account$")
    public void iClickOnCreateAccount() throws InterruptedException {
        Thread.sleep(10000);
        new DemoAccountPage().clickOnCreateAccount();

    }

    @And("^I click on skip tutorial pop-up$")
    public void iClickOnSkipTutorialPopUp() {
        new TradePage().clickOnSkipTutorialPopup();
    }

    @And("^I click on close button pop-up$")
    public void iClickOnCloseButtonPopUp() {
        new TradePage().clickOnCloseButton();
    }

    @And("^I Select Trade tab on left side$")
    public void iSelectTradeTabOnLeftSide() {

    }

    @And("^I Scroll down for categories list and select crypto$")
    public void scrollDownForCategoriesListAndSelectCrypto() {
        new TradePage().ClickOnCryptoCurrency();
    }

    @And("^I Select five random cryptocurrencies and click the star icon$")
    public void iSelectRandomCryptocurrenciesAndClickTheStarIcon() throws InterruptedException {
        Thread.sleep(6000);
        new TradePage().ClickOnStarButtonOfBCHUSDCurrency();
    }

    @And("^I Select the favourites button$")
    public void iSelectTheFavouritesButton() {
        new TradePage().clickOnFavouriteButton();

    }

    @Then("^I verify all the options are available in favourites$")
    public void iVerifyAllTheOptionsAreAvailableInFavourites() {
//        int expectedNumberOfItems=5;
//        Assert.assertEquals("No matchfound",expectedNumberOfItems,new TradePage().verifyAllItemsAddedInCard());
        new TradePage().verifyAllItemAddedInCard1();
    }
}
