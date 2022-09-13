package Products;

public class Tc_AddProductWithoutProductCategory extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutProductCategory();
    }

    private static void addProductWithoutProductCategory() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        enterProductName();
        selectThumbnailImage();
        selectDisplayImage();
        enterStartingWeightRange();
        enterEndWeightRange();
        enterNonOrganicPrices();
        enterOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
