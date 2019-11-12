import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTests extends BaseUI {
    String currentURLMedia;


    @Test
    public void testMainMedia() {
        driver.findElement(Locators.LINK_MEDIA).click();
        currentURLMedia= driver.getCurrentUrl();
        System.out.println(currentURLMedia);
        Assert.assertEquals(currentURLMedia, Data.expectedURLMedia);
    }
}
