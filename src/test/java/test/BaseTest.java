package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import pages.SearchPage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {


    private WebDriver driver;
    private static final String BOOKING_COM_URL = "https://www.booking.com/index.html?label=gen173nr-1FCAEoggI46AdIM1gEaDqIAQGYASG4ARfIAQzYAQHoAQH4AQuIAgGoAgO4AoOv2ZgGwAIB0gIkYjFmODM2ZDMtMTg4Mi00ODUxLTkwYTAtZDMzMjAyMDc3NjJl2AIG4AIB&sid=7ba9dcb70b9c72858bb3206ef88a90dd&lang=en-us&sb_price_type=total&soz=1&lang_click=other&cdl=ru&lang_changed=1";


    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BOOKING_COM_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SearchPage getSearchPage() {
        return new SearchPage(getDriver());
    }

}
