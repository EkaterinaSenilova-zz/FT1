import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

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

        //Launch the Online Store Website

        chromeDriver.get(url);

        String actualURL = chromeDriver.getCurrentUrl();
        System.out.println("Successfully opened the devcasino.");

        //Thread.sleep(5000);
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeDriver.get("http://devcasino.ganapati.tech/");

        if (actualURL.equals(url)) {
            System.out.println("The correct Url is opened");
        } else {
            System.out.println("An incorrect Url is opened");
        }
        //chromeDriver.navigate().to("http://devcasino.ganalogics.net/#/game/sumi/demo");
        //WebElement element = chromeDriver.findElement(By.linkText("Log in"));
        //element.click();
        WebDriverWait wait = new WebDriverWait(chromeDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log in"))).click();
        //Thread.sleep(3000);
        WebElement element2 = chromeDriver.findElement(By.xpath("//input[@placeholder='username']"));
        element2.sendKeys("testK");
        WebElement element3 = chromeDriver.findElement(By.xpath("//input[@placeholder='password']"));
        element3.sendKeys("testK");
        //WebElement element4 = chromeDriver.findElement(By.tagName("button"));
        //element4.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("button"))).click();
        //Thread.sleep(2000);

     //Testing all currencies



        //WebElement element5 = chromeDriver.findElement(By.xpath("//*[@href='#/game/greatbeauties']"));
        //element5.click();
        //Thread.sleep(8000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href='#/game/greatbeauties']"))).click();


        WebElement element7 = chromeDriver.findElement(By.partialLinkText("⛶"));
        element7.click();
        chromeDriver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);

                //chromeDriver.manage().timeouts().setScriptTimeout(2000,TimeUnit.SECONDS);
                     Thread.sleep(5000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wrapper"))).click();

        //chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //WebElement element6 = chromeDriver.findElement(By.id("wrapper"));
        //element6.click();


        //chromeDriver.switchTo().frame(0);

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("horizontal tapToStart"))).click();
        //WebElement element7 = chromeDriver.findElement(By.id("spinButton"));
        //element7.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("spinButton"))).click();

        Thread.sleep(8000);



        chromeDriver.quit();



        /*FirefoxDriver.get(url);

        String actualURL = FirefoxDriver.getCurrentUrl();
        System.out.println("Successfully opened the devcasino.");

        Thread.sleep(5000);
        if (actualURL.equals(url)) {
            //System.out.println("The correct Url is opened");
        } else {
            System.out.println("An incorrect Url is opened");
        }*/


        //chromeDriver.navigate().refresh();
            /*if (element.equals("Sumi-e")){
                element.click();
            }
            else {
                System.out.println("Can't find");
            }*/


        //Wait for 5 Sec
        //Thread.sleep(10000);

        // Close the driver
        //chromeDriver.quit();

//Testing for currencies




    }


}
