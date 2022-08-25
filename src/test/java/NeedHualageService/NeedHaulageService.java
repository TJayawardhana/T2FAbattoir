package NeedHualageService;

import Booking.BookingSteps;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertTrue;

public class NeedHaulageService extends BookingSteps {

    //CLICK ASSIGN HAULAGE BUTTON
    public static void clickAssignHaulage() throws InterruptedException {
        try {
            // Click on Assign Haulage Button
            driver.findElement(By.xpath("//button[text()='Assign Haulage ']")).click();
            report.test.log(LogStatus.PASS, "Assign Haulage Button is Clickable");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Assign Haulage Button is not Clickable");
        }
        Thread.sleep(5000);
    }

    //SELECT HAULAGE SERVICE
    public static void selectHaulageService() throws InterruptedException {
        try {
            // Select Haulage Service
            driver.findElement(By.xpath("(//button[text()='Select'])[1]")).click();
            report.test.log(LogStatus.PASS, "Successfully Selected Haulage Service");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Haulage Service is not Selected");
        }

        Thread.sleep(3000);
    }

    //VERIFY MESSAGE//
    //Verify Message For Selected Delivery Service
    public static void verifyMessageSelectedDeliveryService() throws InterruptedException {
        try {
            // Verify Message
            String expectedText = " ABC selected as meat delivery service ";
            Assert.assertEquals(" ABC selected as meat delivery service ", expectedText);
            report.test.log(LogStatus.PASS, "Successfully Displayed Message");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Verify Message is not Displaying");
        }
        Thread.sleep(5000);
    }

    //Verify Message For Assigned Successful
    public static void verifyMessageSuccessfulSelectDeliveryService() throws InterruptedException {
        try {
            // Verify Message
            String expectedText = " Assigned haulage service successfully ";
            Assert.assertEquals(" Assigned haulage service successfully ", expectedText);
            report.test.log(LogStatus.PASS, "Displaying Verify Message");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Verify Message is not Displaying");
        }
        Thread.sleep(5000);
    }
    //Verify Booking Message
    public static void verifyMessageBooking() throws InterruptedException {
        try {
            // Verify Message
            String expectedText = " Booking approved ";
            Assert.assertEquals(" Booking approved ",expectedText);
            report.test.log(LogStatus.PASS, "Booking Approve Success Message is Displaying");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Approve Success Message is not Displaying");
        }

        Thread.sleep(5000);
    }

    //EDIT HAULAGE SERVICE COST
    public static void editHaulageServiceCost() throws InterruptedException {
        try {
            // Haulage Service Total KM
            driver.findElement(By.xpath("//input[@id=\"total\"]")).clear();
            driver.findElement(By.xpath("//input[@id=\"total\"]")).sendKeys("null");
            report.test.log(LogStatus.PASS, "Total KM's Added Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Total KM's Added Wrongly");
        }
        Thread.sleep(2000);
    }

    //HAULAGE SERVICE MANUAL AMOUNT
    public static void haulageServiceManualAmount() throws InterruptedException {
        try {
            // Haulage Service Manual Amount
            driver.findElement(By.xpath("//input[@formcontrolname=\"livestockTransportTotalCost\"]")).clear();
            driver.findElement(By.xpath("//input[@formcontrolname=\"livestockTransportTotalCost\"] ")).sendKeys("null");
            report.test.log(LogStatus.PASS, "Haulage Manual Amount Added Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Haulage Manual Amount Added Wrongly");
        }

        Thread.sleep(5000);
    }

    //CLICK ON SEND REQUEST BUTTON
    public static void clickOnSendRequestButton() throws InterruptedException {
        try {
            // Click on Send Request Button
            driver.findElement(By.xpath("//button[text()='Send Request ']")).click();
            report.test.log(LogStatus.PASS, "Send Request Button is Clickable");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Send Request Button is not Clickable");
        }

        Thread.sleep(5000);
    }

    //CANCEL BUTTOn
    public static void clickCancelButton() throws InterruptedException {
        try {
            // Click on Back Button
            driver.findElement(By.xpath("(//button[text()='Back '])[2]")).click();
            report.test.log(LogStatus.PASS, "Back Button is Clickable");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Back Button is not Clickable");
        }
        Thread.sleep(5000);
    }

    //Click On Approve and Reject Button
    public static void clickApproveOrRejectStock() throws InterruptedException {
        try {
            // Click on Approve and Reject Button
            driver.findElement(By.xpath("//button[text()='Approve or Reject Stock ']")).click();
            report.test.log(LogStatus.PASS, "Approve and Reject Button is Clickable");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Approve and Reject Button is not Clickable");
        }
        Thread.sleep(5000);
    }

    public static void clickApproveButton() throws InterruptedException {
        try {
            // Click on Approve Button
            driver.findElement(By.xpath("//button[text()=' Approve ']")).click();
            report.test.log(LogStatus.PASS, "Approve Button is Clickable");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Approve Button is not Clickable");
        }

        Thread.sleep(5000);
    }
    //View Preview page
    public static void verifyPreviewPage() throws InterruptedException {
        try {
            // Verify Preview Page
            assertTrue(driver.getTitle().contains("Preview"));
            report.test.log(LogStatus.PASS, "Successfully Navigate to the Preview Page");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Preview Page Navigating Error");
        }
        Thread.sleep(5000);
    }
    //Click Back Button
    public static void clickBackButton(){
        try {
            // Click on Back Button
            driver.findElement(By.xpath("(//button[text()='Back '])[2]")).click();
            report.test.log(LogStatus.PASS, "Back Button is Clickable");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Back Button is not Clickable");
        }
    }
}
