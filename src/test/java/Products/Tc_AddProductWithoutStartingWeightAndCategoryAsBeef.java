package Products;

public class Tc_AddProductWithoutStartingWeightAndCategoryAsBeef extends ProductsSteps {
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutStartingWeightAndCategoryAsBeef();
    }

    private static void addProductWithoutStartingWeightAndCategoryAsBeef() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsBeef();
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
