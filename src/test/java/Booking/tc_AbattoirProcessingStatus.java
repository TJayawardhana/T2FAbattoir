package Booking;

import static Login.LoginSteps.*;
import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbattoirProcessingStatus extends BookingSteps{
    public static void main(String[] args) throws InterruptedException {
        abattoirProcessingStatus();
    }
    public static void abattoirProcessingStatus() throws InterruptedException {
        report.createReport("tc_AbattoirProcessingStatus");
        openBrowser();
        login();
        clickBookingTab();
        verifyBookingPageHeader();
        clickProcessingStatus();
        signOut();
        report.endReporting();
    }
}
