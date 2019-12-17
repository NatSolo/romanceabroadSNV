import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebElementsArrayListsAndLoops extends BaseUI {

    @Test

    public void test20() {
        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.get(Data.mainURL);
            links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);  // find next element again and again
        }
    }

    @Test

    public void test2011() {
        String actualTitle;

        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();

            if (info.contains(Data.partHowItWorkName)) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                Assert.assertEquals(Data.expectedTitleWork, actualTitle);
            }

            driver.get(Data.mainURL);
            links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);  // find next element again and again
        }
    }

    @Test

    public void test2012() {
        String actualTitle;
        String actualUrlPrettyWomen;


        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();

            if (info.contains(Data.namePrettyWomenTab)) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                actualUrlPrettyWomen = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitlePrettyWomen, actualTitle);
                Assert.assertEquals(Locators.LINK_SEARCH, actualUrlPrettyWomen);
               driver.findElement(Locators.TAB_LOCATION_AREA).isDisplayed();
            }
            driver.get(Data.mainURL);
            links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);  // find next element again and again
        }
    }

    @Test

    public void test2013() {
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
                Assert.assertEquals(
                        Data.expectedTitlePrettyWomen, actualTitle);
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





/*  //Examples 18-202
    @Test

    public void test18() {
        List<WebElement> links = driver.findElements(By.xpath("//ul/li")); //has to be certain locator
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            WebElement elementOfList = links.get(i);
            String info = elementOfList.getText();
            System.out.println(info);

        }
    }

    @Test

    public void test19() {
        List<WebElement> links = driver.findElements(By.xpath("//ul/li"));
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
        }

    }

    @Test

    public void test200() {
        List<WebElement> links = driver.findElements(By.xpath("//ul/li"));
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            WebElement elementOfList = links.get(i);
            String info = elementOfList.getText();
            System.out.println(info);

        }
    }

    //more beautiful code of same test
    @Test
    public void test201() {
        List<WebElement> links = driver.findElements(By.xpath("//ul/li"));
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);

        }

    }
   *//* @Test

    public void test202() {
        List<WebElement> links = driver.findElements(By.xpath("//ul/li"));
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.get(Data.mainURL);
            links = driver.findElements(By.xpath("//ul/li"));  // find next element again and again
        }*//*
//sometimes some of elements can be invisible. In this case we need find better locators*/
}


