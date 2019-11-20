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
        driver.findElement(Locators.BUTTON_YOUTUBE_ACCESS).click();

    }
    @Test
    public void testYoutubeAccessImplicit() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Locators.LINK_YOUTUBE_ACCESS).click();

    }

    @Test
    public void test12() {
        ;
        WebElement tabSerch = driver.findElement(Locators.LINK_BLOG );
        if (tabSerch.getText().contains("BLOG")) {
            tabSerch.click();
        } else
            Assert.fail("We can't find Blog tab");


    }

    @Test

    public void testPagesLinksList() {
        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        System.out.println(links.size());
        for (int i = 0; i <links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.get(Data.mainURL);
            links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        }

    }
}
