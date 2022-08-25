package PendingStatus;

public class tc_CheckingProcessingDetails extends PendingStatusSteps {
    public static void main(String[] args) throws InterruptedException {
        checkingProcessingDetails();
    }

    public static void checkingProcessingDetails() throws InterruptedException {
        report.createReport("tc_CancleStockDetailsPage");
        openBrowser();
        login();
        clickBookingTab();
        clickPendingStatus();
        signOut();
        reportEnd();
    }
}
