    package base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class JutsuPage extends BasePage {
    public JutsuPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"search_b\"]/form/input[2]")
    private WebElement searchBar;
    String search;
    String episodeXPath;
    @FindBy(xpath = "//*[@id=\"search_b\"]/form/input[3]")
    private WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"main-page\"]/div/div/div[2]/div[1]/div[1]/div/div[7]/div[2]/label[1]/span[1]")
    private WebElement mangaFilter;
    @FindBy(xpath = "//*[@id=\"dle-content\"]/div/div[2]/a[1]")
    private WebElement OPEpisodeButton;
    @FindBy(xpath = "//*[@id=\"my-player\"]/button")
    private WebElement playButton;


    public JutsuPage searchForOnepunchman() {
        searchBar.click();
        search="Ванпанчмен";
        searchBar.sendKeys(search);
        return this;
    }
        public JutsuPage searchForEva() {
            searchBar.click();
            search="Евангелион";
            searchBar.sendKeys(search);
            return this;
        }
        public JutsuPage searchForNaruto() {
            searchBar.click();
            search="Аватар";
            searchBar.sendKeys(search);
            return this;
        }
    public JutsuPage clickSearchButton() {
        searchButton.click();
        return this;
    }
    public JutsuPage clickOPEpisodeButton() {
        OPEpisodeButton.click();
        return this;
    }

    public JutsuPage clickPlayButton() {
        playButton.click();
        return this;
    }
}