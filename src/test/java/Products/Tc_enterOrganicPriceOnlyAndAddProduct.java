package Products;

public class Tc_enterOrganicPriceOnlyAndAddProduct extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        enterOrganicPriceOnlyAndAddProduct();
    }

    private static void enterOrganicPriceOnlyAndAddProduct() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        enterOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
