package Booking;

import static Login.LoginSteps.*;
import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbattoirNeedHaulageServiceStatus extends BookingSteps {
    public static void main(String[] args) throws InterruptedException {
        abattoirNeedHaulageServiceStatus();
    }

    public static void abattoirNeedHaulageServiceStatus() throws InterruptedException {
        report.createReport("tc_AbattoirNeedHaulageServiceStatus");
        openBrowser();
        login();
        clickBookingTab();
        verifyBookingPageHeader();
        clickNeedHaulageServiceStatus();
        verifyPreviewPageHeader();
        signOut();
        report.endReporting();
    }

}
