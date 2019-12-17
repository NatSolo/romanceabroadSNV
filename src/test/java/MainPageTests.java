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

    public void testPagesLinksList() {
        System.out.println(mainPage.getTabsList().size());
        for (int i = 0; i < mainPage.getTabsList().size(); i++) {
            String info = mainPage.getTabsList().get(i).getText();
            System.out.println(info);
            mainPage.getTabsList().get(i).click();
            driver.get(Data.mainURL);
            mainPage.getTabsList();
        }

    }

    @Test

    public void titleAndUrlAssertionTest() {
        String actualTitle;
        String actualUrlPrettyWomen;
        String info;

        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(mainPage.getTabsList().size());
        for (int i = 0; i < mainPage.getTabsList().size(); i++) {
            info = mainPage.getTabsList().get(i).getText();
            System.out.println(info);
            mainPage.getTabsList().get(i).click();

            if (info.contains(Data.namePrettyWomenTab)) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                actualUrlPrettyWomen = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitlePrettyWomen, actualTitle);
                Assert.assertEquals(Locators.LINK_SEARCH, actualUrlPrettyWomen);
                driver.findElement(Locators.IMAGES).isDisplayed();
                if (actualUrlPrettyWomen.contains(Data.urlRestrition)) {
                    Assert.fail(Data.urlRestritionFailNotice);  //this condition inside previous condition

                } else {
                    System.out.println(Data.urlRestritionPassNotice);
                }
            }
            driver.get(Data.mainURL);
            links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);  // find next element again and again
        }

    }
}
