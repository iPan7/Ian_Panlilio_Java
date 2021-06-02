public class BillingAddress {
    private String billingStreet1;
    private String billingStreet2;
    private String billingCity;
    private String billingState;
    private int billingZip;

    public BillingAddress(String billingStreet1, String billingStreet2, String billingCity, String billingState, int billingZip) {
        this.billingStreet1 = billingStreet1;
        this.billingStreet2 = billingStreet2;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        System.out.println("----------------------------");
        System.out.println("This is the Customer's Billing Address");
        System.out.println("Street 1: " + billingStreet1);
        System.out.println("Street 2: " + billingStreet2);
        System.out.println("City: " + billingCity);
        System.out.println("State: " + billingState);
        System.out.println("Zip: " + billingZip);
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
}
