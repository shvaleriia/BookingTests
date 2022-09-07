package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class,'a826ba81c4')]")
    private List<WebElement> listCards;

    @FindBy(xpath = "//div[@class='efdb2b543b']/h1[contains(text(),'New York')]")
    private WebElement cardsWithCorrectWord;


    public List<WebElement> getListCards() {
        return listCards;
    }

    public int getResultsCount() {
        return getListCards().size();
    }

    public String getTextFromCard() {
        return cardsWithCorrectWord.getText();
    }

}
