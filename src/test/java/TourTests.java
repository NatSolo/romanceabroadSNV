import org.testng.Assert;
import org.testng.annotations.Test;

public class TourTests extends BaseUI {

    String currentURLTour;

    @Test
    public void testMainTour() {
        driver.findElement(Locators.LINK_TOUR).click();
        currentURLTour = driver.getCurrentUrl();
        System.out.println(currentURLTour);
        Assert.assertEquals(currentURLTour, Data.exepectedURLTour);
    }
}
