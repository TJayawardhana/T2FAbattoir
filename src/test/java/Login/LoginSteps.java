package Login;

import OpenBrowser.OpenWeb;
import Report.Report;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;



public class LoginSteps extends OpenWeb {
    public static Report report = new Report();

    //TEST STEPS
    static void keepBlankEmail() throws InterruptedException {
        /*driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("");*/
        try {
            // Keep Empty Username or Email
            /*driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("");*/
//          keepBlankEmail();
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("");
            report.test.log(LogStatus.PASS, "Empty User Name Field");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Displaying User Name");
        }
        Thread.sleep(3000);
    }

    static void keepBlankPassword() throws InterruptedException {
        /*driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("");*/
        try {
            //Keep Empty Password
            /*driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("");*/
//             keepBlankPassword();
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("");
            report.test.log(LogStatus.PASS, "Empty Password Field");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Displaying Password");
        }
        Thread.sleep(3000);
    }

    static void enterInvalidPassword() throws InterruptedException {
        /*driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Hyperspace");*/
        try {
            //Enter Invalid Password
//            enterInvalidPassword();
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("Hyperspace");
            report.test.log(LogStatus.PASS, "Entered Wrong Password");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Entered Correct Password");
        }
        Thread.sleep(5000);
    }

    static void enterInvalidEmail() throws InterruptedException {
        /*driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("abattoir@gmail.com");*/
        try {
            // Enter Invalid Username
//            enterInvalidEmail();
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("abattoir@gmail.com");
            report.test.log(LogStatus.PASS, "Entered Wrong Username");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Entered Correct Username");
        }
        Thread.sleep(5000);
    }


     /*static void openUrl() {
        //Open Url
        driver.get("https://qa-portal.trade2farm.ie/login");
    }*/

    static void enterValidEmail() throws InterruptedException {
        //Enter valid Email
        ////xPath - input[@id="email"]
        //input[@class="form-control form-control-rounded ng-tns-c188-0 ng-pristine ng-invalid ng-touched"]
        /*driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("abattoiradmin@gmail.com");*/
        try {
            // Enter Valid Username or Email
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("abattoiradmin@gmail.com");
            report.test.log(LogStatus.PASS, "Entered Correct Username");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Entered Wrong Username");
        }
        Thread.sleep(5000);
    }

    static void enterValidPassword() throws InterruptedException {
        //Enter valid password
        /*driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Hyperspace123");*/
        try {
            //Enter Valid Password
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("Hyperspace123");
//            enterValidPassword();
            report.test.log(LogStatus.PASS, "Entered Correct Password");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Entered Wrong Password");
        }
        Thread.sleep(5000);
    }

    static void enterWrongEmailFormat() throws InterruptedException {
        try {
            // Enter Wrong Format Username
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("abattoiradmin#gmail.com");
            report.test.log(LogStatus.PASS, "Wrong User Name Format");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Correct User Name Format");
        }
        Thread.sleep(5000);
    }

    //Can't be
    static void enterWrongPasswordFormat() throws InterruptedException {
        try {
            //Enter Valid Password
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("Hyper");
            report.test.log(LogStatus.PASS, "Wrong Password Format");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Correct Password Format");
        }
        Thread.sleep(5000);
    }


    static void clickLogin() {
        //Click on Login
        driver.findElement(By.id("signinButton")).click();
    }

    static void clickSignIn() throws InterruptedException {
//        driver.findElement(By.xpath("//button[@id=\"signinButton\"]")).click();
        try {
            //Click on SignIn Button
            driver.findElement(By.xpath("//button[@id=\"signinButton\"]")).click();

            report.test.log(LogStatus.PASS, "Clicked Button Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Button is not Clicked");
        }
        Thread.sleep(5000);
    }

    static void clickSignOut() throws InterruptedException {
//        driver.findElement(By.id("signoutButton")).click();
        try {
            // Click on Sign Out
            driver.findElement(By.id("signoutButton")).click();
//            driver.findElement(By.xpath("//img[@class='dropdown-toggle ng-star-inserted']")).click();

            report.test.log(LogStatus.PASS, "Clicked SignOut Button Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "SignOut Button is not Clicked");
        }
        Thread.sleep(5000);
    }

    static void clickUserDropdown() throws InterruptedException {
//        driver.findElement(By.id("userDropdown")).click();
        try {
            // Click on User Drop Down
            driver.findElement(By.id("userDropdown")).click();
//            clickUserDropdown();
            report.test.log(LogStatus.PASS, "Clicked User DropDown Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "User DropDown Icon is not Clicked");
        }
        Thread.sleep(5000);
    }

    public static void closeDrive() throws InterruptedException {
        try {
            // Close Drive
            driver.quit();
            report.test.log(LogStatus.PASS, "Drive Quit Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Drive Quit Unsuccessfully");
        }
        Thread.sleep(5000);
    }

    public static void login() throws InterruptedException {
        enterValidEmail();
        enterValidPassword();
        clickSignIn();
        Thread.sleep(5000);

    }

    public static void signOut() throws InterruptedException {
        clickUserDropdown();
        clickSignOut();
        closeDrive();
    }
    public static void reportEnd(){
        report.endReporting();
    }

}
