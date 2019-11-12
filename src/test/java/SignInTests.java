import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignInTests extends BaseUI {

    @Test
    public void testMainSingIn() {

        WebElement linkSignIn = driver.findElement(Locators.LINK_SING_IN);
        linkSignIn.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(Locators.FIELD_EMAIL_SIGN_IN).sendKeys(Data.emailSignIn);
        driver.findElement(Locators.FIELD_PASSWORD_SIGN_IN).sendKeys(Data.passwordSignIn);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_SIGN_IN));
        driver.findElement(Locators.BUTTON_SIGN_IN).click();

    }
}
