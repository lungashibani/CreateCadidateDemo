package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;


public class CreateNewClientPage {
    public WebDriver ldriver;

    public CreateNewClientPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//span[@id='UniversalPlus-action-2']")
    @CacheLookup
    WebElement btnClientContact;

    By txtFirstName = By.xpath("//input[@name='first_name']");

    By txtFamilyName = By.xpath("//input[@name='family_name']");


    @FindBy(xpath = "//div[@data-testid='Gender-label']//div")
    @CacheLookup
    WebElement btnDropdownGender;

    @FindBy(xpath = "//ul[@class='MuiList-root MuiMenu-list MuiList-padding']//li[@data-value='male']")
    @CacheLookup
    WebElement btnSelectsGender;

    By txtJobTitle = By.xpath("//input[@name='job_title']");

    By txtOrganisation_menu = By.xpath("//input[@id='organisation-lookup']");

    @FindBy(xpath = "//div[@class='MuiBox-root jss1462']//button")
    @CacheLookup
    WebElement btnCurrentPositionContactDetails;

    @FindBy(xpath = "//ul[@class='MuiList-root MuiMenu-list jss1464 MuiList-padding']//li[@data-testid='mobile-contact-option']")
    @CacheLookup
    WebElement btnMobilePhone;

    By txtMobilePhone = By.xpath("//input[@name='phoneNumber']");

    By txtBackgroundInfo = By.xpath("//textarea[@name='background_information']");

    @FindBy(xpath = "//button[@data-testid='create_clientSubmit']")
    @CacheLookup
    WebElement btnCreate;

    //#########################Actions################################//


    public void clickBtnClientContact() {
        btnClientContact.click();
    }

    public void setTxtFirstName(String firstName) {
        ldriver.findElement(txtFirstName).sendKeys(firstName);
    }

    public void setTxtFamilyName(String familyName) {
        ldriver.findElement(txtFamilyName).sendKeys(familyName);
    }


    public void clickBtnSelectsGender() {
        btnDropdownGender.click();
    }

    public void clickBtnDropdownGender() {
        btnSelectsGender.click();
    }

    public void setTxtJobTitle(String jobTitle) {
        ldriver.findElement(txtJobTitle).sendKeys(jobTitle);
    }

    public void setTxtOrganisation_menu(String organisation) {
        ldriver.findElement(txtOrganisation_menu).sendKeys(organisation);
        clickOrganisation_menuitem();
        clickOpen();
    }




    public void clickOrgNameInput() throws Exception {


        Pattern fileNameInput = new Pattern("C:\\Users\\SHIBL\\Desktop\\scripts\\orgName.PNG");
        //org.sikuli.script.Pattern openButton = new Pattern("C:\\Users\\SHIBL\\Desktop\\UploadResume\\OpenButton.PNG");

        Thread.sleep(5000);

        Screen screen = new Screen();

        screen.click(fileNameInput);



    }

    public void clickOpen() {

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }



    public void clickOrganisation_menuitem() {
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        //WebElement element = waiting.until(ExpectedConditions.visibilityOfElementLocated(txtOrganisation_menuitem));
        //element.click();
        ldriver.findElement(txtOrganisation_menu);
        java.util.List<By> locators = new ArrayList<>();
        locators.add(txtOrganisation_menu);
        //locators.add(By.cssSelector("div.someClass"));
        // add all your locators to the List<>

        for (By locator : locators)
        {
            List<WebElement> elements = ldriver.findElements(locator);
            if (elements.size() > 0)
            {
                elements.get(0).click();
                break;
            }
        }


    }












    public void clickBtnCurrentPositionContactDetails() {
        btnCurrentPositionContactDetails.click();
    }

    public void clickBtnMobilePhone() {
        btnMobilePhone.click();
    }

    public void setTxtMobilePhone(String mobilePhone) {
        ldriver.findElement(txtMobilePhone).sendKeys(mobilePhone);
    }

    public void setTxtBackgroundInfo(String backgroundInfo) {
        ldriver.findElement(txtBackgroundInfo).sendKeys(backgroundInfo);
    }

    public void clickCreate() {
        btnCreate.click();
    }



















}
