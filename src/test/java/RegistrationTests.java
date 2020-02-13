import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {

    @Test
    public void testMainRegistration() {
        mainPage.clickJoinButton();
        registrationPage.completeFirstPartOfRegistration(Data.email, Data.password);
        registrationPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.username, 5),
                Data.month, Data.day, Data.year, Data.phone, Data.city, Data.location);
        WebElement checkboxConfirmation = driver.findElement(Locators.CHECK_BOX_CONFIRMATION);
        //Assert.assertTrue(driver.findElement(Locators.CHECK_BOX_CONFIRMATION).isSelected(), "Element is not selected"); or

        if (driver.findElement(Locators.CHECK_BOX_CONFIRMATION).isSelected()) {
            checkboxConfirmation.click();
        } else {

            Assert.fail(Data.checkboxSelectConfirmation);
        }

    }

    @Test
    public void validateCheckBoxSelected() {
        mainPage.clickJoinButton();
        registrationPage.completeFirstPartOfRegistration(Data.email, Data.password);
        registrationPage.completeSecondPartOfRegistration(mainPage.generateNewNumber(Data.username, 5),
                Data.month, Data.day, Data.year, Data.phone, Data.city, Data.location);
        WebElement checkbox = driver.findElement(Locators.CHECK_BOX_CONFIRMATION);
        if (!checkbox.isSelected()) {
            checkbox.click();
        } else
            System.out.println(Data.checkboxSelectConfirmation);
    }


}
