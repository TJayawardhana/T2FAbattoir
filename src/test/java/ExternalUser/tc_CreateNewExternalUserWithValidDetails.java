package ExternalUser;


public class tc_CreateNewExternalUserWithValidDetails extends ExternalUserSteps  {
    public static void main(String[] args) throws InterruptedException {
        createNewExternalUserWithValidDetails();
    }

    private static void createNewExternalUserWithValidDetails() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnExternalIcons();
        clickOnExternalUserTab();
        clickOnAddNewButtonExternalNInternalUSer();
        selectUserTypeRoleButcher();
        enterFirstName();
        enterLastName();
        enterValidContactNumber();
        enterValidMail();
        enterValidOrganizationName();
        enterDoneButtonInExternalUser();
        closeDrive();
        reportEnd();
    }
}
