package StepDefinitions;

import PageObjects.CreateJobPage;
import PageObjects.CreateCandidatesPage;
import PageObjects.CreateNewClientPage;
import PageObjects.LinkAnOrganisationToAClientPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.io.StringReader;
import java.util.concurrent.TimeUnit;


public class Steps {

    public WebDriver driver;
    public CreateJobPage lp;
    public CreateCandidatesPage ccp;
    public CreateJobPage cjp;
    public CreateNewClientPage cnc;
    public LinkAnOrganisationToAClientPage lop;



    @Given("User launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver/Chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        lp = new CreateJobPage(driver);
        ccp = new CreateCandidatesPage(driver);
        cjp = new CreateJobPage(driver);
        cnc = new CreateNewClientPage(driver);
        lop = new LinkAnOrganisationToAClientPage(driver);
    }

    @Given("User launch Firefox browser")
    public void user_launch_gecko_driver() {
        System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "//Drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        lp = new CreateJobPage(driver);
        ccp = new CreateCandidatesPage(driver);
        cjp = new CreateJobPage(driver);
        lop = new LinkAnOrganisationToAClientPage(driver);

    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("User enters Username as {string}")
    public void user_enters_username_as(String username) {
        lp.setTxtUsername(username);
    }

    @Then("User enters Password as {string}")
    public void user_enters_password_as(String password) {
        lp.setTxtPassword(password);
    }

    @Then("Clicks on SignIn button")
    public void click_on_sign_in_button() {
        lp.clickBtnSignIn();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @When("User Clicks on Universal Plus Button")
    public void user_clicks_on_universal_plus_button() {
        lp.clickBtnUniversalPlusSign();
    }


    //########################################CREATE CANDIDATE####################################################

    @When("Clicks on Create Candidate Button")
    public void clicks_on_create_candidate_button() {
        ccp.clickBtnCreateCandidate();
    }

    @Then("User enters First Name as {string}")
    public void user_enters_first_name_as(String fName) {
        ccp.setTxtFirstName(fName);
    }

    @Then("User enters Family Name as {string}")
    public void user_enters_family_name_as(String lName) {
        ccp.setTxtFamilyName(lName);
    }

    @Then("User enters City as {string}")
    public void user_enters_cit_as(String cName) {
        ccp.setTxtCityOrTownOrSuburbs(cName);
    }


    @Then("User clicks on Add Contacts button")
    public void user_clicks_on_add_contacts_button() {
        ccp.clickBtnAddContacts();
    }

    @Then("User Adds Mobile Contacts as {string}")
    public void user_adds_mobile_contacts_as(String contactNumber) {
        ccp.setTxtAddMobile(contactNumber);
    }


    @Then("Enters Job Title as {string}")
    public void enters_job_title_as(String title) {
        ccp.setTxtJobTitle(title);
    }



//    @Then("User enters Organisation as {string}")
//    public void user_enters_organisation_as() {
//        ccp.clickOrganisation_menuitem();
//    }

    @Then("User selects Position Type")
    public void user_selects_position_type() {
        ccp.clickLnkPositionTypeMenu();
    }

    @Then("User selects Position Type Item")
    public void user_selects_position_type_item() {
        ccp.clickLnkPositionTypeMenuItem();
    }

    @Then("User enters Desired Work Location as {string}")
    public void user_enters_desired_work_location_as(String location) {
        ccp.setTxtDesiredWorkLocation(location);
    }



    @Then("User clicks on Create")
    public void user_clicks_on_create() {
        ccp.clickBtnCreate();
    }

    @Then("User clicks on View button")
    public void user_clicks_on_view_button() {
        ccp.clickBtnView();
    }

    //##############################################CREATE JOB STEPS##############################################


    @When("Clicks on Create Job Button")
    public void click_on_create_new_job_button() {
        cjp.clickBtnCreateJob();
    }

    @When("User enters Job Title as {string}")
    public void user_enters_job_title_as(String title) {
        cjp.setTxtJobTitle(title);
    }



//    @Then("User searches for Organisation Menu as {string}")
//    public void user_searches_for_organisation_menu_as(String oName) {
//        cjp.setTxtOrganisation_menu(oName);
//    }

    @Then("User selects an Organisation Menu Item")
    public void user_selects_an_organisation_menu_item() {
        cjp.clickOrganisation_menuitem();
    }


    @Then("User clicks on selected Job Status Item")
    public void user_clicks_on_selected_job_status_item() {
        cjp.clickLnkJobStatus_menuitem();
    }

    @Then("User clicks on selected Agreement Type Item")
    public void user_clicks_on_selected_agreement_type_item() {
        cjp.clickLnkAgreementType_menuitem();
    }

    @Then("User clicks on selected Exclusivity Type Item")
    public void user_clicks_on_selected_exclusivity_type_item() {
        cjp.clickLnkExclusiveType_menuitem();
    }

    @Then("User clicks on selected Source Item")
    public void user_clicks_on_selected_source_item() {
        cjp.clickLnkSource_menuitem();
    }

    @Then("User clicks on Job Type Item")
    public void user_clicks_on_job_type_item() {
        cjp.clickLnkJobType_menuitem();
    }

    @Then("Click on Client Email button")
    public void click_on_client_email_button() {
        cjp.clickBtnEmailPortalButton();
    }

    @Then("User enters Link as {string}")
    public void user_enters_link_as(String lName) {
        cjp.setTxtLink(lName);
    }

    @Then("Click Check Box")
    public void click_check_box() {
        cjp.clickCbxSelectIfJobPostingIsRequired();
    }

    @Then("User enters Background info as {string}")
    public void user_enters_background_info_as(String information) {
        cjp.setTxtBackgroundInfo(information);
    }

    @Then("Click on Create button")
    public void click_on_create_button() {
        cjp.clickBtnCreate();
    }

    @Then("Click on Cancel button")
    public void click_on_cancel_button() {
        cjp.clickBtnCancel();
    }


    //###############################################CREATE NEW CLIENT CONTACT#########################################

    @Then("Clicks on Client Contact Button")
    public void clicks_on_client_contact_button() {
        cnc.clickBtnClientContact();
    }

    @Then("User enters First Name of New Client as {string}")
    public void user_enters_first_name_of_new_client_as(String fName) {
        cnc.setTxtFirstName(fName);
    }

    @Then("User enters family Name of New Client as {string}")
    public void user_enters_family_name_of_new_client_as(String familyName) {
        cnc.setTxtFamilyName(familyName);
    }

    @When("User Enters Job Title of New Client as {string}")
    public void user_enters_job_title_of_new_client_as(String jobTitle) {
        cnc.setTxtJobTitle(jobTitle);
    }


    @When("User enters an Organisation Menu Item of New client as {string}")
    public void user_enters_an_organisation_menu_item_of_new_client_as(String orgName) {
        cnc.setTxtOrganisation_menu(orgName);
    }

    //##################################ClickOpen##################################################




    //##################################ClickOpen##################################################


    @Then("User clicks on Organisation Name")
    public void user_clicks_on_organisation_name() {
        cnc.clickOrganisation_menuitem();
    }


    @Then("Clicks on Current Position Contact Details Plus button")
    public void clicks_on_current_position_contact_details_plus_button() {
        cnc.clickBtnCurrentPositionContactDetails();
    }

    @Then("Clicks on Mobile Phone")
    public void clicks_on_mobile_phone() {
        cnc.clickBtnMobilePhone();
    }

    @Then("Enters Mobile Phone as {string}")
    public void enters_mobile_phone_as(String mobilePhone) {
        cnc.setTxtMobilePhone(mobilePhone);
    }


    @Then("Click on Create button for new Client")
    public void click_on_create_button_for_new_client() {
        cnc.clickCreate();
    }




    //###############################################Link Client Contact###################################

    @When("User clicks on Ellipses")
    public void user_clicks_on_ellipses() {
        lp.clickBtnEllipses();
    }

    @Then("Clicks on Link Client Contact")
    public void clicks_on_link_client_contact() {
        lp.clickBtnLinkClientContact();
    }

    @When("User enters Organisation as \\{string}")
    public void user_enters_organisation_as() {

    }

    @When("User enters Client Contact as \\{string}")
    public void user_enters_client_contact_as() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Clicks on Select button")
    public void clicks_on_select_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //###########################################LINK ORGANISATION TO A CLIENT###############################

    @When("User clicks on search button")
    public void user_clicks_on_search_button() {
        lop.clickBtnSearch();
    }

    @Then("Searches for Candidate name as {string}")
    public void searches_for_candidate_name_as(String cName) {
        lop.setTxtSearch(cName);

    }

    @Then("User clicks on Candidate")
    public void user_clicks_on_on_candidate() {
        lop.clickLnkCandidate();
    }


}


