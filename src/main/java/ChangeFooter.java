import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeFooter {

    private WebDriver driver;

    public ChangeFooter(WebDriver driver) {
        this.driver = driver;
    }
    private By betAmt = By.xpath("//span[@id='bet']");

    private By changeBackgroundButton = By.className("btnChangeBackground");
    private By changeIconsButton = By.className("btnChangeReels");
    private By changeMachineButton = By.className("btnChangeMachine");


    public void changeBackground() {
        driver.findElement(changeBackgroundButton).click();
    }

    public void changeIcons() {
        driver.findElement(changeIconsButton).click();
    }

    public void changeMachine(int clickAmt) throws InterruptedException {
        for (int i = 0; i < clickAmt; i++) {
            driver.findElement(changeMachineButton).click();
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(betAmt));
            Thread.sleep(2000);
        }
    }

}
