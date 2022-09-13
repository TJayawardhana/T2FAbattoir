package Products;

public class Tc_EnterStartingWeightAndAddProduct extends ProductsSteps {
    public static void main(String[] args) throws InterruptedException {
        enterStartingWeightAndAddProduct();
    }

    private static void enterStartingWeightAndAddProduct() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        enterStartingWeightRange();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
