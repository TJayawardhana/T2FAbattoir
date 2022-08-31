package Products;

public class Tc_VerifyAddNewProductPage extends ProductsSteps{
    public static void main(String[] args) throws InterruptedException {
        addNewProductClick();
    }

    private static void addNewProductClick() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
        clickCreateNewTab();
        signOut();
        reportEnd();

    }
}
