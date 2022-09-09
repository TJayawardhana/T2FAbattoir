package Products;

public class Tc_enterNonOrganicPriceOnlyAndAddProduct extends ProductsSteps {
    public static void main(String[] args) throws InterruptedException {
        enterNonOrganicPriceOnlyAndAddProduct();
    }

    private static void enterNonOrganicPriceOnlyAndAddProduct() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        enterNonOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
