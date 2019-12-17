import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SearchTests extends BaseUI {

    String currentURLSearch;


    @Test
    public void testMainSearch() {
        searchPage.getWebElement(Locators.LINK_SEARCH);
        currentURLSearch = driver.getCurrentUrl();
        System.out.println(currentURLSearch);
        Assert.assertEquals(currentURLSearch, Data.expectedURLSearch);

    }

    @Test

    public void testLinkSearchAssertion() {
        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        searchPage.getWebElement(Locators.LINK_SEARCH);
        currentURLSearch = driver.getCurrentUrl();
        System.out.println(currentURLSearch);
        //Assert.assertEquals(currentURLSearch, Data.expectedURLSearch);
        softAssert.assertEquals(currentURLSearch, Data.expectedURLSearch, "URL is wrong");


    }

    @Test
    public void testDropDownListSortByIndex() {
        searchPage.getWebElement(Locators.LINK_SEARCH);
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByIndex(dropDownListSortBy, Data.sortByIndex);

    }

    @Test
    public void testDropDownListSortByText() {
        searchPage.getWebElement(Locators.LINK_SEARCH);
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByText(dropDownListSortBy, Data.sortByText);

    }

    @Test
    public void testDropDownListSortByValue() {
        searchPage.getWebElement(Locators.LINK_SEARCH);
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(dropDownListSortBy, Data.sortByValue);

    }


    @Test
    public void testUsersList() {
        searchPage.getWebElement(Locators.LINK_SEARCH);
        Dimension d = new Dimension(300,1080);
        driver.manage().window().setSize(d);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.SEARCH_PARAMETERS_BUTTON)));
        searchPage.getWebElement(Locators.SEARCH_PARAMETERS_BUTTON);
    }

    @Test
    public void testMainSearchAssertion2() {

        searchPage.getWebElement(Locators.LINK_SEARCH);
        currentURLSearch = driver.getCurrentUrl();
        System.out.println(currentURLSearch);
        softAssert.assertEquals(currentURLSearch, Data.expectedURLSearch, "URL is wrong");
        softAssert.assertEquals(currentURLSearch, Data.mainURL, "URL is wrong");
        softAssert.assertAll();
    }

    @Test
    public void testMainSearchAssertion2122() {

// No needed isDisplayed here, it check same element in next action. // Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        searchPage.getWebElement(Locators.LINK_SEARCH);
        currentURLSearch = driver.getCurrentUrl();
        System.out.println(currentURLSearch);
//Assert.assertEquals(currentURLSearch, Data.expectedURLSearch);
        softAssert.assertEquals(currentURLSearch, Data.expectedURLSearch, "URL is wrong"); // Where is assertAll? Without that it doesn't fail your test
    }

    @Test
    public void testMainSearchAssertion3() {
       wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.LINK_SEARCH)));
        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        searchPage.getWebElement(Locators.LINK_SEARCH);
        currentURLSearch = driver.getCurrentUrl();
        System.out.println(currentURLSearch);
        //Assert.assertEquals(currentURLSearch, Data.expectedURLSearch);
        softAssert.assertEquals(currentURLSearch, Data.expectedURLSearch, "URL is wrong");
        softAssert.assertEquals(currentURLSearch, Data.expectedURLSearch, "URL is wrong");//can be diff data - this is just example
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(dropDownListSortBy, Data.sortByValue);
        softAssert.assertAll();

    }

}

