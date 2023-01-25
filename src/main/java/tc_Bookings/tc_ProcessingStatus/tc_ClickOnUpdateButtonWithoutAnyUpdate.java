package tc_Bookings.tc_ProcessingStatus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class tc_ClickOnUpdateButtonWithoutAnyUpdate {

    public static void main(String[] args) throws InterruptedException {
        // Open Browser
        System.setProperty("webdriver.chrome.driver","D:\\T2FAbattoir\\driver\\chromedriver.exe");
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

        Thread.sleep(5000);

        //Click on Update Button
        driver.findElement(By.xpath("//button[text()=\"Update \"]")).click();

        Thread.sleep(5000);

        //Click on Yes/No in the popup
        driver.findElement(By.xpath("//button[@class=\"btn btn-secondary float-right\"]")).click();

        //Verify Message
        String expectedText =" Please update offal weight before submit ";
        Assert.assertEquals(" Please update offal weight before submit ",expectedText);

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
