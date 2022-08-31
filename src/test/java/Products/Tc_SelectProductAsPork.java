package Products;

public class Tc_SelectProductAsPork extends ProductsSteps {
    public static void main(String[] args) throws InterruptedException {
        selectProductCategoryAsPork();
    }

    private static void selectProductCategoryAsPork() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
//        clickOnProductCategory();
        selectProductAsPork();
        signOut();
        reportEnd();
    }
}
