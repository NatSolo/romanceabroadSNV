import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListsAndLoops extends BaseUI {

    @Test

    public void test18() {
        List<WebElement> links = driver.findElements(By.xpath("//ul/li"));
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
                   String info =links.get(i).getText();
                    System.out.println(info);

                }

    }
    @Test

    public void test202() {
        List<WebElement> links = driver.findElements(By.xpath("//ul/li"));
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.get(Data.mainURL);
            links = driver.findElements(By.xpath("//ul/li"));  // find next element again and again
        }
//sometimes some of elements can be invisible. In this case we need find better locators
    }@Test

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


//loops

        @Test
    public void test210() {

            for (int i = 0; i < 50; i++) {
                System.out.println("Hi guys!");

            }
        }
@Test
    public void test21() {
        List<Integer> fruitsList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        for (int i = 0; i < fruitsList1.size(); i++) {
            int element = fruitsList1.get(i);
            System.out.println(element);

        }

    }

    @Test
    public void test22() {
        List<Integer> fruitsList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        for (int i = 0; i < fruitsList1.size(); i++) {
            int element = fruitsList1.get(i);
            System.out.println(element);

        }
//String Array Lists
    }
    @Test

    public void test25() {
        List<String> fruitlist3 = new ArrayList<>(Arrays.asList("kiwi", "orang", "melon"));
        String element = fruitlist3.get(0);
        System.out.println(element);


    }@Test

    public void test26() {
        List<String> fruitlist3 = new ArrayList<>(Arrays.asList("kiwi", "orang", "melon"));
        if (fruitlist3.contains("orange"))
                System.out.println(fruitlist3);


    }


}