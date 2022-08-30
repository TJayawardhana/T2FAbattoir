package ExternalUser;

public class tc_CreateNewExternalUserWithEmptyLastName extends ExternalUserSteps {
    public static void main(String[] args) throws InterruptedException {
        createNewExternalUserWithEmptyLastName();
    }

    private static void createNewExternalUserWithEmptyLastName() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnExternalIcons();
        clickOnExternalUserTab();
        clickOnAddNewButtonExternalNInternalUSer();
        selectUserTypeRoleButcher();
        enterFirstName();
        keepEmptyLastName();
        enterValidContactNumber();
        enterValidMail();
        enterValidOrganizationName();
        enterDoneButtonInExternalUser();
        closeDrive();
        reportEnd();
    }
}
