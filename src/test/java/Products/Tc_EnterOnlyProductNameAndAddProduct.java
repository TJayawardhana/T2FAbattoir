package Products;

public class Tc_EnterOnlyProductNameAndAddProduct extends ProductsSteps {
    public static void main(String[] args) throws InterruptedException {
        enterOnlyProductNameAndAddProduct();
    }

    private static void enterOnlyProductNameAndAddProduct() throws InterruptedException {
        openBrowser();
        login();
        mouseHoverOnProductIcon();
//        clickOnProductCategory();
        clickCreateNewTab();
        enterProductName();
        clickDoneButton();
        signOut();

    }
}
