import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI{

    @Test
    public void testMainRegistration() {
        mainPage.clickJoinButton();
        registrationPage.completeFirstPartOfRegistration();
        registrationPage.completeSecondPartOfRegistration();
        WebElement checkboxConfirmation = driver.findElement(Locators.CHECK_BOX_CONFIRMATION);
        //Assert.assertTrue(driver.findElement(Locators.CHECK_BOX_CONFIRMATION).isSelected(), "Element is not selected");

        if (driver.findElement(Locators.CHECK_BOX_CONFIRMATION).isSelected()){
            checkboxConfirmation.click();
        }
        else {
            Assert.fail("Checkbox is already selected");
        }

    }
}
