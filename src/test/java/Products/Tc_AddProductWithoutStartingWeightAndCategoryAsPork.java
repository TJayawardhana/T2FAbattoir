package Products;

public class Tc_AddProductWithoutStartingWeightAndCategoryAsPork extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutStartingWeightAndCategoryAsPork();
    }

    private static void addProductWithoutStartingWeightAndCategoryAsPork() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsPork();
        enterProductName();
        selectThumbnailImage();
        selectDisplayImage();
        enterEndWeightRange();
        enterNonOrganicPrices();
        enterOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
