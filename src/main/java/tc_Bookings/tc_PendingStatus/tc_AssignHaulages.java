package tc_Bookings.tc_PendingStatus;

import Reporter.Report;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class tc_AssignHaulages {

    public static void main(String[] args) throws InterruptedException {
        Report report = new Report();
        report.createReport("tc_AssignHaulages");

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
            driver.findElement(By.xpath("(//span[text()='NEED_HAULAGE_SERVICE'])[1]")).click();
            report.test.log(LogStatus.PASS, "Pending Status is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Pending Status is not Clickable");
        }

        // Verify Preview Page

        Thread.sleep(5000);

        try {
            // Click on Assign Haulage Button
            driver.findElement(By.xpath("//button[text()='Assign Delivery ']")).click();
            report.test.log(LogStatus.PASS, "Assign Haulage Button is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Assign Haulage Button is not Clickable");
        }

        Thread.sleep(5000);

        try {
            // Select Meat Delivery
            driver.findElement(By.xpath("(//button[text()='Select'])[2]")).click();
            report.test.log(LogStatus.PASS, "Meat Delivery is Selected");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Can't Select Meat Delivery");
        }

        Thread.sleep(2000);

        try {
            // Verify Message
            String expectedText ="  GHI selected as meat delivery service ";
            Assert.assertEquals("  GHI selected as meat delivery service ",expectedText);
            report.test.log(LogStatus.PASS, "Displaying Success Message");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Success Message is not Displaying");
        }

        Thread.sleep(5000);

        try {
            // Select Offal Delivery
            driver.findElement(By.xpath("(//button[text()='Select'])[4]")).click();
            report.test.log(LogStatus.PASS, "Offal Delivery is Selected");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Can't Select Offal Delivery");
        }

        Thread.sleep(5000);

        try {
            // Verify Message
            String expectedText = " GHI selected as offal delivery service ";
            Assert.assertEquals(" GHI selected as offal delivery service ",expectedText);
            report.test.log(LogStatus.PASS, "Displaying Success Message");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Success Message is not Displaying");
        }

        Thread.sleep(5000);

        try {
            // Click on Send Request Button
            driver.findElement(By.xpath("Send Request ")).click();
            report.test.log(LogStatus.PASS, "Send Request Button is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Send Request Button is not Clickable");
        }

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
