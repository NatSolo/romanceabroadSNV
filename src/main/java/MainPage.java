import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {

    public MainPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public void clickJoinButton() {

        driver.findElement(Locators.LINK_BUTTON_REGISTRATION).click();
    }

    public WebElement blogTabSearch() {
        WebElement blogTabSearch = driver.findElement(Locators.LINK_BLOG);
        return blogTabSearch;

    }

    public String getTextFromTabs() {
        return blogTabSearch().getText();

    }

    public List<WebElement> getTabsList() {
        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        return links;

    }


    public Integer getTabListNumbers(){
        int listSize = driver.findElements(Locators.TAB_OF_MAIN_PAGE).size();
        return listSize;
    }

    public void completeAdministratorForm(String reason, String nameForContactUs,
                                          String email, String subject, String messageToContactUs){

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.LINK_REASON).click();
        selectValueOfList(Locators.LINK_VALUE_REASON, reason);

        driver.findElement(Locators.TEXT_FIELD_YOUR_NAME).sendKeys(nameForContactUs);

        driver.findElement(Locators.TEXT_FIELD_YOUR_EMAIL).sendKeys(email);


        driver.findElement(Locators.TEXT_FIELD_SUBJECT).sendKeys(subject);

        driver.findElement(Locators.TEXT_FIELD_MESSAGE).sendKeys(messageToContactUs);






    }
}

