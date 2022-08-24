package Booking;


import Login.LoginSteps;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import static OpenBrowser.OpenWeb.driver;
import static org.testng.AssertJUnit.assertTrue;

public class BookingSteps extends LoginSteps {
    public static void clickBookingTab() throws InterruptedException {
        try {
            // Click on Bookings Tab
            driver.findElement(By.xpath("//i[@class=\"i-Calendar-4 nav-icon\"]")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        }

        Thread.sleep(5000);
    }

    //STATUS//

    //DELIVERED
    public static void clickDeliveryProcessStatus() throws InterruptedException {
        try {
            // Click on Delivery Status
            driver.findElement(By.xpath("(//span[text()=\"DELIVERED\"])[1]")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked Processing Status");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Processing Status is not Clickable");
        }
        Thread.sleep(5000);
    }

    //NEED HAULAGE SERVICE
    public static void clickNeedHaulageServiceStatus() throws InterruptedException {
        try {
            // Click on Need Haulage Status
            driver.findElement(By.xpath("(//span[text()=\"NEED_HAULAGE_SERVICE\"])[1]")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked Need Haulage Service Status");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Need Haulage Service Status is not Loading");
        }
        Thread.sleep(5000);
    }

    //PENDING
    public static void clickPendingStatus() throws InterruptedException {
        try {
            // Click on Pending Processing Status
            driver.findElement(By.xpath("(//span[text()=\"PENDING\"])[1]")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked Pending Status");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Pending is not Clickable");
        }
        Thread.sleep(5000);
    }

    //PROCESSING
    public static void clickProcessingStatus() throws InterruptedException {

        try {
            // Click on Processing Status
            driver.findElement(By.xpath("(//span[text()=\"PROCESSING\"])[1]")).click();
            report.test.log(LogStatus.PASS, "Successfully Navigated to the Booking Page");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Booking Page is not Loading");
        }
        Thread.sleep(5000);
    }
    //////////////////////

    //HEADER SELECTION//

    //BOOKINGS PAGE HEADER
    public static void verifyBookingPageHeader() throws InterruptedException {
        try {
            // Verify Bookings Page Header
            assertTrue(driver.getTitle().contains("Bookings"));
            report.test.log(LogStatus.PASS, "Successfully Navigated to the Booking Page");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Booking Page is not Loading");
        }
        Thread.sleep(5000);
    }

    //PREVIEW PAGE HEADER
    public static void verifyPreviewPageHeader() throws InterruptedException {
        try {
            // Verify Preview Page Header
            assertTrue(driver.getTitle().contains("Preview"));
            report.test.log(LogStatus.PASS, "Successfully Navigated to the Preview Page");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Preview Page is not Displaying");
        }
        Thread.sleep(5000);
    }

}
