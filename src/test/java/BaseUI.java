import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUI {
    WebDriver driver;
    WebDriverWait wait;
    String mainURL = "https://romanceabroad.com/";
    MainPage mainPage;
    SearchPage searchPage;
    RegistrationPage registrationPage;
    BlogPage blogPage;
    HowItWorkPage howItWorkPage;
    MediaPage mediaPage;
    SignInPage signInPage;
    StorePage storePage;
    TourPage tourPage;

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        mainPage = new MainPage(driver, wait);
        searchPage = new SearchPage(driver, wait);
        registrationPage = new RegistrationPage(driver, wait);
        blogPage = new BlogPage(driver, wait);
        howItWorkPage = new HowItWorkPage(driver,wait);
        mediaPage = new MediaPage(driver, wait);
        signInPage = new SignInPage(driver, wait);
        storePage = new StorePage(driver, wait);
        tourPage = new TourPage(driver, wait);



        driver.manage().window().maximize();
        driver.get(mainURL);
    }

    @AfterMethod
    public void afterActions () {
        // driver.quit();
    }
}
