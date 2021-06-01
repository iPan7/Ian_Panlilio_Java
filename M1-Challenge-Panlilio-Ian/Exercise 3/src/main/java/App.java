public class App {
    public static void main(String[] args) {
        System.out.println("Below is the Ice Cream Shop Input");
        IceCreamShop iceCream1 = new IceCreamShop();
        System.out.println(iceCream1.iceCream());

        System.out.println("Below is the Ice Cream Factory Input");
        IceCreamFactory iceCream2 = new IceCreamFactory();
        System.out.println(iceCream2.composition());
        System.out.println(iceCream2.price());
    }
}
