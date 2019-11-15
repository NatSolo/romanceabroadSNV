import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI{

    @Test
    public void testMainRegistration() {
        mainPage.clickJoinButton();
        registrationPage.completeFirstPartOfRegistration();
        registrationPage.completeSecondPartOfRegistration();

    }
}
