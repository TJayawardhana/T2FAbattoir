package Products;

public class Tc_AddEndValueBiggerThanStartingValue extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
                addEndValueBiggerThanStartingValue();

    }

    private static void addEndValueBiggerThanStartingValue() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        selectProductAsLamb();
        enterProductName();
        selectThumbnailImage();
        selectDisplayImage();
        enterEndWeightBiggerThanStartWeight();
        enterNonOrganicPrices();;
        enterOrganicPrices();
        clickDoneButton();
        signOut();
        reportEnd();

    }

}
