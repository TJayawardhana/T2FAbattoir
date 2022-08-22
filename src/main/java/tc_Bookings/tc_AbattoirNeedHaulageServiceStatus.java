package tc_Bookings;


import Reporter.Report;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_AbattoirNeedHaulageServiceStatus {

    private static void assertTrue(boolean title_of_page) {
    }

    public static void main(String[] args) throws InterruptedException {
        Report report = new Report();
        report.createReport("tc_AbattoirNeedHaulageServiceStatus");

        // Open Browser
        System.setProperty("webdriver.chrome.driver","D:\\T2FAbattoir\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            // Open URL
            driver.get("https://qa-portal.trade2farm.ie/login");
            report.test.log(LogStatus.PASS,"Successfully Navigated");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Cannot load URL");
        };

        // Maximise the Browser
        driver.manage().window().maximize();

        try {
            // Enter Valid Username
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("abattoiradmin@gmail.com");
            report.test.log(LogStatus.PASS,"Entered Correct User Name");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Entered Wrong User Name");
        };

        try {
            // Enter Valid Username
            //Enter Valid Password
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("Hyperspace123");
            report.test.log(LogStatus.PASS,"Entered Correct Password");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Entered Wrong Password");
        };


        Thread.sleep(5000);

        try {
            //Click on SignIn Button
            driver.findElement(By.xpath("//button[@id=\"signinButton\"]")).click();
            report.test.log(LogStatus.PASS,"Successfully Clicked SignIn Button");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"SignIn button is not Clickable");
        };


        Thread.sleep(7000);

        try {
            // Click on Bookings Tab
            driver.findElement(By.xpath("//i[@class=\"i-Calendar-4 nav-icon\"]")).click();
            report.test.log(LogStatus.PASS,"Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        };

        Thread.sleep(5000);

        try {
            // Verify Bookings Page Header
            assertTrue(driver.getTitle().contains("Bookings"));
            report.test.log(LogStatus.PASS,"Successfully Navigated to the Booking Page");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Page is not Loading");
        };


        Thread.sleep(5000);

        try {
            // Click on Processing Status
            driver.findElement(By.xpath("(//span[text()=\"NEED_HAULAGE_SERVICE\"])[1]")).click();
            report.test.log(LogStatus.PASS,"Successfully Clicked Need Haulage Service Status");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Need Haulage Service Status is not Loading");
        };

        try {
            // Verify Preview Page Header
            assertTrue(driver.getTitle().contains("Preview"));
            report.test.log(LogStatus.PASS,"Successfully Navigated to the Preview Page");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Preview Page is not Displaying");
        };

        try {
            // Click on User Drop Down
            driver.findElement(By.id("userDropdown")).click();
            report.test.log(LogStatus.PASS,"DropDown Icon is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"DropDown Icon Is Not Clickable");
        };

        Thread.sleep(5000);

        try {
            // Click on Sign Out
            driver.findElement(By.id("signoutButton")).click();
            report.test.log(LogStatus.PASS,"SignOut Button is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"SignOut Button Is Not Clickable");
        };

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
