import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangeFooter {

    private WebDriver driver;

    public ChangeFooter(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(className = "btnChangeBackground")
    private WebElement changeBackgroundButton;
    @FindBy(className = "btnChangeReels")
    private WebElement changeIconsButton;
    @FindBy(className = "btnChangeMachine")
    private WebElement changeMachineButton;

    public void changeBackground (){changeBackgroundButton.click();}
    public void changeIcons (){changeIconsButton.click();}
    public void changeMachine (){changeMachineButton.click();}


}
