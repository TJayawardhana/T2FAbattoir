package Products;

public class Tc_AddMinusStartingWeightValue extends ProductsSteps {
    public static void main(String[] args) throws InterruptedException {
        addMinusStartingWeightValue();
    }

    private static void addMinusStartingWeightValue() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsLamb();
        enterProductName();
        selectThumbnailImage();
        selectDisplayImage();
        enterMinusValueForStartWeight();
        enterEndWeightRange();
        enterNonOrganicPrices();;
        enterOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();
    }


}
