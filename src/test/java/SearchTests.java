import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {

    String currentURLSearch;


    @Test
    public void testMainSearch() {
        driver.findElement(Locators.LINK_SEARCH).click();
        currentURLSearch = driver.getCurrentUrl();
        System.out.println(currentURLSearch);
        Assert.assertEquals(currentURLSearch, Data.expectedURLSearch);

    }

    @Test

    public void testLinkSearchAssertion() {
        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        driver.findElement(Locators.LINK_SEARCH).click();
        currentURLSearch = driver.getCurrentUrl();
        System.out.println(currentURLSearch);
        //Assert.assertEquals(currentURLSearch, Data.expectedURLSearch);
        softAssert.assertEquals(currentURLSearch, Data.expectedURLSearch, "URL is wrong");


    }

    @Test
    public void testDropDownListSortByIndex() {
        driver.findElement(Locators.LINK_SEARCH).click();
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByIndex(dropDownListSortBy, Data.sortByIndex);

    }

    @Test
    public void testDropDownListSortByText() {
        driver.findElement(Locators.LINK_SEARCH).click();
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByText(dropDownListSortBy, Data.sortByText);

    }

    @Test
    public void testDropDownListSortByValue() {
        driver.findElement(Locators.LINK_SEARCH).click();
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(dropDownListSortBy, Data.sortByValue);

    }

    @Test
    public void testUsersList() {
        driver.findElement(Locators.LINK_SEARCH).click();
        Dimension d = new Dimension(300,1080);
        driver.manage().window().setSize(d);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.SEARCH_PARAMETERS_BUTTON)));
        driver.findElement(Locators.SEARCH_PARAMETERS_BUTTON);
    }

    @Test
    public void testMainSearchAssertion2() {

        driver.findElement(Locators.LINK_SEARCH).click();
        currentURLSearch = driver.getCurrentUrl();
        System.out.println(currentURLSearch);
        softAssert.assertEquals(currentURLSearch, Data.expectedURLSearch, "URL is wrong");
        softAssert.assertEquals(currentURLSearch, Data.mainURL, "URL is wrong");
        softAssert.assertAll();
    }

    @Test
    public void testMainSearchAssertion2122() {

// No needed isDisplayed here, it check same element in next action. // Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        driver.findElement(Locators.LINK_SEARCH).click();
        currentURLSearch = driver.getCurrentUrl();
        System.out.println(currentURLSearch);
//Assert.assertEquals(currentURLSearch, Data.expectedURLSearch);
        softAssert.assertEquals(currentURLSearch, Data.expectedURLSearch, "URL is wrong"); // Where is assertAll? Without that it doesn't fail your test
    }

    @Test
    public void testMainSearchAssertion3() {

        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        driver.findElement(Locators.LINK_SEARCH).click();
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

