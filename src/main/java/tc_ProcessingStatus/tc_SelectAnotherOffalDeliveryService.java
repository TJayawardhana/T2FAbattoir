package tc_ProcessingStatus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class tc_SelectAnotherOffalDeliveryService {

    public static void main(String[] args) throws InterruptedException {
        // Open Browser
        System.setProperty("webdriver.chrome.driver", "D:\\T2FAbattoir\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        // Open URL
        driver.get("https://qa-portal.trade2farm.ie/login");

        // Maximise the Browser
        driver.manage().window().maximize();

        // Enter Valid Username
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("abattoiradmin@gmail.com");

        //Enter Valid Password
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Hyperspace123");

        Thread.sleep(5000);

        //Click on SignIn Button
        driver.findElement(By.xpath("//button[text()=' Log In ']")).click();

        Thread.sleep(7000);

        // Click on Bookings Tab
        driver.findElement(By.xpath("//i[@class=\"i-Calendar-4 nav-icon\"]")).click();

        Thread.sleep(5000);

        // Click on Processing Status
        driver.findElement(By.xpath("(//span[text()=\"PROCESSING\"])[1]")).click();

        // Verify Preview Page

        Thread.sleep(5000);

        // Click on Assign Delivery Button
        driver.findElement(By.xpath("//button[text()='Assign Delivery ']")).click();

        Thread.sleep(5000);

        //Verify Assign Delivery Page

        // Click on Offal Service
        driver.findElement(By.xpath("(//button[text()='Select'])[4]")).click();

        // Verify Message
        String expectedText =" JKL selected as offal delivery service ";
        Assert.assertEquals(" JKL selected as offal delivery service ",expectedText);

        Thread.sleep(5000);

        // Click on User Drop Down
        driver.findElement(By.id("userDropdown")).click();

        Thread.sleep(5000);

        // Click on Sign Out
        driver.findElement(By.id("signoutButton")).click();

        Thread.sleep(5000);


        driver.quit();
    }
}
