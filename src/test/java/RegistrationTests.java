import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTests extends BaseUI{

    @Test
    public void testMainRegistration() {
        driver.findElement(Locators.LINK_BUTTON_REGISTRATION).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.FIELD_EMAIL).sendKeys(Data.emailKey);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.FIELD_PASSWORD)));
        driver.findElement(Locators.FIELD_PASSWORD).sendKeys(Data.password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.FIELD_USERNAME).sendKeys(Data.username);
        driver.findElement(Locators.FIELD_PHONE).sendKeys(Data.phone);
        //driver.findElement(By.cssSelector("input#confirmation")).click();
        WebElement checkboxConfirmation = driver.findElement(Locators.CHECK_BOX_CONFIRMATION);
        boolean selectedCheckbox = checkboxConfirmation.isSelected();
        System.out.println(selectedCheckbox + "!!!");
        checkboxConfirmation.click();

    }
}
