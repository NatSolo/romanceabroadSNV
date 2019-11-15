import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RegistrationPage extends BaseActions {

    public RegistrationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void completeFirstPartOfRegistration() {

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.FIELD_EMAIL).sendKeys(Data.emailKey);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.FIELD_PASSWORD)));
        driver.findElement(Locators.FIELD_PASSWORD).sendKeys(Data.password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void completeSecondPartOfRegistration() {

        driver.findElement(Locators.FIELD_USERNAME).sendKeys(generateNewNumber(Data.username, 5));
        driver.findElement(Locators.DROP_DOWN_BIRTH_DATE).click();
        driver.findElement(Locators.DROP_DOWN_BIRTH_DATE_SELECT).click();
        driver.findElement(Locators.DROP_DOWN_BIRTH_MONTH).click();
        driver.findElement(Locators.DROP_DOWN_BIRTH_MONTH_SELECT).click();
        driver.findElement(Locators.DROP_DOWN_BIRTH_YEAR).click();
        driver.findElement(Locators.DROP_DOWN_BIRTH_YEAR_SELECT).click();
        driver.findElement(Locators.FIELD_PHONE).sendKeys(generateNewNumber(Data.phone, 6));
        driver.findElement(Locators.FIELD_PHONE);
        driver.findElement(Locators.CHECK_BOX_CONFIRMATION).click();

    }


}
