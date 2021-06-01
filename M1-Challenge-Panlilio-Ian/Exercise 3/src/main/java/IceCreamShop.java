import java.util.Scanner;

public class IceCreamShop {
    private int numberScoops;
    private String flavor;
    private String containerType;
    private double price;

    public String iceCream() {
        numberScoops = getNumberScoops();
        flavor = getFlavor();
        containerType = getContainerType();
        price = getPrice();
        return "The number of scoops is " + numberScoops + ", " + "the flavor is " + flavor + ", " + "the container type is a " + containerType + ", " + "and the price is " + "$" + price;
    }
    public int getNumberScoops() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of scoops you would like.");
        int numberScoops = Integer.parseInt(scanner.nextLine());
        return numberScoops;
    }
    public String getFlavor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a flavor.");
        String flavor = scanner.nextLine();;
        return flavor;
    };
    public String getContainerType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a container type.");
        String containerType = scanner.nextLine();
        return containerType;
    };
    public double getPrice() {
        double price = 2.54 * numberScoops;
        // $2.54 is the price per scoop I randomly decided upon.
        return price;
    };
}
