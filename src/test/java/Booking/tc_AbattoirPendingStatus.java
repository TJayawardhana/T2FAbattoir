package Booking;
import static Login.LoginSteps.login;
import static Login.LoginSteps.report;
import static Login.LoginSteps.signOut;

import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbattoirPendingStatus extends BookingSteps {
    public static void main(String[] args) throws InterruptedException {
        abattoirPendingStatus();
    }
    private static void abattoirPendingStatus() throws InterruptedException {
        report.createReport("tc_AbattoirPendingStatus");
        openBrowser();
        login();
        clickBookingTab();
        verifyBookingPageHeader();
        clickPendingStatus();
        signOut();
        reportEnd();
    }
}
