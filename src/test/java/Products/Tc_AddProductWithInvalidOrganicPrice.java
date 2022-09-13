package Products;

public class Tc_AddProductWithInvalidOrganicPrice extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addProductWithInvalidOrganicPrice();
    }

    private static void addProductWithInvalidOrganicPrice() throws InterruptedException {
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
        enterNonOrganicPrices();;
        enterInvalidOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }
}
