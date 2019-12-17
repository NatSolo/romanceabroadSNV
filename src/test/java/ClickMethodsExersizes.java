import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClickMethodsExersizes extends BaseUI {
    @Test
    public void test2015(){
        By pageBottomLinkSignIn = By.xpath("//div[@class='col-lg-12 text-center']//a[@href='#']");
        mainPage.ajaxClick(pageBottomLinkSignIn, 0);
    }
    @Test
    public void test2016(){
        mainPage.ajaxClick(Locators.TAB_OF_MAIN_PAGE, 3);
    }
    @Test
    public void test2017(){
        mainPage.performClick(Locators.TAB_OF_MAIN_PAGE, 4);
    }
    @Test
    public void test2018(){
        mainPage.scrollToBottomOfPage();
    }

}
