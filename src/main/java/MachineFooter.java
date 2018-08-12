import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MachineFooter {

    private WebDriver driver;

    public MachineFooter(WebDriver driver) {
        this.driver = driver;
    }

    private By dayWinAmt = By.id("dayWinnings");
    private By allWinsAmt = By.id("lifetimeWinnings");
    private By lastWinAmt = By.id("lastWin");
    private By totalSpins = By.id("credits");
    private By betAmt = By.id("bet");

    private By prizeWonLine = By.className("//div[@class='trPrize won']");

    private By betSpinDownButton = By.id("betSpinDown");
    private By spinButton = By.id("spinButton");
    private By tryMeButton = By.id("tryMe");
    private By betSpinUpButton = By.id("betSpinUp");

    public void spinTheReels() {
        driver.findElement(spinButton).click();
    }

    public void clickTryMe() {
        driver.findElement(tryMeButton).click();
    }

    public void setBetUp(int amount) {
        for (int i = 0; i < amount; i++) {
            driver.findElement(betSpinUpButton).click();
        }
    }

    public void setBetDown(int amount) {
        for (int i = 0; i < amount; i++) {
            driver.findElement(betSpinDownButton).click();
        }
    }

    public int getBetAmt() {
        return Integer.parseInt(driver.findElement(betAmt).getText());
    }

    public int getLastWinAmt() {
        return Integer.parseInt(driver.findElement(lastWinAmt).getText());
    }

    public int getSpinsAmt() {
        return Integer.parseInt(driver.findElement(totalSpins).getText());
    }

    public int getDayWinAmt() {
        return Integer.parseInt(driver.findElement(dayWinAmt).getText());
    }

    public int getAllWinsAmt() {
        return Integer.parseInt(driver.findElement(allWinsAmt).getText());
    }

    public int calculateSpinsLeft(int spins, int bet) {
        spinTheReels();
        int spinsLeft = spins - bet;
        return spinsLeft;
    }

    public void spinUntilWin() {
        while (!driver.findElement(prizeWonLine).isDisplayed()) ;
        {
            spinTheReels();
        }
    }
}


