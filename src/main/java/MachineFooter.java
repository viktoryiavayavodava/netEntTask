import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MachineFooter {

    private WebDriver driver;

    public MachineFooter(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "dayWinnings")
    private WebElement dayWinAmt;
    @FindBy(id = "lifetimeWinnings")
    private WebElement allWinsAmt;
    @FindBy(id = "lastWin")
    private WebElement lastWinAmt;
    @FindBy(id = "credits")
    private WebElement creditsAmt;
    @FindBy(id = "bet")
    private WebElement betAmt;
    @FindBy(id = "betSpinUp")
    private WebElement betSpinUpButton;
    @FindBy(id = "betSpinDown")
    private WebElement betSpinDownButton;
    @FindBy(id = "spinButton")
    private WebElement spinButton;
    @FindBy(id = "tryMe")
    private WebElement tryMeButton;



    public void spinTheReels(){
        spinButton.click();
    }
    public void clickTryMe(){
        tryMeButton.click();
    }

    public void setBetUp (){betSpinUpButton.click();}
    public void setBetDown (){betSpinDownButton.click();}


    public String getBetAmt (){
        return betAmt.getText();
    }
    public String getLastWinAmt (){
        return lastWinAmt.getText();
    }
    public String getCreditAmt (){
        return creditsAmt.getText();
    }
    public String getDayWinAmt (){
        return dayWinAmt.getText();
    }
    public String getAllWinsAmt (){
        return allWinsAmt.getText();
    }
}
