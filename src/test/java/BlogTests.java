import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BlogTests extends BaseUI {
    String currentURLBlog;
    String nameOfArticle;
    String titleOfArticle;

    @Test
    public void testMainBlog() {
        blogPage.clickBlogPageTab();
        currentURLBlog = driver.getCurrentUrl();
        System.out.println(currentURLBlog);
        Assert.assertEquals(currentURLBlog, Data.expectedURLBlog);
    }

    @Test
    public void linkVerification() {
        blogPage.clickBlogPageTab();
        currentURLBlog = driver.getCurrentUrl();
        String blogLink = blogPage.verifyBlogLinkIsDisplayed();
        Assert.assertEquals(blogLink, Data.expectedURLBlog);
        driver.navigate().to(Data.expectedURLBlog);
    }

    @Test
    public void testArticleAndTitles() {
        blogPage.clickBlogPageTab();
        List<WebElement> linksOfArticles = blogPage.collectAllLinkOfArticles();

        for (int i = 0; i < linksOfArticles.size(); i++) {
            WebElement link = linksOfArticles.get(i);
            nameOfArticle = link.getText();

            if (nameOfArticle.contains("How it works")) {
                continue;
            }
            if (nameOfArticle.contains("Kharkov dating agency")) {
                continue;
            }
            if (nameOfArticle.contains("Kiev dating agency")) {
                continue;
            }
            if (nameOfArticle.contains("Odessa dating agency")) {
                continue;
            } if (nameOfArticle.contains("Mail order girls")) {
                continue;
            }
            if (nameOfArticle.contains("Find Ukrainian girlfriend")) {
                continue;
            }
            if (nameOfArticle.contains("Slavic women for marriage")) {
                continue;
            }
            if (nameOfArticle.contains("Beautiful urkainian girls")) {
                continue;
            }
            if (nameOfArticle.contains("Real Ukrainian brides")) {
                continue;
            }
            if (nameOfArticle.contains("Eastern European women")) {
                continue;
            }
            if (nameOfArticle.contains("Kiev dating site")) {
                continue;
            } if (nameOfArticle.contains("Marriage agency in Ukraine")) {
                continue;
            }


            if (nameOfArticle.contains("How to marry Ukrainian lady")) {
                continue;
            }
            if (nameOfArticle.contains("Free Ukrainian dating site")) {
                continue;}
            if (nameOfArticle.contains("9 Factors to Keep in Mind When Dating a Ukrainian Woman")) {
                continue;}
            if (nameOfArticle.contains("Is There a Difference Between Dating or Courting a Ukrainian Woman?")) {
                continue;}

                link.click();
                titleOfArticle = blogPage.getAnyTitle();
                Assert.assertEquals(nameOfArticle, titleOfArticle);
                linksOfArticles = blogPage.collectAllLinkOfArticles();


        }
    }
}
