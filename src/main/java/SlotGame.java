import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SlotGame {

    private WebDriver driver;

    public SlotGame(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "prizes_list")
    private WebElement prizeList;

    @FindBy(xpath = "//div[@id='prizes_list']/div/div[1]")
    private WebElement chartReelOne;
    @FindBy(xpath = "//div[@id='prizes_list']/div/div[2]")
    private WebElement chartReelTwo;
    @FindBy(xpath = "//div[@id='prizes_list']/div/div[3]")
    private WebElement chartReelThree;
    @FindBy(xpath = "//div[@id='prizes_list']/div/div[4]")
    private WebElement chartReelFour;
    @FindBy(xpath = "//div[@id='prizes_list']/div/div[5]")
    private WebElement chartReelFive;
    @FindBy(xpath = "//div[@id='prizes_list']/div/div[6]")
    private WebElement chartReelSix;
    @FindBy(xpath = "//div[@id='prizes_list']/div/div[7]")
    private WebElement chartReelSeven;
    @FindBy(xpath = "//div[@id='prizes_list']/div/div[8]")
    private WebElement chartReelEight;
    @FindBy(xpath = "//div[@id='prizes_list']/div/div[9]")
    private WebElement chartReelNine;

    @FindBy(xpath = "//div[@id='prizes_list']/div/div[1]/span")
    private WebElement payoutReelOne;
    @FindBy(xpath = "//div[@id='prizes_list']/div/div[2]/span")
    private WebElement payoutReelTwo;
    @FindBy(xpath = "//div[@id='prizes_list']/div/div[3]/span")
    private WebElement payoutReelThree;
    @FindBy(xpath = "//div[@id='prizes_list']/div/div[4]/span")
    private WebElement payoutReelFour;
    @FindBy(xpath = "//div[@id='prizes_list']/div/div[5]/span")
    private WebElement payoutReelFive;
    @FindBy(xpath = "//div[@id='prizes_list']/div/div[6]/span")
    private WebElement payoutReelSix;
    @FindBy(xpath = "//div[@id='prizes_list']/div/div[7]/span")
    private WebElement payoutReelSeven;
    @FindBy(xpath = "//div[@id='prizes_list']/div/div[8]/span")
    private WebElement payoutReelEight;
    @FindBy(xpath = "//div[@id='prizes_list']/div/div[9]/span")
    private WebElement payoutReelNine;

    @FindBy(id = "reel1")
    private WebElement reel1;
    @FindBy(id = "reel2")
    private WebElement reel2;
    @FindBy(id = "reel3")
    private WebElement reel3;



    public String getReelOnePrize() {
        return payoutReelOne.getText();
    }





}
