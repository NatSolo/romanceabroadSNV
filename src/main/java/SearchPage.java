import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BaseActions {

    public SearchPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);

    }

    public WebElement tabSearch() {
        WebElement titleSearch = driver.findElement(Locators.LINK_BLOG);
        return titleSearch;

    }

    public String getTextFromTabs() {
        return tabSearch().getText();

    }

}
