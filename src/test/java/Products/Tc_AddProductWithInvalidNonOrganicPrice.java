package Products;

public class Tc_AddProductWithInvalidNonOrganicPrice extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithInvalidNonOrganicPrice();
    }

    private static void addProductWithInvalidNonOrganicPrice() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsLamb();
        enterProductName();
        selectThumbnailImage();
        selectDisplayImage();
        enterStartingWeightRange();
        enterEndWeightRange();
        enterInvalidNonOrganicPrices();;
        enterOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
