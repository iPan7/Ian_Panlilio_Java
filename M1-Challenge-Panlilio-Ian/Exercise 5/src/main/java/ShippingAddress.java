public class ShippingAddress {

    private String shippingStreet1;
    private String shippingStreet2;
    private String shippingCity;
    private String shippingState;
    private int shippingZip;

    public ShippingAddress(String shippingStreet1, String shippingStreet2, String shippingCity, String shippingState, int shippingZip) {
        this.shippingStreet1 = shippingStreet1;
        this.shippingStreet2 = shippingStreet2;
        this.shippingCity = shippingCity;
        this.shippingState = shippingState;
        this.shippingZip = shippingZip;
        System.out.println("----------------------------");
        System.out.println("This is the Customer's Shipping Address");
        System.out.println("Street 1: " + shippingStreet1);
        System.out.println("Street 2: " + shippingStreet2);
        System.out.println("City: " + shippingCity);
        System.out.println("State: " + shippingState);
        System.out.println("Zip: " + shippingZip);
    }

    public String getShippingStreet1() {
        return shippingStreet1;
    }

    public String getShippingStreet2() {
        return shippingStreet2;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public int getShippingZip() {
        return shippingZip;
    }
}
