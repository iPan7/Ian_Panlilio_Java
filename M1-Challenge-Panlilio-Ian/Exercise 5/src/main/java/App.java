public class App {
    public static void main(String[] args) {
        Profile profile1 = new Profile("Bob", "Smith", true);
        Email email1 = new Email("bob@email.com", "jimbob@email.com");
        PhoneNumber phone1 = new PhoneNumber("925-443-3264", "408-957-9507");
        Address address1 = new Address("10 Bodin Circle", "No secondary Street", "Des Moines", "Iowa", 50047, "723 Altura Way", "No secondary Street", "Des Moines", "Iowa", 50047);
        Customer customer1 = new Customer(profile1, email1 , phone1, address1);
    }
}
