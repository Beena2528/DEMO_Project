package com.avatrade.myvip.pages;

import com.avatrade.myvip.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.avatrade.myvip.drivermanager.ManageDriver.driver;

public class TradePage extends Utility {
    private static final Logger log = LogManager.getLogger(TradePage.class.getName());

    public TradePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Skip Tutorial')]")
    WebElement skipTutorial;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Close']")
    WebElement closeButton;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Crypto')]")
    WebElement cryptoCurrency;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='watchlist-entity.component_favCell__1pYE6']//i//i)[1]")
    WebElement bCHUSD;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='watchlist-entity.component_favCell__1pYE6']//i//i)[2]")
    WebElement bTCEUR;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='watchlist-entity.component_favCell__1pYE6']//i//i)[3]")
    WebElement bTCJPY;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Favorites')]")
    WebElement favorites;
    @CacheLookup
    @FindBy(xpath = "//span[@data-qa='watchlist-entity__symbol-cell']")
    List<WebElement> allProduct;

    public void clickOnSkipTutorialPopup() {
        log.info("Click on skip tutorial popup : " + skipTutorial.toString());
        clickOnElement(skipTutorial);
    }

    public void clickOnCloseButton() {
        driver.switchTo().frame(driver.findElement(By.className("iframe_container__1x0Nc")));
        log.info("Click on close button: " + closeButton.toString());
        clickOnElement(closeButton);
        driver.switchTo().defaultContent();
    }

    public void ClickOnCryptoCurrency() {
        log.info("Click on crypto currency: " + cryptoCurrency.toString());
        clickOnElement(cryptoCurrency);

    }

    public void ClickOnStarButtonOfBCHUSDCurrency() {
        log.info("Click on BCHUSD star icon: " + bCHUSD.toString());
        clickOnElement(bCHUSD);
        log.info("Click on BTCEUR star icon: " + bTCEUR.toString());
        clickOnElement(bTCEUR);
        log.info("Click on bTCJPY star icon: " + bTCJPY.toString());
        clickOnElement(bTCJPY);
    }
    public void clickOnFavouriteButton(){
        log.info("Click on favorites button " + favorites.toString());
        clickOnElement(favorites);
    }
    public int verifyAllItemsAddedInCard() {
        log.info("Verify Five product added to the cart : " + allProduct.toString());
        return allProduct.size();

        }
    public void verifyAllItemAddedInCard1() {
        for (WebElement list : allProduct) {
            System.out.println("Favourite list"+list.getText());
        }
    }
        }




