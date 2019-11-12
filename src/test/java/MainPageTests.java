import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainPageTests extends BaseUI {

    @Test
    public void testYoutubeAccessExplicit() throws InterruptedException {
        Thread.sleep(5000);
        WebElement ele = driver.findElement(Locators.LINK_YOUTUBE_ACCESS);
        driver.switchTo().frame(ele);
        driver.findElement(Locators.BUTTON_YOUTUBE_ACCESS).click();

    } @Test
    public void testYoutubeAccessImplicit() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Locators.LINK_YOUTUBE_ACCESS).click();

    }
}
