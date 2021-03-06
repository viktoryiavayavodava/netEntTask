import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SlotMachineSixLinesTest {

    private WebDriver driver;
    private MachineFooter machineFooter;
    private ChangeFooter changeFooter;
    //    private SlotGame slotGame;

    @Before
    public void setUp() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\IdeaProjects\\netEntTask\\src\\main\\resources\\chromedriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("marionette", true);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://slotmachinescript.com/");
        changeFooter = new ChangeFooter(driver);
        machineFooter = new MachineFooter(driver);
//        slotGame = new SlotGame(driver);
        changeFooter.changeMachine(1);
        Thread.sleep(2000);
        //--> to check amt of payRows in the current slot and apply calculation logic accordingly
        //slotGame.getPayoutRows();
        //add here hashmap search to return logic for corresponding payRows amount;
    }

    @Test
    public void betUpTest() {
        int initialBet = machineFooter.getBetAmt();
        machineFooter.setBetUp(1);
        int newBet = machineFooter.getBetAmt();
        Assert.assertFalse(initialBet == newBet);
    }

    @Test
    public void betDownTest() {
        machineFooter.setBetUp(1);
        int initialBet = machineFooter.getBetAmt();
        machineFooter.setBetDown(1);
        int newBet = machineFooter.getBetAmt();
        Assert.assertFalse(initialBet == newBet);
    }

    @Test
    public void betResetTest() {
        int initialBet = machineFooter.getBetAmt();
        machineFooter.setBetUp(3);
        machineFooter.setBetDown(3);
        int newBet = machineFooter.getBetAmt();
        Assert.assertTrue(initialBet == newBet);
    }

    @Test
    public void betMinimumTest() {
        int initialBet = machineFooter.getBetAmt();
        machineFooter.setBetDown(2);
        int newBet = machineFooter.getBetAmt();
        Assert.assertTrue(initialBet == newBet);
    }

    @Test
    public void betMaxTest() {
        machineFooter.setBetUp(20);
        int newBet = machineFooter.getBetAmt();
        Assert.assertEquals(newBet, 10);
    }

    @Test
    public void spinsLeftTest() {
        int currentSpins = machineFooter.getSpinsAmt();
        int currentBet = machineFooter.getBetAmt();
        machineFooter.spinTheReels();
        machineFooter.calculateSpinsLeft(currentSpins, currentBet);
    }

//    @Test
//    public void winChartChangeTest() {
//        int currentBet = machineFooter.getBetAmt();
//        int[] currentPayouts = slotGame.payoutsSix;
//        machineFooter.setBetUp(1);
//        int[] payoutsCalculated = slotGame.calculatePayoutsSix(currentBet, currentPayouts);
//        int[] newPayouts = slotGame.payoutsSix;
//        for (int i = 0; i < currentPayouts.length; i++) {
//            Assert.assertTrue(newPayouts[i] == payoutsCalculated[i]);
//        }
//    }

    @After
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
        driver = null;
    }
}
