import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
        import java.util.List;

public class ArrayLists extends BaseUI{
    @Test

    public void test18() {
        List<WebElement> links = driver.findElements(By.xpath("//ul/li"));
        System.out.println(links.size());
        for (int i = 0; i <links.size(); i++) {
           WebElement elementOfList =  links.get(i);
           String info = elementOfList. getText();
            System.out.println(info);

        }
        }
        @Test

    public void test19() {
        List<WebElement> links = driver.findElements(By.xpath("//ul/li"));
        System.out.println(links.size());
        for (int i = 0; i <links.size(); i++) {
           String info = links.get(i).getText();
            System.out.println(info);
        }

        }
        @Test

    public void test20() {
        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        System.out.println(links.size());
        for (int i = 0; i <links.size(); i++) {
           String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.get(Data.mainURL);
            links = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        }

        }
}