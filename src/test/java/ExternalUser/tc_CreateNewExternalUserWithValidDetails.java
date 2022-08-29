package ExternalUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class tc_CreateNewExternalUserWithValidDetails {

    public static void main(String[] args) throws InterruptedException {
        //Open Browser
        System.setProperty("webdriver.chrome.driver","D:\\T2FAbattoir\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maximize the Browser
        driver.manage().window().maximize();

        //Open URL
        driver.get("https://qa-portal.trade2farm.ie/");

        Thread.sleep(5000);

        //enter valid Email Address(User name)
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("abattoiradmin@gmail.com");

        Thread.sleep(5000);

        //Enter valid Password
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Hyperspace123");

        Thread.sleep(5000);

        //Click on Login Button
        driver.findElement(By.xpath("//button[@id=\"signinButton\"]")).click();
        Thread.sleep(5000);

        //Mouse hover on Users Icon
        Actions action = new Actions(driver);
        WebElement listingOptions = driver.findElement(By.xpath("(//span[@class=\"nav-text\"])[5]"));
        Thread.sleep(9000);
        action.moveToElement(listingOptions).perform();

        //Click on External User tab
        driver.findElement(By.xpath("//span[text()=\"External User\"]")).click();
        Thread.sleep(7000);


        //Click on Add New Button
        driver.findElement(By.xpath("//span[text()=\"Add New \"]")).click();
        Thread.sleep(7000);

        //Select User Type
        // Create object of the Select class
        Select usertype = new Select(driver.findElement(By.xpath("//select[@id=\"type\"]")));
        // Select the option by index
        usertype.selectByValue("ROLE_BUTCHER");

        //Empty First Name
        driver.findElement(By.xpath("//input[@formcontrolname=\"firstName\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"firstName\"]")).sendKeys("Timalka");

        //Enter Last Name
        driver.findElement(By.xpath("//input[@formcontrolname=\"lastName\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"lastName\"]")).sendKeys("Jayawardhana");

        //Enter Valid Contact Number
        driver.findElement(By.xpath("//input[@formcontrolname=\"contactNumber\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"contactNumber\"]")).sendKeys("0123456789");

        //Enter Valid Email
        driver.findElement(By.xpath("//input[@formcontrolname=\"email\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"email\"]")).sendKeys("timalka1@mailinator.com");

        //Enter Valid Organization Name
        driver.findElement(By.xpath("//input[@formcontrolname=\"organizationName\"]")).clear();
        driver.findElement(By.xpath("//input[@formcontrolname=\"organizationName\"]")).sendKeys("Firehouse Technology");

        Thread.sleep(10000);

        //Click Done Button
        driver.findElement(By.xpath("//span[text()='Done']")).click();
        Thread.sleep(7000);

        //Click Done Button On Overview
        driver.findElement(By.xpath("(//span[text()='Done'])[2]")).click();
        Thread.sleep(7000);

        // Click on User Drop Down
        driver.findElement(By.id("userDropdown")).click();

        Thread.sleep(5000);

        // Click on Sign Out
        driver.findElement(By.id("signoutButton")).click();

        driver.quit();
    }
}
