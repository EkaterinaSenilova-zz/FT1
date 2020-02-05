import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Alert;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.*;

import java.util.concurrent.TimeUnit;


public class RunBrowser {


    private static final int SECONDS = 0;

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        //FirefoxOptions options1 = new FirefoxOptions();

        options.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--test-type");
        options.addArguments("--ignore-certificate-errors");

        /*options1.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
        options1.addArguments("start-maximized");
        options1.addArguments("disable-infobars");
        options1.addArguments("--disable-extensions");
        options1.addArguments("--test-type");
        options1.addArguments("--ignore-certificate-errors");*/

        WebDriver chromeDriver = new ChromeDriver();
        //WebDriver FirefoxDriver = new FirefoxDriver();
        String url = "http://devcasino.ganapati.tech/";
        chromeDriver.get(url);
        String actualURL = chromeDriver.getCurrentUrl();
        System.out.println("Successfully opened the devcasino.");

        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeDriver.get("http://devcasino.ganapati.tech/");

        if (actualURL.equals(url)) {
            System.out.println("The correct Url is opened");
        } else {
            System.out.println("An incorrect Url is opened");
        }
        WebDriverWait wait = new WebDriverWait(chromeDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log in"))).click();
        WebElement element2 = chromeDriver.findElement(By.xpath("//input[@placeholder='username']"));
        element2.sendKeys("testK");
        WebElement element3 = chromeDriver.findElement(By.xpath("//input[@placeholder='password']"));
        element3.sendKeys("testK");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("button"))).click();
        Thread.sleep(2000);

     //Testing all currencies
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("testK"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Account"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div/div/div/form/div[2]/div/select"))).click();
        Select oSelect = new Select(chromeDriver.findElement(By.xpath("//html/body/div/div/div/form/div[2]/div/select")));

        oSelect.equals("USD");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/nav/a"))).click();

        //boolean staus = chromeDriver.findElement(By.value("EUR")).isSelected();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href='#/game/greatbeauties']"))).click();


        WebElement element7 = chromeDriver.findElement(By.partialLinkText("⛶"));
        element7.click();
        chromeDriver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);


        //Thread.sleep(5000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@fitgroup='tapToStart']"))).isDisplayed();
        chromeDriver.findElement(By.id("wrapper")).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("spinButton"))).isDisplayed();
        chromeDriver.findElement(By.id("spinButton")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("spinButton"))).isDisplayed();

        Thread.sleep(2000);

       chromeDriver.navigate().back();


        //chromeDriver.quit();

    }


}
