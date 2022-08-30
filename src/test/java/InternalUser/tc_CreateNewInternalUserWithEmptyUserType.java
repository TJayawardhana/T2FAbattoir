package InternalUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class tc_CreateNewInternalUserWithEmptyUserType extends InternalUserSteps {
    public static void main(String[] args) throws InterruptedException {
        createNewInternalUserWithEmptyUserType();
    }

    private static void createNewInternalUserWithEmptyUserType() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnExternalIcons();
        clickOnExternalUserTab();
        clickOnAddNewButtonExternalNInternalUSer();
        keepEmptyUserType();
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
