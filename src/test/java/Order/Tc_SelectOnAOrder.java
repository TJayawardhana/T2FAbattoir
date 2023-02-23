package Order;

public class Tc_SelectOnAOrder extends OrderSteps{
    public static void main(String[] args) throws InterruptedException {
        selectAOrder();
    }
    private static void selectAOrder() throws InterruptedException {
        openBrowser();
        login();
        ClickOnOrderTabNav();
        hoverOnOrderTabNav();
        clickOnOrderSubNav();
        clickOnAOrder();
        signOut();
        reportEnd();
        
    }
}
