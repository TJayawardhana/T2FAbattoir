package ProcessingStatus;

public class tc_ClickOnUpdateButtonWithoutAnyUpdate extends ProcessingStatusSteps {
    public static void main(String[] args) throws InterruptedException {

        clickOnUpdateButtonWithoutAnyUpdate();
    }

    private static void clickOnUpdateButtonWithoutAnyUpdate() throws InterruptedException {

        openBrowser();
        login();
        clickBookingTab();
        clickOnProcessingStatus();
        clickUpdateButton();
        clickYesNoInThePopup();
        verifyPleaseUpdateWeightBeforeSubmitMessage();
        signOut();
        reportEnd();
    }
}
