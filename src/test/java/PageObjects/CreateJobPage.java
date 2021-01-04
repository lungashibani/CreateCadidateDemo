package PageObjects;

import com.sun.xml.internal.ws.resources.UtilMessages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.ArrayList;
import java.util.List;

public class CreateJobPage {

    public WebDriver ldriver;

    public CreateJobPage(WebDriver rdriver) {
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

    @FindBy(xpath = "//*[@id='root']/div/div[3]/button//span[@class='MuiFab-label']")
    @CacheLookup
    WebElement btnUniversalPlusSign;

    @FindBy(xpath = "//span[@id='UniversalPlus-action-1']")
    @CacheLookup
    WebElement btnCreateJob;

    By txtJobTitle = By.xpath("//input[@name='title']");

    By txtOrganisation_menu = By.xpath("//input[@id='organisation-lookup']");

    //By txtOrganisation_menuitem = By.xpath("//*[@value='Second']");
    By txtOrganisation_menuitem = By.cssSelector("input#organisation-lookup");

//    cy.getByTestId('organisation-lookup').within(() => {
//        cy.get('input').type('brent');
//    });
//    cy.get('#organisation-lookup-popup').within(() => {
//        cy.get('li:first').click();
//    });



    By lnkJobStatus_menu = By.xpath("//div[@id='mui-component-select-status']");

    By lnkJobStatus_menuitem = By.xpath("//li[@data-value='lead']");

    By lnkAgreementType_menu = By.xpath("//div[@id='mui-component-select-agreement_type']");

    By lnkAgreementType_menuitem = By.xpath("//ul[@class='MuiList-root MuiMenu-list MuiList-padding']//li[@data-value='contingent']");

    By lnkExclusiveType_menu = By.xpath("//div[@id='mui-component-select-exclusive']");

    By lnkExclusiveTypeType_menuitem = By.xpath("//ul[@class='MuiList-root MuiMenu-list MuiList-padding']//li[@data-value='no']");

    By lnkSource_menu = By.xpath("//div[@id='mui-component-select-source']");

    By lnkSource_menuitem = By.xpath("//ul[@class='MuiList-root MuiMenu-list MuiList-padding']//li[@data-value='lead_from_colleague']");

    By lnkJobType_menu = By.xpath("//div[@id='mui-component-select-type']");

    By lnkJobType_menuitem = By.xpath("//ul[@class='MuiList-root MuiMenu-list MuiList-padding']//li[@data-value='temp']");

    By btnClientPortal = By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[4]/div[2]/div/div/button[1]");

    By btnEmailPortal = By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[4]/div[2]/div/div/button[2]");

    By txtLink = By.xpath("//input[@name='specification']");

    By cbxSelectIfJobPostingIsRequired = By.xpath("//span[@class='MuiIconButton-label']//input[@name='job_posting_required']");

    By txtBackgroundInfo = By.xpath("//div[@class='MuiInputBase-root MuiFilledInput-root MuiFilledInput-underline MuiInputBase-formControl MuiInputBase-multiline MuiFilledInput-multiline']//textarea[@name='background_information']");

    By btnCreate = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary']");

    By btnCancel = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text']");

    @FindBy(xpath = "")
    @CacheLookup
    WebElement btnView;

    @FindBy(xpath = "")
    @CacheLookup
    WebElement btnEllipses;

    @FindBy(xpath = "")
    @CacheLookup
    WebElement btnLinkClientContact;


    @FindBy(xpath = "")
    @CacheLookup
    WebElement txtOrganisation;

    @FindBy(xpath = "")
    @CacheLookup
    WebElement txtClientContact;

    @FindBy(xpath = "")
    @CacheLookup
    WebElement btnSelect;



//*************************************Actions**********************************************************************

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

    public void clickBtnCreateJob() {
        btnCreateJob.click();
    }

    public void setTxtJobTitle(String jobTitle) {
        ldriver.findElement(txtJobTitle).sendKeys(jobTitle);
    }

//    public void setTxtOrganisation_menu(String organisation) {
//        ldriver.findElement(txtOrganisation_menu).sendKeys(organisation);
//    }

    public void clickOrganisation_menuitem() {
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        //WebElement element = waiting.until(ExpectedConditions.visibilityOfElementLocated(txtOrganisation_menuitem));
        //element.click();
        ldriver.findElement(txtOrganisation_menuitem);
        List<By> locators = new ArrayList<>();
        locators.add(txtOrganisation_menuitem);
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

    //    cy.getByTestId('organisation-lookup').within(() => {
//        cy.get('input').type('brent');
//    });
//    cy.get('#organisation-lookup-popup').within(() => {
//        cy.get('li:first').click();
//    });






    public void clickLnkJobStatus_menuitem() {
        ldriver.findElement(lnkJobStatus_menu).click();
        ldriver.findElement(lnkJobStatus_menuitem).click();
    }

    public void clickLnkAgreementType_menuitem() {
        ldriver.findElement(lnkAgreementType_menu).click();
        ldriver.findElement(lnkAgreementType_menuitem).click();
    }

    public void clickLnkExclusiveType_menuitem() {
        ldriver.findElement(lnkExclusiveType_menu).click();
        ldriver.findElement(lnkExclusiveTypeType_menuitem).click();
    }

    public void clickLnkSource_menuitem() {
        ldriver.findElement(lnkSource_menu).click();
        ldriver.findElement(lnkSource_menuitem).click();
    }

    public void clickLnkJobType_menuitem() {
        ldriver.findElement(lnkJobType_menu).click();
        ldriver.findElement(lnkJobType_menuitem).click();
    }

    public void clickBtnClientPortal() {
        ldriver.findElement(btnClientPortal);
    }

    public void clickBtnEmailPortalButton() {
        ldriver.findElement(btnEmailPortal);
    }

    public void setTxtLink(String link) {
        ldriver.findElement(txtLink).sendKeys(link);
    }

    public void clickCbxSelectIfJobPostingIsRequired() {
        ldriver.findElement(cbxSelectIfJobPostingIsRequired).click();
    }

    public void setTxtBackgroundInfo(String backgroundInfo){
        ldriver.findElement(txtBackgroundInfo).sendKeys(backgroundInfo);
    }

    public void clickBtnCreate(){
        ldriver.findElement(btnCreate).click();
    }

    public void clickBtnCancel(){
        ldriver.findElement(btnCancel).click();
    }

    //######################################View Button###################################################

    //######################################Link Client Contact###########################################

    public void clickBtnEllipses() {
        btnEllipses.click();
    }

    public void clickBtnLinkClientContact() {
        btnLinkClientContact.click();
    }

    public void setTxtOrganisation(String pwd) {
        txtOrganisation.clear();
        txtOrganisation.sendKeys(pwd);
    }

    public void setTxtClientContact(String pwd) {
        txtClientContact.clear();
        txtClientContact.sendKeys(pwd);
    }

    public void clickBtnSelect() {
        btnSelect.click();
    }


}

