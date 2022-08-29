package ExternalUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class tc_CreateNewExternalUserWithEmptyFirstName extends ExternalUserSteps {
    public static void main(String[] args) throws InterruptedException {
        createNewExternalUserWithEmptyFirstName();
    }

    private static void createNewExternalUserWithEmptyFirstName() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnExternalIcons();
        clickOnExternalUserTab();
        clickOnAddNewButtonExternalUSer();
        selectUserTypeRoleButcher();
        keepEmptyFirstName();
        enterLastName();
        enterValidContactNumber();
        enterValidMail();
        enterValidOrganizationName();
        enterDoneButtonInExternalUser();
        closeDrive();
        reportEnd();
    }

}
