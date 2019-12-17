import com.sun.deploy.security.SelectableSecurityManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebElementsArrayListsAndLoops extends BaseUI {


    @Test

    public void test20() {
        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.get(Data.mainURL);
            links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));  // find next element again and again
        }
    }

    @Test

    public void test2011() {
        String actualTitle;
        String expectedTitleWork = "Ukrainian women for marriage";

        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();

            if (info.contains("WORK")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                Assert.assertEquals(expectedTitleWork, actualTitle);
            }

            driver.get(Data.mainURL);
            links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);  // find next element again and again
        }
    }

    @Test

    public void test2012() {
        String actualTitle;
        String actualUrlPrettyWomen;
        String expectedTitlePrettyWomen = "Single Ukrainian women online";
        String expectedUrlPrettyWomen = "https://romanceabroad.com/users/search";


        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();

            if (info.contains("PRETTY WOMEN")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                actualUrlPrettyWomen = driver.getCurrentUrl();
                Assert.assertEquals(expectedTitlePrettyWomen, actualTitle);
                Assert.assertEquals(expectedUrlPrettyWomen, actualUrlPrettyWomen);
                driver.findElement(By.xpath("//a[@class='g-pic-border g-rounded']")).isDisplayed();
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
        String expectedTitlePrettyWomen = "Single Ukrainian women online";
        String expectedUrlPrettyWomen = "https://romanceabroad.com/users/search";


        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();

            if (info.contains("PRETTY WOMEN")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                actualUrlPrettyWomen = driver.getCurrentUrl();
                Assert.assertEquals(expectedTitlePrettyWomen, actualTitle);
                Assert.assertEquals(expectedUrlPrettyWomen, actualUrlPrettyWomen);
                driver.findElement(Locators.IMAGES).isDisplayed();
                if (actualUrlPrettyWomen.contains("#")) {
                    Assert.fail("It contains restricted #");  //this condition inside previous condition

                } else {
                    System.out.println("No spesial characters, it is good Url!!!");
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
        String expectedTitlePrettyWomen = "Single Ukrainian women online";
        String expectedUrlPrettyWomen = "https://romanceabroad.com/users/search";


        List<WebElement> links = driver.findElements(Locators.TAB_OF_MAIN_PAGE);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            info = links.get(i).getText();
            System.out.println(info);
            //links.get(i).click();
            mainPage.ajaxClick(links.get(i));

            if (info.contains("PRETTY WOMEN")) {
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                actualUrlPrettyWomen = driver.getCurrentUrl();
                Assert.assertEquals(expectedTitlePrettyWomen, actualTitle);
                Assert.assertEquals(expectedUrlPrettyWomen, actualUrlPrettyWomen);
                driver.findElement(Locators.IMAGES).isDisplayed();
                if (actualUrlPrettyWomen.contains("#")) {
                    Assert.fail("It contains restricted #");  //this condition inside previous condition

                } else {
                    System.out.println("No spesial characters, it is good Url!!!");
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


