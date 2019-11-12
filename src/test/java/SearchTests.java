import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
        getDropDownListByIndex(dropDownListSortBy, Data.sortByIndex);

    }

    public void getDropDownListByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }


    @Test
    public void testDropDownListSortByText() {
        driver.findElement(Locators.LINK_SEARCH).click();
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        getDropDownListByText(dropDownListSortBy, Data.sortByText);

    }

    public void getDropDownListByText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    @Test
    public void testDropDownListSortByValue() {
        driver.findElement(Locators.LINK_SEARCH).click();
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        getDropDownListByValue(dropDownListSortBy, Data.sortByValue);

    }

    public void getDropDownListByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

}

