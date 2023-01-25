package tc_Bookings.tc_ProcessingStatus;

import Reporter.Report;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_ClickOnCancelButton {

    public static void main(String[] args) throws InterruptedException {
        Report report = new Report();
        report.createReport("tc_CancleStockDetailsPage");

        // Open Browser
        System.setProperty("webdriver.chrome.driver","D:\\T2FAbattoir\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            // Open URL
            driver.get("https://qa-portal.trade2farm.ie/login");
            report.test.log(LogStatus.PASS, "Page Loading Successfully");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Page Loading Unsuccessfully");
        }

        // Maximise the Browser
        driver.manage().window().maximize();

        try {
            // Enter Valid Username
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("abattoiradmin@gmail.com");
            report.test.log(LogStatus.PASS, "Entered Email Successfully");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Entered Email Unsuccessfully");
        }

        try {
            //Enter Valid Password
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("Hyperspace123");
            report.test.log(LogStatus.PASS, "Entered Correct Password");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Entered Wrong Password");
        }

        Thread.sleep(5000);

        try {
            //Click on SignIn Button
            driver.findElement(By.xpath("//button[text()=' Log In ']")).click();
            report.test.log(LogStatus.PASS, "Login Button is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Login Button is not Clickable");
        }

        Thread.sleep(5000);

        try {
            // Click on Bookings Tab
            driver.findElement(By.xpath("//i[@class=\"i-Calendar-4 nav-icon\"]")).click();
            report.test.log(LogStatus.PASS, "Login Button is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Login Button is not Clickable");
        }

        Thread.sleep(5000);

        try {
            // Click on Processing Status
            driver.findElement(By.xpath("(//span[text()=\"PROCESSING\"])[1]")).click();
            report.test.log(LogStatus.PASS, "Processing Status is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Processing Status is not Clickable");
        }

        // Verify Preview Page

        Thread.sleep(5000);

        try {
            // Click on Assign Delivery Button
            driver.findElement(By.xpath("//button[text()='Assign Delivery ']")).click();
            report.test.log(LogStatus.PASS, "Assign Delivery Button is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Assign Delivery Button is not Clickable");
        }

        Thread.sleep(5000);

        //Verify Assign Delivery Page

        // Click on Cancel Button
        driver.findElement(By.xpath("//button[@class=\"btn btn-brown\"]")).click();

        // Verify Preview Page

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
