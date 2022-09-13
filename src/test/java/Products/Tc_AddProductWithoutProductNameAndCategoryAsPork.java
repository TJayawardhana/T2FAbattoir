package Products;

public class Tc_AddProductWithoutProductNameAndCategoryAsPork extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutProductNameAndCategoryAsPork();
    }

    private static void addProductWithoutProductNameAndCategoryAsPork() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsPork();
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
