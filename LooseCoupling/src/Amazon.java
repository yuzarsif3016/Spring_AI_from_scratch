public class Amazon
{

    public Amazon(IDelivery delivery) {
        this.delivery = delivery;
    }

    private IDelivery delivery;

    public IDelivery getDelivery() {
        return delivery;
    }

    public void setDelivery(IDelivery delivery) {
        this.delivery = delivery;
    }

    public String orderInterface(double amt){

        return delivery.ProductOrder(amt);
    }
}
