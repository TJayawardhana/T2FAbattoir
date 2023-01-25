package tc_Bookings.tc_ProcessingStatus;

import Reporter.Report;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class tc_AddingOnlyMeatDeliveryManualAmount {

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

        // Edit Delivery Service Cost

        try {
            // Meat Delivery Total KM
            driver.findElement(By.xpath("(//input[@id=\"total\"])[1]")).clear();
            driver.findElement(By.xpath("(//input[@id=\"total\"])[1]")).sendKeys("null");
            report.test.log(LogStatus.PASS, "Meat Delivery Total Km's are Added");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Meat Delivery Total Km's are not Added");
        }

        try {
            // Meat Delivery Manual Amount
            driver.findElement(By.xpath("//input[@formcontrolname=\"meatDeliveryTotalCost\"]")).clear();
            driver.findElement(By.xpath("//input[@formcontrolname=\"meatDeliveryTotalCost\"]")).sendKeys("20");
            report.test.log(LogStatus.PASS, "Meat Delivery Manual Amount are Added");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Meat Delivery Manual Amount are not Added");
        }

        try {
            // Offal Delivery Total KM
            driver.findElement(By.xpath("(//input[@id=\"total\"])[2]")).clear();
            driver.findElement(By.xpath("(//input[@id=\"total\"])[2]")).sendKeys("null");
            report.test.log(LogStatus.PASS, "Offal Delivery Total Km's are Added");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Offal Delivery Total Km's are not Added");
        }

        try {
            // Offal Delivery Manual Amount
            driver.findElement(By.xpath("//input[@formcontrolname=\"offalDeliveryTotalCost\"]")).clear();
            driver.findElement(By.xpath("//input[@formcontrolname=\"offalDeliveryTotalCost\"]")).sendKeys("null");
            report.test.log(LogStatus.PASS, "Offal Delivery Manual Amount are Added");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Offal Delivery Manual Amount are Added");
        }

        try {
            // Click on Send Request Button
            driver.findElement(By.xpath("//button[text()='Send Request ']")).click();
            report.test.log(LogStatus.PASS, "Send request Button is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Send request Button is not Clickable");
        }

        Thread.sleep(5000);

        try {
            // Verify Message
            String expectedText = "  Assigned meat delivery service successfully  ";
            Assert.assertEquals("  Assigned meat delivery service successfully  ", expectedText);
            report.test.log(LogStatus.PASS, "Meat Delivery Service Assigned Message is Displaying");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Meat Delivery Service Assigned Message is not Displaying");
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
