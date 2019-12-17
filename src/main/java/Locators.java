import org.openqa.selenium.By;

public class Locators {

    //MainPageTests
    public static final By LINK_YOUTUBE_ACCESS = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By BUTTON_YOUTUBE_ACCESS = By.xpath("//button[@class='ytp-large-play-button ytp-button']");
    public static final By TAB_OF_MAIN_PAGE = By.xpath("//ul[@class='navbar-nav']//li");


    //Tour page
    public static final By LINK_TOUR = By.xpath("//a[contains(@href, 'https://romanceabroad.com/store/sweets/20-tour_to_ukraine')]");

    //Blog page
    public static final By LINK_BLOG = By.xpath("//a[contains(@href, 'https://romanceabroad.com/content/view/blog')]");

    //HowWeWork page
    public static final By LINK_HOW_WORK = By.cssSelector("a[href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By TITLE_OF_PAGE = By.xpath("//h1");

    //Media
    public static final By LINK_MEDIA = By.xpath("//a[contains(@href, 'https://romanceabroad.com/media/index')]");
    public static final By LINK_ALBUMS = By.xpath("//a[@href='https://romanceabroad.com/media/albums']");
    public static final By LINK_VIDEO = By.xpath("//a[@href='https://romanceabroad.com/media/video']");

    //Registration page
    public static final By LINK_BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By FIELD_EMAIL = By.cssSelector("input#email");
    public static final By FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By FIELD_USERNAME = By.cssSelector("#nickname");
    public static final By FIELD_PHONE = By.cssSelector(" input[name='data[phone]']");
    public static final By CHECK_BOX_CONFIRMATION = By.cssSelector("input#confirmation");
    public static final By DROP_DOWN_BIRTH_DATE = By.cssSelector("#daySelect");
    public static final By DROP_DOWN_BIRTH_DATE_SELECT = By.xpath("//li[@data-handler='selectDay']//a[text()='3']");
    public static final By DROP_DOWN_BIRTH_MONTH = By.cssSelector("#monthSelect");
    public static final By DROP_DOWN_BIRTH_MONTH_SELECT = By.xpath("//li[@data-handler='selectMonth']//a[text()='Jul']");
    public static final By DROP_DOWN_BIRTH_YEAR = By.cssSelector("#yearSelect");
    public static final By DROP_DOWN_BIRTH_YEAR_SELECT = By.xpath("//li[@data-handler='selectYear']//a[text()='1996']");


    //Search/PrettyWomen page
    public static final By LINK_SEARCH = By.xpath("//a[contains(@href, 'https://romanceabroad.com/users/search')]");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By SEARCH_PARAMETERS_BUTTON = By.xpath("//div[@class='search-param-button mb10']//a[text()='Search parameters']");
    //public static final By SEARCH_PARAMETERS_BUTTON = By.xpath("//div[@class='search-param-button mb10']//a[text()='Search parameters']");
    public static final By IMAGES = By.xpath("//a[@class='g-pic-border g-rounded']");


    //SignIn page
    public static final By LINK_SING_IN = By.id("ajax_login_link");
    public static final By FIELD_EMAIL_SIGN_IN = By.xpath("//input[@type='text'][@id='email']");
    public static final By FIELD_PASSWORD_SIGN_IN = By.xpath("//input[@id='password'][@name='password']");
    public static final By BUTTON_SIGN_IN = By.xpath("//button[@name='logbtn']");

    //StoreGift page
    public static final By LINK_STORE = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");


}
