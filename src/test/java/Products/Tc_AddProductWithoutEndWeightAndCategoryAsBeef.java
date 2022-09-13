package Products;

public class Tc_AddProductWithoutEndWeightAndCategoryAsBeef extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutEndWeightAndCategoryAsBeef();
    }

    private static void addProductWithoutEndWeightAndCategoryAsBeef() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsBeef();
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
