import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

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
}

