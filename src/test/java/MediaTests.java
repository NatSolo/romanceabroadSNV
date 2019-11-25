import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTests extends BaseUI {
    String currentURLMedia;
    String Albums;


    @Test
    public void testMainMedia() {
        driver.findElement(Locators.LINK_MEDIA).click();
        currentURLMedia = driver.getCurrentUrl();
        System.out.println(currentURLMedia);
        Assert.assertEquals(currentURLMedia, Data.expectedURLMedia);
    }

    @Test
    public void testUsersList(){
        driver.findElement(Locators.LINK_MEDIA).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.LINK_ALBUMS)));
        driver.findElement(Locators.LINK_ALBUMS);
    }

    @Test
    public void testAlbumConditions() {
        driver.findElement(Locators.LINK_MEDIA).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.LINK_ALBUMS)));
        driver.findElement(Locators.LINK_ALBUMS);
        String albums = "Albums";
        if (albums.contains("Albums")) {
            System.out.println("Correct string");
        } else {
            System.out.println("Incorrect string");
        }
    }

    @Test
    public void testVideoConditions() {
        driver.findElement(Locators.LINK_MEDIA).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.LINK_VIDEO)));
        driver.findElement(Locators.LINK_VIDEO);
        boolean videoString = true;
        if (videoString) {
            System.out.println("Correct string");
        } else {
            System.out.println("Incorrect string");
        }
    }

}

