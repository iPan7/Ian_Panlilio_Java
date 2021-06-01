public class App {
    public static void main(String[] args) {
        Constable newChar1 = new Constable("newChar1",75,100,75,10,1, "Active");
        System.out.println(newChar1.attack());
        Farmer newChar2 = new Farmer("newChar2", 75, 100, 75, 10, 1);
        System.out.println(newChar2.heal());
        Warrior newChar3 = new Warrior("newChar3", 75, 100, 100, 50, 10, 100);
        System.out.println(newChar2);
        System.out.println(newChar3.decreaseShieldStrength());
        System.out.println(newChar1.arrest());
    }
}
