package Order;

import InternalUser.InternalUserSteps;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.testng.AssertJUnit.assertTrue;

public class OrderSteps extends InternalUserSteps {
    public static void clickOrderTab() throws InterruptedException {
        try {
            // Click on Order Tab
            driver.findElement(By.xpath("(//div[@class='nav-item-hold ng-star-inserted'])[3]")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked Order Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Order Tab is not Clickable");
        }

        Thread.sleep(8000);
    }
    public static void verifyOrderPageHeader() throws InterruptedException {
        try {
            // Verify Order Page Header
            assertTrue(driver.getTitle().contains("Orders"));
            report.test.log(LogStatus.PASS, "Successfully Navigated to the Order Page");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Order Page is not Loading");
        }
        Thread.sleep(8000);
    }
    public static void clickOnAOrder() throws InterruptedException {
        try {
            // Click on A Order
            driver.findElement(By.xpath("(//div[@class='t_date'])[1]")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked On A Order Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Order is not Clickable");
        }

        Thread.sleep(8000);

    }
    public static void clickOnCreateNewAOrder() throws InterruptedException {
        try {
            // Click on Create A New Order
            driver.findElement(By.xpath("(//span[@class='item-name lvl1'])[2]")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked On Create A Order Tab");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Create New Order is not Clickable");
        }

        Thread.sleep(8000);

    }
    public static void searchAUser() throws InterruptedException {
        try {
            // Search A user
            driver.findElement(By.xpath("//input[@class='form-control search-input ng-pristine ng-invalid ng-touched']")).clear();
            driver.findElement(By.xpath("//input[@class='form-control search-input ng-pristine ng-invalid ng-touched']")).sendKeys("timalka@fh.technology");
            report.test.log(LogStatus.PASS, "Successfully Entered Search Customer");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"User Searched Unsuccessful");
        }
        Thread.sleep(1000);
    }
    public static void clickSelectUserButton() throws InterruptedException {
        try {
            // Click on Select User
            driver.findElement(By.xpath("//input[@class='form-control search-input ng-pristine ng-invalid ng-touched']")).clear();
            driver.findElement(By.xpath("//input[@class='form-control search-input ng-pristine ng-invalid ng-touched']")).sendKeys("timalka@fh.technology");
            report.test.log(LogStatus.PASS, "Successfully Click Select ");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"User Searched Unsuccessful");
        }
        Thread.sleep(1000);
    }
    public static void selectaDateInAddingOrder() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//input[@formcontrolname='expectedDeliveryDate']"));
            driver.findElement(By.xpath("//input[@formcontrolname='expectedDeliveryDate']")).sendKeys("09252024");
            report.test.log(LogStatus.PASS, "Successfully Click Select ");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"User Searched Unsuccessful");
        }
        Thread.sleep(1000);
    }
    public static void selectCategory() throws InterruptedException {
        try {
            // Click on Select User
            Select category = new Select(driver.findElement(By.id("category")));
            category.selectByValue("1: Object");
            report.test.log(LogStatus.PASS, "Successfully Click Select ");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"User Searched Unsuccessful");
        }
        Thread.sleep(1000);
    }
    public static void selectPreferredWeightRangeInOrderAdd() throws InterruptedException {
        try {
            // Click on Select User
            Select category = new Select(driver.findElement(By.id("weightRange")));
            category.selectByValue("1: Object");
            report.test.log(LogStatus.PASS, "Successfully Click Select ");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"User Searched Unsuccessful");
        }
        Thread.sleep(1000);
    }
    public static void selectPreferredAvailableOptionInOrderAdd() throws InterruptedException {
        try {
            // Click on Select User
            Select category = new Select(driver.findElement(By.id("availableOption")));
            category.selectByValue("9: Object");
            report.test.log(LogStatus.PASS, "Successfully Click Select ");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"User Searched Unsuccessful");
        }
        Thread.sleep(1000);
    }
    public static void selectProductOrderAdding() {
        try {
            // Click on Select User
            Select category = new Select(driver.findElement(By.id("product")));
            category.selectByValue("1: Object");
            report.test.log(LogStatus.PASS, "Successfully Click Select ");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"User Searched Unsuccessful");
        }
    }
    public static void addQuantity() {
        try {
            driver.findElement(By.xpath("//input[@formcontrolname='quantity']"));
            driver.findElement(By.xpath("//input[@formcontrolname='quantity']")).sendKeys("12");
            report.test.log(LogStatus.PASS, "Successfully Click Select ");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"User Searched Unsuccessful");
        }
    }
    public static void clickSaveButtonOrderAdd() {
        try {
            driver.findElement(By.xpath("//input[@class='btn btn-green btn-space ml-1']")).click();
            report.test.log(LogStatus.PASS, "Successfully Click Select ");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"User Searched Unsuccessful");
        }
    }



}
