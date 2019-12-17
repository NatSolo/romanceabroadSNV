import org.testng.Assert;
import org.testng.annotations.Test;

public class HowItWorkTests extends BaseUI {

    String getCurrentURLHowWork;

    @Test
    public void testMainHowItWork() {
        driver.findElement(Locators.LINK_HOW_WORK);
        getCurrentURLHowWork = driver.getCurrentUrl();
        System.out.println(getCurrentURLHowWork);
        Assert.assertEquals(getCurrentURLHowWork, Data.expectedURLHowWork);
    }
}
