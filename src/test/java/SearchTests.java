import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTests extends BaseUI {

    String currentURLSearch;

    @Test
    public void testMainSearch() {
        driver.findElement(Locators.LINK_SEARCH);
        currentURLSearch = driver.getCurrentUrl();
        System.out.println(currentURLSearch);
        Assert.assertEquals(currentURLSearch, Data.expectedURLSearch);

    }

    @Test

    public void testLinkSearchAssertion() {
        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), Data.notDisplayedElementNotice);
        driver.findElement(Locators.LINK_SEARCH);
        currentURLSearch = driver.getCurrentUrl();
        System.out.println(currentURLSearch);
        //Assert.assertEquals(currentURLSearch, Data.expectedURLSearch);
        softAssert.assertEquals(currentURLSearch, Data.expectedURLSearch, Data.wrongUrlNotice);

    }

    @Test
    public void testDropDownListSortByIndex() {
        driver.findElement(Locators.LINK_SEARCH);
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByIndex(dropDownListSortBy, Data.sortByIndex);

    }

    @Test
    public void testDropDownListSortByText() {
        driver.findElement(Locators.LINK_SEARCH);
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByText(dropDownListSortBy, Data.sortByText);

    }

    @Test
    public void testDropDownListSortByValue() {
        driver.findElement(Locators.LINK_SEARCH);
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(dropDownListSortBy, Data.sortByValue);

    }

    @Test
    public void testUsersList() {
        driver.findElement(Locators.LINK_SEARCH);
        Dimension d = new Dimension(300, 1080);
        driver.manage().window().setSize(d);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.SEARCH_PARAMETERS_BUTTON)));
        driver.findElement(Locators.SEARCH_PARAMETERS_BUTTON);
    }

    @Test
    public void testMainSearchAssertion2() {

        driver.findElement(Locators.LINK_SEARCH);
        currentURLSearch = driver.getCurrentUrl();
        System.out.println(currentURLSearch);
        softAssert.assertEquals(currentURLSearch, Data.expectedURLSearch, Data.wrongUrlNotice);
        softAssert.assertEquals(currentURLSearch, Data.mainURL, Data.wrongUrlNotice);
        softAssert.assertAll();
    }

    @Test
    public void testMainSearchAssertion2122() {

// No needed isDisplayed here, it check same element in next action. // Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
        driver.findElement(Locators.LINK_SEARCH);
        currentURLSearch = driver.getCurrentUrl();
        System.out.println(currentURLSearch);
//Assert.assertEquals(currentURLSearch, Data.expectedURLSearch);
        softAssert.assertEquals(currentURLSearch, Data.expectedURLSearch, Data.wrongUrlNotice); // Where is assertAll? Without that it doesn't fail your test
    }

    @Test
    public void testMainSearchAssertion3() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.LINK_SEARCH)));
        Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), Data.notDisplayedElementNotice);
        driver.findElement(Locators.LINK_SEARCH);
        currentURLSearch = driver.getCurrentUrl();
        System.out.println(currentURLSearch);
        //Assert.assertEquals(currentURLSearch, Data.expectedURLSearch);
        softAssert.assertEquals(currentURLSearch, Data.expectedURLSearch, Data.wrongUrlNotice);
        softAssert.assertEquals(currentURLSearch, Data.expectedURLSearch, Data.wrongUrlNotice);//can be diff data - this is just example
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByValue(dropDownListSortBy, Data.sortByValue);
        softAssert.assertAll();

    }

    @Test

    public void test2014() {
        String actualTitle;
        String actualUrlPrettyWomen;
        String info;

        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(mainPage.getTabsList().size());
        for (int i = 0; i < mainPage.getTabsList().size(); i++) {
            info = mainPage.getTabsList().get(i).getText();
            System.out.println(info);
            //links.get(i).click();
            mainPage.ajaxClick(mainPage.getTabsList().get(i));

            if (info.contains(Data.namePrettyWomenTab)) {
                driver.findElement(Locators.LINK_SEARCH).click();
                actualTitle = driver.findElement(Locators.TITLE_OF_PRETTY_WOMEN_PAGE).getText();
                actualUrlPrettyWomen = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitlePrettyWomen, actualTitle);
                Assert.assertEquals(Data.expectedURLSearch, actualUrlPrettyWomen);
                driver.findElement(Locators.IMAGES).isDisplayed();
                if (actualUrlPrettyWomen.contains(Data.urlRestrition)) {
                    Assert.fail(Data.urlRestritionFailNotice);  //this condition inside previous condition

                } else {
                    System.out.println(Data.urlRestritionPassNotice);
                }
            }
            driver.get(Data.mainURL);
            links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);  // find next element again and again
        }

    }
    @Test

    public void testPagesLinksList() {
        System.out.println(mainPage.getTabsList().size());
        for (int i = 0; i < mainPage.getTabsList().size(); i++) {
            String info = mainPage.getTabsList().get(i).getText();
            System.out.println(info);
            mainPage.getTabsList().get(i).click();
            driver.get(Data.mainURL);
            mainPage.getTabsList();
        }

    }

    @Test

    public void titleAndUrlAssertionTest() {
        String actualTitle;
        String actualUrlPrettyWomen;
        String info;

        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(mainPage.getTabsList().size());
        for (int i = 0; i < mainPage.getTabsList().size(); i++) {
            info = mainPage.getTabsList().get(i).getText();
            System.out.println(info);
            mainPage.getTabsList().get(i).click();

            if (info.contains(Data.namePrettyWomenTab)) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                actualUrlPrettyWomen = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitlePrettyWomen, actualTitle);
                Assert.assertEquals(Locators.LINK_SEARCH, actualUrlPrettyWomen);
                driver.findElement(Locators.IMAGES).isDisplayed();
                if (actualUrlPrettyWomen.contains(Data.urlRestrition)) {
                    Assert.fail(Data.urlRestritionFailNotice);  //this condition inside previous condition

                } else {
                    System.out.println(Data.urlRestritionPassNotice);
                }
            }
            driver.get(Data.mainURL);
            links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);  // find next element again and again
        }

    }

    @Test
    public void testLinksOnMainPage() {
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");
        driver.findElements(Locators.LINK_SEARCH);
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");
    }


    @Test
    public void selectRandomDropdownList() {

        driver.findElement(Locators.LINK_SEARCH).click();
        int sizeDropDownList = searchPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_SORT_BY_MAX_AGR);

        for (int i = 0; i < sizeDropDownList; i++) {
            searchPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_SORT_BY_MAX_AGR, "Sort by");
            mainPage.javaWaitSec(3);
        }
    }

}

