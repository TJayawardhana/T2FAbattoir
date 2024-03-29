package tc_Bookings.tc_PendingStatus;

import Reporter.Report;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_CancelApproveScreen {

    public static void main(String[] args) throws InterruptedException {
        Report report = new Report();
        report.createReport("tc_CancelApproveScreen");

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
            report.test.log(LogStatus.PASS, "Booking Tab is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }

        Thread.sleep(5000);

        try {
            // Click on Pending Status
            driver.findElement(By.xpath("(//span[text()='PENDING'])[1]")).click();
            report.test.log(LogStatus.PASS, "Pending Status is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Pending Status is not Clickable");
        }

        // Verify Preview Page

        Thread.sleep(5000);

        try {
            // Click on Approve or Reject Stock Button
            driver.findElement(By.xpath("//button[text()='Approve or Reject Stock ']")).click();
            report.test.log(LogStatus.PASS, "Approve or Reject Stock Button is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Approve or Reject Stock Button is not Clickable");
        }

        // Verify Approve Stock Request

        Thread.sleep(5000);

        try {
            // Click on Cancel Button
            driver.findElement(By.xpath("(//span[@aria-hidden=\"true\"])[3]")).click();
            report.test.log(LogStatus.PASS, "Cancel Button is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Cancel Button is not Clickable");
        }

        // Verify Preview Page Header

        Thread.sleep(5000);

        try {
            // Click on User Drop Down
            driver.findElement(By.id("userDropdown")).click();
            report.test.log(LogStatus.PASS, "User Drop Down is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"User Drop Down is not Clickable");
        }

        Thread.sleep(5000);

        try {
            // Click on Sign Out
            driver.findElement(By.id("signoutButton")).click();
            report.test.log(LogStatus.PASS, "Sign Out is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Sign Out is not Clickable");
        }
        Thread.sleep(5000);


        try {
            // Close Drive
            driver.quit();
            report.test.log(LogStatus.PASS, "Drive Quit Successfully");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Drive Quit Unsuccessfully");
        }


        report.endReporting();
    }
}
