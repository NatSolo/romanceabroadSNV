import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exersizes extends BaseUI {
    String currentURLSearch;

    //MostCommon Condition
    public class Conditions {
        @Test
//this method allows to find if the  variables are contained in the Data
        public void test1() {
            String fruit = "kiwi";

            if (fruit.contains("kiwi")) {
                System.out.println(("We can find our fruit!"));  //we can use other different functions that Idea suggests
            }
        }

        //this method allows to find if the  variables are exactly in the Data
        public void test2() {
            String fruit = "kiwi";

            if (fruit.equals("kiwi")) {
                System.out.println(("We can find our fruit!"));  //we can use other different functions that Idea suggests
            }
        }

        //this method allows to find if the  variables are contained in the Data, if not, Selenium will use else Method
        public void test3() {
            String fruit = "kiwi";

            if (fruit.contains("kiwi")) {
                System.out.println(("We can find our fruit!"));
            } else {                                              //means: opposite the first variable
                System.out.println("We can't find our fruit");
            }
        }

        //this method allows to find if the  variable1 is exactly in the Data
        // this method allows to find if the  variable2 is exactly in the Data ect.
        //if both or one of them  be found, the System will print belong strings/string,
        //if no one be find, the System will print else assert string.
        public void test4() {
            String fruit1 = "kiwi";
            String fruit2 = "orange";
            if (fruit1.contains("kiwi")) {
                System.out.println(("We can find our fruit!"));   //these two actins can be combined (look below)
                if (fruit2.contains("orange")) {
                    System.out.println(("We can find our fruit2 !"));
                } else {
                    Assert.fail("We can't find our fruit");
                }
            }
        }

        // actions combining with && - and operator
        public void test5() {
            String fruit1 = "kiwi";
            String fruit2 = "orange";
            if (fruit1.contains("kiwi") && fruit2.contains("orange")) {
                System.out.println(("We can find our fruits!"));   //both conditions have to be valid or test will fail
            } else {
                Assert.fail("We can't find our fruit");
            }
        }

        // actions combining with  || - or operator
        public void test6() {
            String fruit1 = "kiwi";
            String fruit2 = "orange";
            if (fruit1.contains("kiwi") || fruit2.contains("orange")) {
                System.out.println(("We can find our fruits!"));   //one of both conditions have to be valid, and test will fail
                // if both of them invalid
            } else {
                Assert.fail("We can't find our fruit");

            }
        }
    }
//MostCommon Condition fo Intengers

    @Test
    public void test7() {
        int number = 10;
        if (number == 15) {
            System.out.println("I can find valid number");
        } else {
            System.out.println("I can't find valid number");
        }
    }

    @Test
    public void test8() {
        int number = 10;
        int sum;
        if (number == 10 + 5) {
            sum = 100 + 95;
        } else {
            sum = 100 - 95;
        }
        System.out.println(sum);
    }

    @Test
    public void test98() {
        int number1 = 10;
        int number2 = 10;
        int sum;
        if (number1 == number2) {
            sum = 100 + 95;
        } else {
            sum = 100 - 95;
        }
        System.out.println(sum);
    }
    //MostCommon Condition for Elements

    @Test
    public void test12() {

        WebElement tabSerch = driver.findElement(Locators.LINK_SEARCH);
        if (tabSerch.getText().contains("PRETTY WOMEN")) {
            tabSerch.click();
        } else
            Assert.fail("We can't find PrettyWomen tab");
    }

    @Test
    public void test13() {
        mainPage.clickJoinButton();
        registrationPage.completeFirstPartOfRegistration();
        registrationPage.completeSecondPartOfRegistration();
        WebElement checkbox = driver.findElement(Locators.CHECK_BOX_CONFIRMATION);
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

//Assertions Variants

    public void validateAssertions() {
        Assert.assertEquals("web", "web is");
    }


    public void validateAssertions1() {
        driver.findElement(By.xpath("//a")).isDisplayed();
    }

    public void validateAssertions2() {
        Assert.assertTrue(driver.findElement(By.xpath("//a")).isDisplayed());
    }

    public void validateAssertions3() {
        boolean requirement = true;
        Assert.assertTrue(requirement);
    }

    public void validateAssertion4() {
        Assert.assertTrue(driver.findElement(By.xpath("//a")).isDisplayed(), "Element is not displayed");
        Assert.fail("Element is not displayed");
    }

    @Test
    public void testMainRegistration() {
        mainPage.clickJoinButton();
        registrationPage.completeFirstPartOfRegistration();
        registrationPage.completeSecondPartOfRegistration();
        WebElement checkboxConfirmation = driver.findElement(Locators.CHECK_BOX_CONFIRMATION);
        Assert.assertTrue(driver.findElement(Locators.CHECK_BOX_CONFIRMATION).isSelected(), "Element is not selected");

        //OR

        if (driver.findElement(Locators.CHECK_BOX_CONFIRMATION).isSelected()) {
            checkboxConfirmation.click();
        } else {
            Assert.fail("Checkbox is already selected");
        }

    }
        //or  soft Assertoins
         @Test
        public void testMainSearchAssertion2() {

            Assert.assertTrue(driver.findElement(Locators.LINK_SEARCH).isDisplayed(), "Element is not displayed");
            driver.findElement(Locators.LINK_SEARCH).click();
            currentURLSearch = driver.getCurrentUrl();
            System.out.println(currentURLSearch);
            //Assert.assertEquals(currentURLSearch, Data.expectedURLSearch);
            softAssert.assertEquals(currentURLSearch, Data.expectedURLSearch, "URL is wrong");
        }
    }
