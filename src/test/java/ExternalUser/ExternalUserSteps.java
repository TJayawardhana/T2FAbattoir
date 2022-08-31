package ExternalUser;

import DeliverStatus.DeliveryStatusStep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ExternalUserSteps extends DeliveryStatusStep {
    //MouseHover on External Icons
    public static void mouseHoverOnExternalIcons() throws InterruptedException {
        //Mouse hover on Users Icon
        Actions action = new Actions(driver);
        WebElement listingOptions = driver.findElement(By.xpath("(//span[@class=\"nav-text\"])[5]"));
        Thread.sleep(9000);
        action.moveToElement(listingOptions).perform();
    }

    //Click on External User Tab
    public static void clickOnExternalUserTab() throws InterruptedException {
        //Click on External User tab
        driver.findElement(By.xpath("//span[text()=\"External User\"]")).click();
        Thread.sleep(7000);
    }

    //Click on Add New Button ExternalUser
    public static void clickOnAddNewButtonExternalNInternalUSer() throws InterruptedException {
        //Click on Add New Button
        driver.findElement(By.xpath("//span[text()=\"Add New \"]")).click();
        Thread.sleep(7000);
    }

    //Select User Type ROLE BUTCHER
    public static void selectUserTypeRoleButcher() throws InterruptedException {
        //Select User Type
        // Create object of the Select class
        Select usertype = new Select(driver.findElement(By.xpath("//select[@id=\"type\"]")));
        // Select the option by index
        usertype.selectByValue("ROLE_BUTCHER");
        Thread.sleep(7000);
    }

    //Select User Type EMPTY
    public static void keepEmptyUserType() {
        //Empty User Type
        // Create object of the Select class
        Select usertype = new Select(driver.findElement(By.xpath("//select[@id=\"type\"]")));
        // Select the option by index
        usertype.selectByValue("");
    }

    //DETAIL FORM FILL//
    //Enter first name
    public static void enterFirstName() throws InterruptedException {
        //Empty First Name
        driver.findElement(By.xpath("//input[@formcontrolname=\"firstName\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"firstName\"]")).sendKeys("Ishuara");
        Thread.sleep(2000);
    }

    //Keep Empty FirstName
    public static void keepEmptyFirstName() throws InterruptedException {
        //Empty First Name
        driver.findElement(By.xpath("//input[@formcontrolname=\"firstName\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"firstName\"]")).sendKeys("");
        Thread.sleep(2000);
    }

    //Enter Last name
    public static void enterLastName() throws InterruptedException {
        //Enter Last Name
        driver.findElement(By.xpath("//input[@formcontrolname=\"lastName\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"lastName\"]")).sendKeys("Thilakshana");
        Thread.sleep(2000);
    }
    //Keep Last Name Empty
public static void keepEmptyLastName() throws InterruptedException{
    //Empty Last Name
    driver.findElement(By.xpath("//input[@formcontrolname=\"lastName\"]")).clear();
    driver.findElement(By.xpath("//input[@formcontrolname=\"lastName\"]")).sendKeys("");
}
    //Enter Valid Email
    public static void enterValidMail() throws InterruptedException {
        //Enter Valid Email
        driver.findElement(By.xpath("//input[@formcontrolname=\"email\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"email\"]")).sendKeys("ishut0@mailinator.com");
        Thread.sleep(2000);
    }

    //Enter Empty Email
    public static void keepEmptyMail() {
        //Enter Empty Email
        driver.findElement(By.xpath("//input[@formcontrolname=\"email\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"email\"]")).sendKeys("");
    }

    //Enter Valid Organization Name
    public static void enterValidOrganizationName() throws InterruptedException {
        //Enter Valid Organization Name
        driver.findElement(By.xpath("//input[@formcontrolname=\"organizationName\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"organizationName\"]")).sendKeys("ishutOrg");
        Thread.sleep(2000);
    }
    //Keep Empty Organization Name
    public static void keepEmptyOrganizationName(){
        //Empty Valid Organization Name
        driver.findElement(By.xpath("//input[@formcontrolname=\"organizationName\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"organizationName\"]")).sendKeys("");

    }
    //EnterValidContactNumber
    public static void enterValidContactNumber() {
        //Enter Valid Contact Number
        driver.findElement(By.xpath("//input[@formcontrolname=\"contactNumber\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"contactNumber\"]")).sendKeys("0123456789");
    }


    //Empty Contact Number
    public static void keepEmptyContactNumber() throws InterruptedException {
        //Enter Valid Contact Number
        driver.findElement(By.xpath("//input[@formcontrolname=\"contactNumber\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"contactNumber\"]")).sendKeys("");
        Thread.sleep(2000);
    }

    //Click Done Button
    public static void enterDoneButtonInExternalUser() throws InterruptedException {
        //Click Done Button
        driver.findElement(By.xpath("//span[text()=\"Done\"]")).click();
        Thread.sleep(7000);
    }


}
