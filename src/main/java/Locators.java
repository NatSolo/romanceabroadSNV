import org.openqa.selenium.By;

public class Locators {

    //MainPageTests
    public static final By LINK_YOUTUBE_ACCESS = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By BUTTON_YOUTUBE_ACCESS = By.xpath("//button[@class='ytp-large-play-button ytp-button']");


    //Tour page
    public static final By LINK_TOUR = By.xpath("//a[contains(@href, 'https://romanceabroad.com/store/sweets/20-tour_to_ukraine')]");

    //Blog page
    public static final By LINK_BLOG = By.xpath("//a[contains(@href, 'https://romanceabroad.com/content/view/blog')]");

    //HowWeWork page
    public static final By LINK_HOW_WORK = By.cssSelector("a[href='https://romanceabroad.com/content/view/how-it-works']");

    //Media
    public static final By LINK_MEDIA = By.xpath("//a[contains(@href, 'https://romanceabroad.com/media/index')]");

    //Registration page
    public static final By LINK_BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By FIELD_EMAIL = By.cssSelector("input#email");
    public static final By FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By FIELD_USERNAME = By.cssSelector("#nickname");
    public static final By FIELD_PHONE = By.cssSelector(" input[name='data[phone]']");
    public static final By CHECK_BOX_CONFIRMATION = By.cssSelector("input#confirmation");


    //SearchPrettyWomen page
    public static final By LINK_SEARCH = By.xpath("//a[contains(@href, 'https://romanceabroad.com/users/search')]");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");

    //SignIn page
    public static final  By LINK_SING_IN = By.id("ajax_login_link");

    //StoreGift page
    public static final By LINK_STORE = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");


}
