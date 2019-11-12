import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignInTests extends BaseUI{

       @Test
    public void testMainSingIn() {

        WebElement linkSignIn = driver.findElement(Locators.LINK_SING_IN);
        linkSignIn.click();

    }
}
