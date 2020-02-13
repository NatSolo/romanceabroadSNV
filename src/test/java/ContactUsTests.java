import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ContactUsTests extends BaseUI {

    @Test
    public void completionContactUsForm(){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_HOW_WORK));
        driver.findElement(Locators.LINK_MEDIA).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_CONTACT_US));
        driver.findElement(Locators.LINK_CONTACT_US).click();
        mainPage.completeAdministratorForm(Data.reason, Data.nameForContactUs, Data.email, Data.subject, Data.messageToContactUs);

    };

}
