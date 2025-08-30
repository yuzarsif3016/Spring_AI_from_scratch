public class LaunchLoose {
    public static void main(String[] args) {
        Amazon obj = new Amazon(new BlueDart()); //target class
        obj.setDelivery(new FedEx()); //dependent object
        String res = obj.orderInterface(4999.00);
        System.out.println(res);
    }
}
