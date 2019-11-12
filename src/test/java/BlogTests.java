import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTests extends BaseUI{
    String currentURLBlog;



    @Test
    public void testMainBlog() {
        driver.findElement(Locators.LINK_BLOG).click();
        currentURLBlog = driver.getCurrentUrl();
        System.out.println(currentURLBlog);
        Assert.assertEquals(currentURLBlog, Data.expectedURLBlog);
    }
}
