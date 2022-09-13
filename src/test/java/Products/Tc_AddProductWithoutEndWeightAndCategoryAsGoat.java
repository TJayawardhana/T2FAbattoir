package Products;

public class Tc_AddProductWithoutEndWeightAndCategoryAsGoat extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithoutEndWeightAndCategoryAsGoat();
    }

    private static void addProductWithoutEndWeightAndCategoryAsGoat() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsLamb();
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
