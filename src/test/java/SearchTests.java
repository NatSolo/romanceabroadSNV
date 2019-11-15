import org.openqa.selenium.WebElement;
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

}

