package Products;

public class Tc_EnterEndWeightAndAddProduct extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        enterEndWeightAndAddProduct();
    }

    private static void enterEndWeightAndAddProduct() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        enterEndWeightRange();
        clickDoneButton();
        signOut();
        reportEnd();

    }
}
