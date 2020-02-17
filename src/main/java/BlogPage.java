import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BlogPage extends BaseActions {

    public BlogPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickJoinButton() {
        driver.findElement(Locators.LINK_BUTTON_REGISTRATION).click();
    }

    String currentURLBlog;

    public String verifyBlogLinkIsDisplayed() {
        getNavigateToLinkPage(Locators.LINK_BLOG);
        currentURLBlog = driver.getCurrentUrl();
        return currentURLBlog;
    }
    public void clickBlogPageTab(){
        driver.findElement(Locators.LINK_BLOG).click();
    }

    public List<WebElement> collectAllLinkOfArticles(){
        List<WebElement> linksOfArticles = driver.findElements(Locators.LINKS_OF_BLOG_ARTICLES);
        return linksOfArticles;


        }
    }


