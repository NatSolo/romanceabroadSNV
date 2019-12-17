import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlogPage extends BaseActions {

    public BlogPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickJoinButton() {
        driver.findElement(Locators.LINK_BUTTON_REGISTRATION).click();
    }

    String currentURLBlog;

    public String verifyBlogLinkIsDisplayed(){
        getNavigateToLinkPage(Locators.LINK_BLOG);
        currentURLBlog = driver.getCurrentUrl();
        return currentURLBlog;
    }

}
