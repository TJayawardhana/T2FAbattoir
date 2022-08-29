package DeliverStatus;

public class tc_VerifyDeliverPreviewPage extends DeliveryStatusStep{
    public static void main(String[] args) throws InterruptedException {
        verifyDeliverPreviewPage();
    }

    private static void verifyDeliverPreviewPage() throws InterruptedException {
        report.createReport("tc_VerifyDeliverPreviewPage");
        openBrowser();
        login();
        clickBookingTab();
        clickDeliveryProcessStatus();
        signOut();
        reportEnd();
    }
}
