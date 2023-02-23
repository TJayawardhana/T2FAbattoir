package Order;

public class Tc_PlaceANewOrder extends OrderSteps {
    public static void main(String[] args) throws InterruptedException {
        placeANewOrder();
    }

    private static void placeANewOrder() throws InterruptedException {


        openBrowser();
        report.createReport("Login.tc_Abattoir_PlaceANewOrder");
        login();
        ClickOnOrderTabNav();
        hoverOnOrderTabNav();
        clickOnCreateNewAOrder();
        searchAUser();
        clickSelectUserButton();
        selectCategory();
        selectProductOrderAdding();
        selectPreferredWeightRangeInOrderAdd();
        selectPreferredAvailableOptionInOrderAdd();
        selectADateInAddingOrder();
        addQuantity();
        clickSaveButtonOrderAdd();
        clickShippingMethodAsPickUpOrder();
        clickPlaceAnOrder();
        reportEnd();
    }
}
