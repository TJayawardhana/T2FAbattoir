package PendingStatus;

public class tc_VerifyStockDetails extends PendingStatusSteps{
    public static void main(String[] args) throws InterruptedException {
        verifyStockDetails();
    }
    public static void verifyStockDetails() throws InterruptedException {
        report.createReport("tc_CancleStockDetailsPage");
        openBrowser();
        login();
        clickBookingTab();
        clickPendingStatus();
        clickStockDetailsIcon();
        clickDoneButton();
        signOut();
        reportEnd();
    }


}
