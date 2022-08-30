package InternalUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class tc_VerifyUserEditButton {

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

        //Click on one of the Edit Icon
        driver.findElement(By.xpath("(//i[@class=\"i-Pen-5\"])[1]")).click();
        Thread.sleep(7000);

        //Edit a field
        driver.findElement(By.xpath("//input[@formcontrolname=\"firstName\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"firstName\"]")).sendKeys("Ishuaraa");

        //Click on Update Button
        driver.findElement(By.xpath("(//span[text()=\"Update\"])[1]")).click();
        Thread.sleep(7000);

        driver.quit();

    }
}
