package InternalUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class tc_CreateNewInternalUserWithEmptyContactNumber extends InternalUserSteps {

    public static void main(String[] args) throws InterruptedException {
        //Open Browser
        System.setProperty("webdriver.chrome.driver","D:\\T2FAbattoir\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maximize the Browser
        driver.manage().window().maximize();

        //Open URL
        driver.get("https://qa-portal.trade2farm.ie/");

        //Implicitly Waits
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Enter valid Email Address(User name)
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("abattoiradmin@gmail.com");

        //Enter valid Password
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Hyperspace123");

        //Click on Login Button
        driver.findElement(By.xpath("//button[@id=\"signinButton\"]")).click();
        Thread.sleep(15000);

        //Mouse hover on Users Icon
        Actions action = new Actions(driver);
        WebElement listingOptions = driver.findElement(By.xpath("(//span[@class=\"nav-text\"])[5]"));
        Thread.sleep(9000);
        action.moveToElement(listingOptions).perform();

        //Click on Internal User tab
        driver.findElement(By.xpath("(//span[@class=\"item-name lvl1\"])[1]")).click();
        Thread.sleep(7000);

        //Click on Add New Button
        driver.findElement(By.xpath("//span[text()=\"Add New \"]")).click();
        Thread.sleep(7000);

        //Select User Type
        // Create object of the Select class
        Select usertype = new Select(driver.findElement(By.xpath("//select[@id=\"type\"]")));
        // Select the option by index
        usertype.selectByValue("ROLE_ABATTOIR_MANAGER");

        //Enter First Name
        driver.findElement(By.xpath("//input[@formcontrolname=\"firstName\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"firstName\"]")).sendKeys("Ishuara");

        //Enter Last Name
        driver.findElement(By.xpath("//input[@formcontrolname=\"lastName\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"lastName\"]")).sendKeys("Thilakshana");

        //Empty Contact Number
        driver.findElement(By.xpath("//input[@formcontrolname=\"contactNumber\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"contactNumber\"]")).sendKeys("");

        //Enter Valid Email
        driver.findElement(By.xpath("//input[@formcontrolname=\"email\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"email\"]")).sendKeys("ishut30@mailinator.com");

        //Click Done Button
        driver.findElement(By.xpath("//span[text()=\"Done\"]")).click();
        Thread.sleep(7000);

        driver.quit();
        createNewInternalUserWithEmptyContactNumber();

    }

    private static void createNewInternalUserWithEmptyContactNumber() throws InterruptedException {

        openBrowser();
        login();
        mouseHoverOnExternalIcons();
    }
}
