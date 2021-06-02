public class Customer {
        private String firstName;
        private String lastName;
        private Email email;
        private PhoneNumber phoneNumber;
        private ShippingAddress shippingAddress;
        private BillingAddress billingAddress;
        private boolean isRewardsMember;

        public Customer(String firstName, String lastName, Email email, PhoneNumber phoneNumber, ShippingAddress shippingAddress, BillingAddress billingAddress, boolean isRewardsMember) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.email = email;
                this.phoneNumber = phoneNumber;
                this.shippingAddress = shippingAddress;
                this.billingAddress = billingAddress;
                this.isRewardsMember = isRewardsMember;
                System.out.println("----------------------------");
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Rewards Member: " + isRewardsMember);

        }

        public String getFirstName() {
                return firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public Email getEmail() {
                return email;
        }

        public PhoneNumber getPhoneNumber() {
                return phoneNumber;
        }

        public ShippingAddress getShippingAddress() {
                return shippingAddress;
        }

        public BillingAddress getBillingAddress() {
                return billingAddress;
        }

        public boolean isRewardsMember() {
                return isRewardsMember;
        }
}
