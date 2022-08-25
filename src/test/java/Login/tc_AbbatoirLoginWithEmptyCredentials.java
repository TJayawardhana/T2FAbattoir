package Login;


import Report.Report;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;

import static OpenBrowser.OpenWeb.driver;
import static OpenBrowser.OpenWeb.openBrowser;

public class tc_AbbatoirLoginWithEmptyCredentials extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        keepCredentialsEmpty();
/*
        // Open Browser
        */
        /*System.setProperty("webdriver.chrome.driver","D:\\T2FAbattoir\\driver\\chromedriver.exe");*//*

        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


        try {
            // Open URL
            driver.get("https://qa-portal.trade2farm.ie/login");
            report.test.log(LogStatus.PASS,"Successfully Navigated");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Cannot load URL");
        };

        // Maximise the Browser
        driver.manage().window().maximize();
*/
    }

    public static void keepCredentialsEmpty() throws InterruptedException {
//        Report report = new Report();
        report.createReport("Login.tc_AbbatoirLoginWithEmptyCredentials");
      /*  try {
            // Keep Empty Username or Email
            *//*driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("");*//*
            keepBlankEmail();
            report.test.log(LogStatus.PASS, "Empty User Name Field");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Displaying User Name");
        }*/
        keepBlankEmail();

        keepBlankPassword();

        /*try {
            //Keep Empty Password
            *//*driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("");*//*
            keepBlankPassword();
            report.test.log(LogStatus.PASS, "Empty Password Field");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Displaying Password");
        }*/
        clickSignIn();

        /*try {
            //Click on SignIn Button
//            driver.findElement(By.xpath("//button[@id=\"signinButton\"]")).click();
            clickSignIn();
            report.test.log(LogStatus.PASS, "Clicked Button Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Button is not Clicked");
        }*/
//        Thread.sleep(7000);
        clickUserDropdown();

        /*try {
            // Click on User Drop Down
//            driver.findElement(By.id("userDropdown")).click();
            clickUserDropdown();
            report.test.log(LogStatus.PASS, "Clicked User DropDown Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "User DropDown Icon is not Clicked");
        }*/
        clickSignOut();

//        Thread.sleep(5000);
        /*try {
            // Click on Sign Out
//            driver.findElement(By.id("signoutButton")).click();
            clickSignOut();
            report.test.log(LogStatus.PASS, "Clicked SignOut Button Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "SignOut Button is not Clicked");
        }*/
//        Thread.sleep(5000);
        closeDrive();
       /* try {
            // Close Drive
            driver.quit();
            report.test.log(LogStatus.PASS, "Drive Quit Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Drive Quit Unsuccessfully");
        }*/
        reportEnd();

    }
}


