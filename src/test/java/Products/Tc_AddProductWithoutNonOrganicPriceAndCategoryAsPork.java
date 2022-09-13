package Products;

public class Tc_AddProductWithoutNonOrganicPriceAndCategoryAsPork extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutNonOrganicPriceAndCategoryAsPork();
    }

    private static void addProductWithoutNonOrganicPriceAndCategoryAsPork() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsPork();
        enterProductName();
        selectThumbnailImage();
        selectDisplayImage();
        enterStartingWeightRange();
        enterEndWeightRange();
        enterOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
