import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPageTests extends BaseUI {

    @Test
    public void testYoutubeAccessExplicit() throws InterruptedException {
        Thread.sleep(5000);
        WebElement ele = driver.findElement(Locators.LINK_YOUTUBE_ACCESS);
        driver.switchTo().frame(ele);
        driver.findElement(Locators.BUTTON_YOUTUBE_ACCESS);

    }

    @Test
    public void testYoutubeAccessImplicit() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Locators.LINK_YOUTUBE_ACCESS);

    }

    @Test
    public void smokeTestMainPage(){
        List<WebElement>mainTabs = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        for (int i = 0; i <mainTabs.size() ; i++) {
            mainTabs.get(i).click();driver.get((Data.mainURL));mainTabs = driver.findElements(Locators.TAB_OF_MAIN_PAGE);

        }
    }



}







