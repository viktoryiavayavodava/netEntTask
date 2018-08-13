import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class SlotGame {

    private WebDriver driver;

    public SlotGame(WebDriver driver) {
        this.driver = driver;
    }
    private By prizeListRow = By.xpath("//div[@id='prizes_list']/div[not(contains(@style, 'none'))]/div");
    private By payoutRowOne = By.xpath("//div[@id='prizes_list']/div/div[1]");
    private By payoutRowTwo = By.xpath("//div[@id='prizes_list']/div/div[2]");
    private By payoutRowThree = By.xpath("//div[@id='prizes_list']/div/div[3]");
    private By payoutRowFour = By.xpath("//div[@id='prizes_list']/div/div[4]");
    private By payoutRowFive = By.xpath("//div[@id='prizes_list']/div/div[5]");
    private By payoutRowSix = By.xpath("//div[@id='prizes_list']/div/div[6]");
    private By payoutRowSeven = By.xpath("//div[@id='prizes_list']/div/div[7]");
    private By payoutRowEight = By.xpath("//div[@id='prizes_list']/div/div[8]");
    private By payoutRowNine = By.xpath("//div[@id='prizes_list']/div/div[9]");
    private By payoutRowTen = By.xpath("//div[@id='prizes_list']/div/div[10]");

    public int getRowOnePrize() {return Integer.parseInt(driver.findElement(payoutRowOne).getText());}
    public int getRowTwoPrize() {
        return Integer.parseInt(driver.findElement(payoutRowTwo).getText());
    }
    public int getRowThreePrize() {
        return Integer.parseInt(driver.findElement(payoutRowThree).getText());
    }
    public int getRowFourPrize() {
        return Integer.parseInt(driver.findElement(payoutRowFour).getText());
    }
    public int getRowFivePrize() {
        return Integer.parseInt(driver.findElement(payoutRowFive).getText());
    }
    public int getRowSixPrize() {
        return Integer.parseInt(driver.findElement(payoutRowSix).getText());
    }
    public int getRowSevenPrize() {
        return Integer.parseInt(driver.findElement(payoutRowSeven).getText());
    }
    public int getRowEightPrize() {
        return Integer.parseInt(driver.findElement(payoutRowEight).getText());
    }
    public int getRowNinePrize() {
        return Integer.parseInt(driver.findElement(payoutRowNine).getText());
    }
    public int getRowTenPrize() {
        return Integer.parseInt(driver.findElement(payoutRowTen).getText());
    }
    public int[] payoutsSix = new int[]{getRowOnePrize(), getRowTwoPrize(), getRowThreePrize(),
            getRowFourPrize(), getRowFivePrize(), getRowSixPrize()};
    public int[] payoutsEight = new int[]{getRowOnePrize(), getRowTwoPrize(), getRowThreePrize(),
            getRowFourPrize(), getRowFivePrize(), getRowSixPrize(), getRowSevenPrize(), getRowEightPrize()};
    public int[] payoutsNine = new int[]{getRowOnePrize(), getRowTwoPrize(), getRowThreePrize(),
            getRowFourPrize(), getRowFivePrize(), getRowSixPrize(), getRowSevenPrize(), getRowEightPrize(), getRowNinePrize()};
    public int[] payoutsTen = new int[]{getRowOnePrize(), getRowTwoPrize(), getRowThreePrize(),
            getRowFourPrize(), getRowFivePrize(), getRowSixPrize(), getRowSevenPrize(), getRowEightPrize(), getRowNinePrize(), getRowTenPrize()};

    public int[] calculatePayoutsSix(int bet, int[] payoutsSix) {
        for (int i = 0; i < payoutsSix.length; i++) {
            payoutsSix[i] = payoutsSix[i] * bet;
        }
        return payoutsSix;
    }

    public int[] calculatePayoutsEight(int bet, int[] payoutsEight) {
        for (int i = 0; i < payoutsEight.length; i++) {
            payoutsEight[i] = payoutsEight[i] * bet;
        }
        return payoutsEight;
    }

    public int[] calculatePayoutsNine(int bet, int[] payoutsNine) {
        for (int i = 0; i < payoutsNine.length; i++) {
            payoutsNine[i] = payoutsNine[i] * bet;
        }
        return payoutsNine;
    }

    public int[] calculatePayoutsTen(int bet, int[] payoutsTen) {
        for (int i = 0; i < payoutsTen.length; i++) {
            payoutsTen[i] = payoutsTen[i] * bet;
        }
        return payoutsTen;
    }

    public int getPayoutRows() {
        Select selectRows = new Select(driver.findElement(prizeListRow));
        List<WebElement> listOptions = selectRows.getOptions();
        int payoutRowsCount = listOptions.size();
        return payoutRowsCount;
    }
}























