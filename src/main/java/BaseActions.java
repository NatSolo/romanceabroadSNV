import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActions {

        protected WebDriver driver;
        protected WebDriverWait wait;

    public BaseActions(WebDriver driver, WebDriverWait wait){
            this.driver = driver;
            this.wait = wait;

        }

    public static String generateNewNumber(String name, int lenght) {

        return name + RandomStringUtils.random(lenght, "1729453680");
    }
}
