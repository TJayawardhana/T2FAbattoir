package PendingStatus;

public class tc_SelectMeatDeliver extends PendingStatusSteps {
    public static void main(String[] args) throws InterruptedException {
        tcselectMeatDeliver();
    }
    public static void tcselectMeatDeliver() throws InterruptedException {
        report.createReport("tc_CancleStockDetailsPage");
        openBrowser();
        login();
        clickBookingTab();
        clickPendingStatus();
        clickAssignDeliveryButton();
        selectMeatDelivery();
        verifyGHIMeatDeliveryServiceMessage();
        signOut();
        reportEnd();
    }
}
