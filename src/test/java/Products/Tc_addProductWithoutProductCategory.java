package Products;

public class Tc_addProductWithoutProductCategory extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutProductCategory();
    }

    private static void addProductWithoutProductCategory() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        enterProductName();
        enterStartingWeightRange();
        clickDoneButton();
        signOut();
    }
}
