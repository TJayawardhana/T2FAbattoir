package Order;

public class Tc_PlaceANewOrder extends OrderSteps {
    public static void main(String[] args) throws InterruptedException {
        placeANewOrder();
    }

    private static void placeANewOrder() throws InterruptedException {
        openBrowser();
        Thread.sleep(5000);
        login();
        clickOrderTab();
        clickOnCreateNewAOrder();
        selectCategory();
        selectProductOrderAdding();
        selectPreferredWeightRangeInOrderAdd();
        selectPreferredAvailableOptionInOrderAdd();
        selectaDateInAddingOrder();

        addQuantity();
        clickSaveButtonOrderAdd();

        searchAUser();
        clickSelectUserButton();

    }
}
