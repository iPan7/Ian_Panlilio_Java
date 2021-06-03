public class Address {
    private String billingStreet1;
    private String billingStreet2;
    private String billingCity;
    private String billingState;
    private int billingZip;
    private String shippingStreet1;
    private String shippingStreet2;
    private String shippingCity;
    private String shippingState;
    private int shippingZip;

    public Address(String billingStreet1, String billingStreet2, String billingCity, String billingState, int billingZip, String shippingStreet1, String shippingStreet2, String shippingCity, String shippingState, int shippingZip) {
        this.billingStreet1 = billingStreet1;
        this.billingStreet2 = billingStreet2;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.shippingStreet1 = shippingStreet1;
        this.shippingStreet2 = shippingStreet2;
        this.shippingCity = shippingCity;
        this.shippingState = shippingState;
        this.shippingZip = shippingZip;
        System.out.println("----------------------------");
        System.out.println("Billing Address");
        System.out.println("Street 1: " + billingStreet1);
        System.out.println("Street 2: " + billingStreet2);
        System.out.println("City: " + billingCity);
        System.out.println("State: " + billingState);
        System.out.println("Zip: " + billingZip);
        System.out.println("----------------------------");
        System.out.println("Shipping Address");
        System.out.println("Street 1: " + shippingStreet1);
        System.out.println("Street 2: " + shippingStreet2);
        System.out.println("City: " + shippingCity);
        System.out.println("State: " + shippingState);
        System.out.println("Zip: " + shippingZip);
    }

    public String getBillingStreet1() {
        return billingStreet1;
    }

    public String getBillingStreet2() {
        return billingStreet2;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public int getBillingZip() {
        return billingZip;
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
