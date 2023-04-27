package tempalte;

public abstract class TemplatePurchase {
    public final  void purchaseOrder () {
        getItemsFromCart ();
        calculatePricesWithDiscount () ;
        createReceipt ();
        payOrder ();
        notifyClient ();
    }

    protected abstract void getItemsFromCart();
    protected abstract void calculatePricesWithDiscount();
    protected abstract void createReceipt();
    protected abstract void payOrder();
    protected abstract void notifyClient();





}
