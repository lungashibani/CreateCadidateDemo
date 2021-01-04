package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class CreateCandidatesPage {

    public WebDriver ldriver;

    public CreateCandidatesPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }


    @FindBy(xpath = "//div[@class='modal-content background-customizable modal-content-desktop visible-md visible-lg']//input[@id='signInFormUsername']")
    @CacheLookup
    WebElement txtUsername;

    @FindBy(xpath = "//div[@class='modal-content background-customizable modal-content-desktop visible-md visible-lg']//input[@id='signInFormPassword']")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = "//div[@class='modal-content background-customizable modal-content-desktop visible-md visible-lg']//input[@name='signInSubmitButton']")
    @CacheLookup
    WebElement btnSignIn;


    @FindBy(xpath = "//div[@class=\"MuiSpeedDial-root MuiSpeedDial-directionUp jss143\"]//button//span//span")
    @CacheLookup
    WebElement btnUniversalPlusSign;

    @FindBy(xpath = "//span[@id='UniversalPlus-action-0']")
    @CacheLookup
    WebElement btnCreateCandidate;

//#########################################ACTIONS#################################################################


    By txtFirstName = By.xpath("//input[@name='first_name']");

    By txtFamilyName = By.xpath("//input[@name='family_name']");

    By txtCityOrTownOrSuburbs = By.xpath("//input[@name='city']");



    @FindBy(xpath = "//button[@data-testid='addContactButton']//span//span")
    @CacheLookup
    WebElement btnAddContacts;

    @FindBy(xpath = "//div[@class='MuiPaper-root MuiMenu-paper MuiPopover-paper MuiPaper-elevation8 MuiPaper-rounded']//ul//li[@data-testid='mobile-contact-option']")
    @CacheLookup
    WebElement btnAddContactsItem;

    By txtAddMobile = By.xpath("//input[@name='phoneNumber']");

    By txtJobTitle = By.xpath("//input[@name='role.job_title']");

    By txtOrganisation_menuitem = By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-direction-xs-column']//input[@name='role.organisation_name']");

    By lnkPositionType_menu = By.xpath("//div[@id='mui-component-select-role.position_type']");

    By lnkPositionType_menuitem = By.xpath("//li[@data-value='temp']");

    By txtDesiredWorkLocation = By.xpath("//input[@name='desired_locations']");
//
//    By txtInterviewNotes = By.xpath("//textarea[@name='background_information']");

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']//span//span")
    @CacheLookup
    WebElement btnCreate;

    @FindBy(xpath = "//div[@class='MuiPaper-root MuiSnackbarContent-root jss1220 jss1254 MuiPaper-elevation6']")
    @CacheLookup
    WebElement btnView;





    //#######################################################ACTIONS################################################



    public void setTxtUsername(String uname) {
        txtUsername.clear();
        txtUsername.sendKeys(uname);
    }

    public void setTxtPassword(String pwd) {
        txtPassword.clear();
        txtPassword.sendKeys(pwd);
    }

    public void clickBtnSignIn() {
        btnSignIn.click();
    }

    public void clickBtnUniversalPlusSign() {
        btnUniversalPlusSign.click();
    }

    public void clickBtnCreateCandidate() {
        btnCreateCandidate.click();
    }


    public void setTxtFirstName(String firstName) {
        ldriver.findElement(txtFirstName).sendKeys(firstName);
    }

    public void setTxtFamilyName(String familyName) {
        ldriver.findElement(txtFamilyName).sendKeys(familyName);
    }

    public void setTxtCityOrTownOrSuburbs(String cityOrTownOrSuburbs) {
        ldriver.findElement(txtCityOrTownOrSuburbs).sendKeys(cityOrTownOrSuburbs);
    }

    public void clickBtnAddContacts(){
        btnAddContacts.click();
        btnAddContactsItem.click();
    }

    public void setTxtAddMobile(String mobile) {
        ldriver.findElement(txtAddMobile).sendKeys(mobile);
    }

    public void setTxtJobTitle(String jobTitle) {
        ldriver.findElement(txtJobTitle).sendKeys(jobTitle);
    }

//    public void setTxtOrganisation(String organisation) {
//        ldriver.findElement(txtOrganisation).sendKeys(organisation);
//    }
//    public void clickOrganisation_menuitem() {
//        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
//        //WebElement element = waiting.until(ExpectedConditions.visibilityOfElementLocated(txtOrganisation_menuitem));
//        //element.click();
//        ldriver.findElement(txtOrganisation_menuitem);
//        List<By> locators = new ArrayList<>();
//        locators.add(txtOrganisation_menuitem);
//        //locators.add(By.cssSelector("div.someClass"));
//        // add all your locators to the List<>
//
//        for (By locator : locators)
//        {
//            List<WebElement> elements = ldriver.findElements(locator);
//
//            if (elements.size() > 0)
//            {
//                elements.get(0).click();
//                break;
//            }
//        }
//
//
//    }





    public void clickLnkPositionTypeMenu(){
        ldriver.findElement(lnkPositionType_menu).click();
    }

    public void clickLnkPositionTypeMenuItem() {
        ldriver.findElement(lnkPositionType_menuitem).click();;
    }

    public void setTxtDesiredWorkLocation(String workLocation) {
        ldriver.findElement(txtDesiredWorkLocation).sendKeys(workLocation);
    }



    public void clickBtnCreate(){
        btnCreate.click();
    }

    public void clickBtnView(){
        btnView.click();
    }
}
