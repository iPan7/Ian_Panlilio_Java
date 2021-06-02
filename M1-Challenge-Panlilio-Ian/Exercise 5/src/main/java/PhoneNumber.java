public class PhoneNumber {
    private String cellNumber;
    private String homeNumber;

    public PhoneNumber(String cellNumber, String homeNumber) {
        this.cellNumber = cellNumber;
        this.homeNumber = homeNumber;
        System.out.println("----------------------------");
        System.out.println("Cell Number: " + cellNumber);
        System.out.println("Home Number: " + homeNumber);
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String getHomeNumber() {
        return homeNumber;
    }
}
