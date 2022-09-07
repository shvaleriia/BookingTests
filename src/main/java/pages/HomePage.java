package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'Accept')]")
    private WebElement acceptCookies;

    @FindBy(xpath = "//input[@id='ss']")
    private WebElement inputField;

    @FindBy(xpath = "//li[@data-label='New York, New York State, United States']")
    private WebElement fieldInField;

    @FindBy(xpath = "//div[@data-bui-ref='calendar-next']")
    private WebElement nextButton;

    @FindBy(xpath = "//span[@aria-label='1 December 2022']")
    private WebElement chooseFirstDay;

    @FindBy(xpath = "//div[@data-mode='checkout']")
    private WebElement checkOutButton;

    @FindBy(xpath = "//span[@aria-label='31 December 2022']")
    private WebElement chooseLastDay;

    @FindBy(css = ".sb-searchbox__button")
    private WebElement searchButton;


    public void clickAcceptCookies() {
        acceptCookies.click();
    }

    public void fillInInputField(final String keyword) {
        inputField.sendKeys(keyword);
    }

    public void clickCorrectField() {
        fieldInField.click();
    }

    public void clickNextButton() {
        nextButton.click();
    }

    public void chooseCorrectFirstDay() {
        chooseFirstDay.click();
    }

    public void chooseCorrectLastDay() {
        chooseLastDay.click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }
}
