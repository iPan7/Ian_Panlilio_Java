public class Customer {
        private Profile profile;
        private Email email;
        private PhoneNumber phoneNumber;
        private Address address;

        public Customer(Profile profile, Email email, PhoneNumber phoneNumber,  Address address) {
                this.profile = profile;
                this.email = email;
                this.phoneNumber = phoneNumber;
                this.address = address;
        }

        public Profile getProfile() {
                return profile;
        }

        public Email getEmail() {
                return email;
        }

        public PhoneNumber getPhoneNumber() {
                return phoneNumber;
        }

        public Address getShippingAddress() {
                return address;
        }

        public Address getBillingAddress() {
                return address;
        }

}
