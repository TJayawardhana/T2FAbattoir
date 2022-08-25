package Booking;
import Report.Report;

import static Booking.BookingSteps.*;
import static Login.LoginSteps.*;
import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbattoirDeliveredStatus {
    public static void main(String[] args) throws InterruptedException {
//        Report report = new Report();
        abattoirDeliveredStatus();
    }
    public static void abattoirDeliveredStatus() throws InterruptedException {
        report.createReport("tc_AbattoirDeliveredStatus");
        openBrowser();
        login();
        clickBookingTab();
        clickDeliveryProcessStatus();
        signOut();
        reportEnd();
    }

    //TEST STEPS
    /*public static void clickBookingTab() throws InterruptedException {
        try {
            // Click on Bookings Tab
            driver.findElement(By.xpath("//i[@class=\"i-Calendar-4 nav-icon\"]")).click();
            report.test.log(LogStatus.PASS,"Successfully Clicked Booking Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Booking Tab is not Clickable");
        };

        Thread.sleep(5000);
    }
    public static void clickProcessStatus(){
        try {
            // Click on Processing Status
            driver.findElement(By.xpath("(//span[text()=\"DELIVERED\"])[1]")).click();
            report.test.log(LogStatus.PASS,"Successfully Clicked Processing Status");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Processing Status is not Clickable");
        };

    }*/

}
