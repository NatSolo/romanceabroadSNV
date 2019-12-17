import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTests extends BaseUI {
    String currentURLBlog;

    @Test
    public void testMainBlog() {
        driver.findElement(Locators.LINK_BLOG).click();
        currentURLBlog = driver.getCurrentUrl();
        System.out.println(currentURLBlog);
        Assert.assertEquals(currentURLBlog, Data.expectedURLBlog);
    }

    @Test
    public void linkVerification() {
        String blogLink = blogPage.verifyBlogLinkIsDisplayed();
        Assert.assertEquals(blogLink, Data.expectedURLBlog);
        driver.navigate().to(Data.mainURL);
    }
}
