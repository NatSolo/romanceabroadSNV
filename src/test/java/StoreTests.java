import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreTests extends BaseUI{

    String currentURLStore;



    @Test
    public void testMainStore() {
        storePage.getWebElement(Locators.LINK_STORE);
        currentURLStore = driver.getCurrentUrl();
        System.out.println(currentURLStore);
        Assert.assertEquals(currentURLStore, Data.expectedURLStore);
    }
}
