package Products;

public class Tc_SelectProductAsGoat extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        selectProductCategoryAsGoat();
    }

    private static void selectProductCategoryAsGoat() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
//        clickOnProductCategory();
        selectProductAsGoat();
        signOut();
        reportEnd();
    }
}
