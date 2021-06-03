public class Profile {
    private String firstName;
    private String lastName;
    private boolean isRewardsMember;

    public Profile(String firstName, String lastName, boolean isRewardsMember) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isRewardsMember = isRewardsMember;
        System.out.println("----------------------------");
        System.out.println("First Name:" + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Rewards Member: " + isRewardsMember);

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isRewardsMember() {
        return isRewardsMember;
    }
}
