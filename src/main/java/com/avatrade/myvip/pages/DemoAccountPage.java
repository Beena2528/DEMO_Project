package com.avatrade.myvip.pages;

import com.avatrade.myvip.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;

import static com.avatrade.myvip.drivermanager.ManageDriver.driver;

public class DemoAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(DemoAccountPage.class.getName());

    public DemoAccountPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "name")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "lastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "phoneInput")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[2]/div[1]/main[1]/article[1]/div[2]/div[1]/section[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[1]/div[1]/label[1]")
    WebElement newsletters;
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[2]/div[1]/main[1]/article[1]/div[2]/div[1]/section[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[4]/div[1]/div[1]/div[1]/label[1]")
    WebElement tearmsandcondition ;
    @CacheLookup
    @FindBy(xpath ="//p[@id='EHVasdAgxmBWgCe']")
    WebElement pressAndHold ;
    @CacheLookup
    @FindBy(id = "avaWidgetSubmit")
    WebElement createAccount ;



    public void enterFirstName(String name) {
        log.info("Enter first name: " + firstName.toString());
        sendTextToElement(firstName, name);
    }
    public void enterLastName(String name1) {
        log.info("Enter last name: " + firstName.toString());
        sendTextToElement(lastName, name1);
    }
    public void enterEmailId(String emailID) {
        log.info("Enter email id: " +email.toString());
        sendTextToElement(email, emailID);
    }
    public void enterPhoneNumber(String number) {
        log.info("Enter phone number: " +email.toString());
        sendTextToElement(phoneNumber, number);
    }
    public void clickOnCheckButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        log.info("Click on check button : " +newsletters.toString());
        clickOnElement(newsletters);

    }
    public void clickOnCheckButton1() {
        log.info("Click on check button1 : " +tearmsandcondition.toString());
        clickOnElement(tearmsandcondition);
    }
    public void clickOnCreateAccount() {

        log.info("Click on create account button : " +createAccount.toString());
        clickOnElement(createAccount);

    }


}
