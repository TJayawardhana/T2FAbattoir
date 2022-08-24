package Booking;

import static Login.LoginSteps.*;
import static OpenBrowser.OpenWeb.openBrowser;

public class tc_VerifyBookings extends BookingSteps {
    public static void main(String[] args) throws InterruptedException {
        report.createReport("tc_VerifyBookings");
        openBrowser();
        login();
        clickBookingTab();
        verifyBookingPageHeader();
        signOut();
        report.endReporting();

    }

    public static void verifyBookings() throws InterruptedException {
        report.createReport("tc_VerifyBookings");
        openBrowser();
        login();
        clickBookingTab();
        verifyBookingPageHeader();
        signOut();
        report.endReporting();
    }
}
