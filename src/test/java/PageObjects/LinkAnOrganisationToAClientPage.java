package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class LinkAnOrganisationToAClientPage {

    public WebDriver ldriver;

    public LinkAnOrganisationToAClientPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root jss47']")
    @CacheLookup
    WebElement btnSearch;

    By txtSearch = By.xpath("//input[@class='MuiInputBase-input']");

//    @FindBy(xpath = "//div[@id='root']//div//div//div//div//div//div//div//div//div//div//div//div//div[@class='MuiBox-root-203 jss1152 jss308 jss1151']")
//    @CacheLookup
//    WebElement lnkCandidate;

    By lnkCandidate = By.xpath("//div[@class='ReactVirtualized__Grid']//div//a[@class='MuiButtonBase-root-280 MuiListItem-root-250 MuiListItem-button-258 jss5237']");




    //#########################################ACTIONS#########################################

    public void clickBtnSearch() {
        btnSearch.click();
    }

    public void setTxtSearch(String candidateName) {
        WebElement element = ldriver.findElement(txtSearch);
        element.sendKeys(candidateName);
        element.sendKeys(Keys.ARROW_DOWN);
        element.sendKeys(Keys.ENTER);

        element.findElement(lnkCandidate).submit();


        WebDriverWait wait = new WebDriverWait(ldriver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(txtSearch));
        // Thread.sleep(3000);
        List<WebElement> search = ldriver.findElements(lnkCandidate);

    }

//    public void clickLnkCandidate(){
//        lnkCandidate.click();
//    }

    public void clickLnkCandidate() {
        WebDriverWait waiting = new WebDriverWait(ldriver, 15, 100);
        WebElement element = waiting.until(ExpectedConditions.visibilityOfElementLocated(lnkCandidate));
        //element.click();
        ldriver.findElement(lnkCandidate);
        List<By> locators = new ArrayList<>();
        locators.add(lnkCandidate);
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
}

