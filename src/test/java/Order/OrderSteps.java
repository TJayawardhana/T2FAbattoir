package Order;

import InternalUser.InternalUserSteps;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static org.testng.AssertJUnit.assertTrue;

public class OrderSteps extends InternalUserSteps {
    public static void ClickOnOrderTabNav() {
        try {
            // Click on Order Tab
//            driver.findElement(By.xpath("(//div[@class='nav-item-hold ng-star-inserted'])[3]")).click();
            driver.findElement(By.xpath("(//span[@class='nav-text'])[3]")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked Order Tab");
            implicitlyWaits();
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Order Tab is not Clickable");
        }
        implicitlyWaits();
    }
    public static void verifyOrderPageHeader()  {
        try {
            // Verify Order Page Header
            assertTrue(driver.getTitle().contains("Orders"));
            report.test.log(LogStatus.PASS, "Successfully Navigated to the Order Page");
            implicitlyWaits();
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Order Page is not Loading");
        }
        implicitlyWaits();
    }
    public static void clickOnOrderSubNav()  {
        try {
            // Click on A Order

//            driver.findElement(By.xpath("linkText=Orders")).click();

//            driver.findElement(By.xpath("(//div[@class='t_date'])[1]")).click();
            driver.findElement(By.xpath("//a[contains(.,'Orders')]")).click();
//            driver.findElement(By.xpath("//a[contains(@href, '/abattoir/orders')]")).click();
//            driver.findElement(By.xpath("//li/a")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked On A Order in Sub Nav");
            implicitlyWaits();
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Order is not Clickable in Sub nav");
        }


    }
    public static void hoverOnOrderTabNav(){
        try {

            // Click on All Customer
            Actions action = new Actions(driver);
            action.moveToElement(driver.findElement(By.xpath("(//div[@class='t_date'])[1]"))).perform();

            report.test.log(LogStatus.PASS, "Hover on Order tab in nav successfully");
        } catch (Exception e) {
            e.printStackTrace();
            report.test.log(LogStatus.FAIL, "Hover on Order tab in nav Unsuccessfully ");
        }
    }
    public static void clickOnCreateNewAOrder() {
        try {
            // Click on Create A New Order
            driver.findElement(By.xpath("//span[contains(.,'Create New Order')]")).click();
            driver.findElement(By.xpath("//li[2]/a/span")).click();
            driver.findElement(By.xpath("/html/body/app-root/app-abattoir-layout/div/div[2]/app-sidebar-large/div[2]/ul/li[2]/a/span")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked On Create A Order Tab");
            implicitlyWaits();
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Create New Order is not Clickable");
        }
        implicitlyWaits();
    }
    public static void searchAUser(){
        try {
            // Search A user
            driver.findElement(By.xpath("//input[@formcontrolname='user']")).clear();
            driver.findElement(By.xpath("//input[@formcontrolname='user']")).sendKeys("timalka@fh.technology");
            report.test.log(LogStatus.PASS, "Successfully Entered a Search Customer");
            implicitlyWaits();
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"User Searched entered Unsuccessful");
        }
        implicitlyWaits();
    }
    public static void clickSelectUserButton(){
        try {
            // Click on Select User
//            driver.findElement(By.xpath("//button[@class='btn btn-primary-outline w-100']")).click();
            driver.findElement(By.xpath("/html/body/app-root/app-abattoir-layout/div/div[3]/app-order-create/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div/div/div[5]/div/button\n")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked Select ");
            implicitlyWaits();
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"User Selected button clicked Unsuccessful");
        }

    }
    public static void selectADateInAddingOrder() {
        try {
            driver.findElement(By.xpath("//input[@formcontrolname='expectedDeliveryDate']"));
            driver.findElement(By.xpath("//input[@formcontrolname='expectedDeliveryDate']")).sendKeys("09252024");
            report.test.log(LogStatus.PASS, "Successfully Entered a Date ");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Date Entered Unsuccessful");
        }
        implicitlyWaits();
    }
    public static void selectCategory(){
        try {
            // Click on Select User
            Select category = new Select(driver.findElement(By.id("category")));
            category.selectByValue("1: Object");
            String printValue = category.getFirstSelectedOption().getText() ;
            System.out.println(printValue);
            report.test.log(LogStatus.PASS, "Successfully Category Selected As "+printValue);
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Category Selected Unsuccessful");
        }
        implicitlyWaits();
    }
    public static void selectPreferredWeightRangeInOrderAdd(){
        try {
            // Click on Select User
            Select weightRangeInNewOrder = new Select(driver.findElement(By.id("weightRange")));
            weightRangeInNewOrder.selectByValue("1: Object");
            String printValue = weightRangeInNewOrder.getFirstSelectedOption().getText() ;
            System.out.println(printValue);
            report.test.log(LogStatus.PASS, "Successfully Prefer Weight Selected As "+printValue);
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Prefer Weight Selected Unsuccessful");
        }
        implicitlyWaits();
    }
    public static void selectPreferredAvailableOptionInOrderAdd() {
        try {
            // Click on Select User
            Select preferAvailableOption = new Select(driver.findElement(By.id("availableOption")));
            preferAvailableOption.selectByValue("9: Object");
            String printValue = preferAvailableOption.getFirstSelectedOption().getText();
            System.out.println(printValue);
            report.test.log(LogStatus.PASS, "Successfully Selected A Available Option As "+printValue);
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Selected A Available Option Unsuccessful");
        }
        implicitlyWaits();
    }
    public static void selectProductOrderAdding() {
        try {
            // Click on Select User
            Select productInOrder = new Select(driver.findElement(By.id("product")));
            productInOrder.selectByValue("1: Object");
            String printValue = productInOrder.getFirstSelectedOption().getText() ;
            System.out.println(printValue);
            report.test.log(LogStatus.PASS, "Successfully Selected Product As "+printValue);
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Product Selected Unsuccessful");
        }
        implicitlyWaits();
    }
    public static void addQuantity() {
        try {
            driver.findElement(By.xpath("//input[@formcontrolname='quantity']"));
            driver.findElement(By.xpath("//input[@formcontrolname='quantity']")).sendKeys("12");
            report.test.log(LogStatus.PASS, "Successfully Added Quantity ");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Quantity Adding Unsuccessful");
        }
        implicitlyWaits();
    }
    public static void clickSaveButtonOrderAdd() {
        try {
            driver.findElement(By.xpath("(//button[@class='btn btn-green btn-space ml-1'])[2]")).click();
            report.test.log(LogStatus.PASS, "Successfully Click Save Button Adding Order Item ");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Click Save Button Adding Order Item Unsuccessful");
        }
        implicitlyWaits();
    }
    public static void clickShippingMethodAsPickUpOrder() {
        try {
            driver.findElement(By.id("flexRadioDefault1")).click();
            report.test.log(LogStatus.PASS, "Successfully Clicked I WILL PICK UP MY ORDER ");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Clicked I WILL PICK UP MY ORDER Unsuccessful");
        }
        implicitlyWaits();
    }
    public static void clickPlaceAnOrder() {
        try {
            driver.findElement(By.xpath("(//button[@class='btn btn-green btn-space ml-1'])[1]")).click();
            report.test.log(LogStatus.PASS, "Successfully Click Place Order Button ");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Place Order Button Unsuccessful");
        }
        implicitlyWaits();
    }
    public static void clickDoneButtonInPlaceNewOrder() {
        try {
            driver.findElement(By.xpath("//button[@class='btn btn-secondary ml-1 ng-star-inserted']")).click();
            report.test.log(LogStatus.PASS, "Successfully Click Done Button After Order place ");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Done Order Button Unsuccessful");
        }
        implicitlyWaits();
    }
    ///Existing Order
    public static void clickOnAOrder(){

        try {
            driver.findElement(By.xpath("(//td[@class='new_order'])[1]")).click();
            report.test.log(LogStatus.PASS, "Successfully Click On a Order ");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Order Clicked Unsuccessful");
        }
        implicitlyWaits();
    }

    //Order Update
    public static void OrderStatusUpdate(){

        try {
            driver.findElement(By.xpath("(//td[@class='new_order'])[1]")).click();
            report.test.log(LogStatus.PASS, "Successfully Click On a Order ");
        }catch (Exception e){
            e.printStackTrace();
            report.test.log(LogStatus.FAIL,"Order Clicked Unsuccessful");
        }
        implicitlyWaits();
    }

}
