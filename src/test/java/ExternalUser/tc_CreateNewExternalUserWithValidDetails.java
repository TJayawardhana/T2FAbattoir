package ExternalUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class tc_CreateNewExternalUserWithValidDetails extends ExternalUserSteps  {
    public static void main(String[] args) throws InterruptedException {
        createNewExternalUserWithValidDetails();
    }

    private static void createNewExternalUserWithValidDetails() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnExternalIcons();
        clickOnExternalUserTab();
        clickOnAddNewButtonExternalUSer();
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
