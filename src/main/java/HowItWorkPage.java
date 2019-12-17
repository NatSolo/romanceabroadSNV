import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HowItWorkPage extends BaseActions {

    public HowItWorkPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickJoinButton() {
        driver.findElement(Locators.LINK_BUTTON_REGISTRATION).click();
    }


}
