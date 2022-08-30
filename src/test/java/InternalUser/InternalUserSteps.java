package InternalUser;

import ExternalUser.ExternalUserSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class InternalUserSteps extends ExternalUserSteps {

    //Click on Internal User tab
    public static void clickOnInternalUserTab() throws InterruptedException {
        //Click on Internal User tab
        driver.findElement(By.xpath("(//span[@class=\"item-name lvl1\"])[1]")).click();
        Thread.sleep(7000);
    }
    //Select User Type
    public static void selectUserTypeRoleAbattoirManager(){
        //Select User Type
        // Create object of the Select class
        Select usertype = new Select(driver.findElement(By.xpath("//select[@id=\"type\"]")));
        // Select the option by index
        usertype.selectByValue("ROLE_ABATTOIR_MANAGER");
    }
}
