package ExternalUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class tc_CreateNewExternalUserWithEmptyFields extends ExternalUserSteps {
    public static void main(String[] args) throws InterruptedException {
        createNewExternalUserWithEmptyFields();
    }
    private static void createNewExternalUserWithEmptyFields() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnExternalIcons();
        clickOnExternalUserTab();
        clickOnAddNewButtonExternalUSer();
        keepEmptyUserType();
        keepEmptyFirstName();
        keepEmptyContactNumber();
        keepEmptyMail();
        keepEmptyOrganizationName();
        closeDrive();
        reportEnd();

    }
}
