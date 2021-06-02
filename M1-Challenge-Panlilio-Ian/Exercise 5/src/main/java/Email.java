public class Email {
    private String primaryEmail;
    private String secondaryEmail;

    public Email(String primaryEmail, String secondaryEmail) {
        this.primaryEmail = primaryEmail;
        this.secondaryEmail = secondaryEmail;
        System.out.println("----------------------------");
        System.out.println("Primary Email: " + primaryEmail);
        System.out.println("Secondary Email: " + secondaryEmail);
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }
}
