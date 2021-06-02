public class App {
    public static void main(String[] args) {
        Email email1 = new Email("bob@email.com", "jimbob@email.com");
        PhoneNumber phone1 = new PhoneNumber("925-443-3264", "408-957-9507");
        ShippingAddress addressShip = new ShippingAddress("10 Bodin Circle", "No secondary Street", "Des Moines", "Iowa", 50047);
        BillingAddress addressBill = new BillingAddress("10 Bodin Circle", "No secondary Street", "Des Moines", "Iowa", 50047);
        Customer customer1 = new Customer("Bob", "Smith", email1 , phone1, addressShip , addressBill, true);
    }
}
