package Products;

public class Tc_AddProductWithoutEndWeightAndCategoryAsPork extends ProductsSteps {
    public static void main(String[] args) throws InterruptedException {
        Tc_addProductWithoutEndWeightAndCategoryAsPork();
    }

    private static void Tc_addProductWithoutEndWeightAndCategoryAsPork() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsPork();
        enterProductName();
        selectThumbnailImage();
        selectDisplayImage();
        enterStartingWeightRange();
        enterNonOrganicPrices();
        enterOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
