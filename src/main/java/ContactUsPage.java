import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ContactUsPage extends BaseActions {

    public ContactUsPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
    }

    public void completeAdministratorForm(String reason, String nameForContactUs,
                                          String email, String subject, String messageToContactUs) {

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.LINK_REASON).click();
        selectValueOfList(Locators.LINK_VALUE_REASON, reason);

        driver.findElement(Locators.TEXT_FIELD_YOUR_NAME).sendKeys(nameForContactUs);

        driver.findElement(Locators.TEXT_FIELD_YOUR_EMAIL).sendKeys(email);


        driver.findElement(Locators.TEXT_FIELD_SUBJECT).sendKeys(subject);

        driver.findElement(Locators.TEXT_FIELD_MESSAGE).sendKeys(messageToContactUs);
    }
}
