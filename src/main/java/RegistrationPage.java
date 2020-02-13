import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RegistrationPage extends BaseActions {

    public RegistrationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void completeFirstPartOfRegistration(String email, String password) {

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.TEXT_FIELD_PASSWORD)));
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void completeSecondPartOfRegistration(String username, String month, String day,
                                                 String year, String phone, String city, String location) {

        driver.findElement(Locators.TEXT_FIELD_USERNAME).sendKeys(username);

        driver.findElement(Locators.LIST_BIRTH_DAY).click();
        selectValueOfList(Locators.LIST_VALUE_BIRTH_DAY, day);

        driver.findElement(Locators.LIST_BIRTH_MONTH).click();
        selectValueOfList(Locators.LIST_VALUE_BIRTH_MONTH, month);

        driver.findElement(Locators.LIST_BIRTH_YEAR).click();
        selectValueOfList(Locators.LIST_VALUE_BIRTH_YEAR, year);

        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(phone);

        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).clear();
        driver.findElement(Locators.AUTOFILLING_FORM_LOCATION).sendKeys(city);
        selectValueOfList(Locators.LIST_VALUE_LOCATION, location);

        driver.findElement(Locators.CHECK_BOX_CONFIRMATION).click();


    }


}



