package Products;

public class Tc_AddProductWithInvalidEndWeightAndCategory extends ProductsSteps {
    public static void main(String[] args) throws InterruptedException {
        addProductWithInvalidEndWeightAndCategory();
    }

    private static void addProductWithInvalidEndWeightAndCategory() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsLamb();
        enterProductName();
        selectThumbnailImage();
        selectDisplayImage();
        enterStartingWeightRange();
        enterInvalidEndWeightRange();
        enterOrganicPrices();
        enterNonOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
