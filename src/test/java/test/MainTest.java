package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {


    private static final String CITY = "New York";
    private static final int EXPECTED_AMOUNT = 25;
    private static final String SELECTED_CITY = "New York: 739 properties found";
    private static final String EXPECTED_QUERY = "checkin_year=2022&checkin_month=12&checkin_monthday=1&checkout_year=2022&checkout_month=12&checkout_monthday=31";


    @Test
    public void checkThatCorrectCityIsSelected() {
        getHomePage().implicitWait(30);
        getHomePage().clickAcceptCookies();
        getHomePage().implicitWait(30);
        getHomePage().fillInInputField(CITY);
        getHomePage().clickCorrectField();
        getHomePage().implicitWait(30);
        getHomePage().clickNextButton();
        getHomePage().implicitWait(30);
        getHomePage().clickNextButton();
        getHomePage().implicitWait(30);
        getHomePage().chooseCorrectFirstDay();
        getHomePage().implicitWait(30);
        getHomePage().chooseCorrectLastDay();
        getHomePage().implicitWait(30);
        getHomePage().clickSearchButton();
        getHomePage().implicitWait(60);
        Assert.assertEquals(getSearchPage().getTextFromCard(), SELECTED_CITY);

    }

    @Test
    public void checkThatAppearCorrectAmountOfCards() {
        getHomePage().implicitWait(30);
        getHomePage().clickAcceptCookies();
        getHomePage().implicitWait(30);
        getHomePage().fillInInputField(CITY);
        getHomePage().clickCorrectField();
        getHomePage().implicitWait(30);
        getHomePage().clickNextButton();
        getHomePage().implicitWait(30);
        getHomePage().clickNextButton();
        getHomePage().implicitWait(30);
        getHomePage().chooseCorrectFirstDay();
        getHomePage().implicitWait(30);
        getHomePage().chooseCorrectLastDay();
        getHomePage().implicitWait(30);
        getHomePage().clickSearchButton();
        getHomePage().implicitWait(30);
        Assert.assertEquals(getSearchPage().getResultsCount(), EXPECTED_AMOUNT);
    }

    @Test
    public void checkThatCorrectDayIsSelected() {
        getHomePage().implicitWait(30);
        getHomePage().clickAcceptCookies();
        getHomePage().implicitWait(30);
        getHomePage().fillInInputField(CITY);
        getHomePage().clickCorrectField();
        getHomePage().implicitWait(30);
        getHomePage().clickNextButton();
        getHomePage().implicitWait(30);
        getHomePage().clickNextButton();
        getHomePage().implicitWait(30);
        getHomePage().chooseCorrectFirstDay();
        getHomePage().implicitWait(30);
        getHomePage().chooseCorrectLastDay();
        getHomePage().implicitWait(30);
        getHomePage().clickSearchButton();
        getSearchPage().implicitWait(30);
        Assert.assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_QUERY));
    }
}
