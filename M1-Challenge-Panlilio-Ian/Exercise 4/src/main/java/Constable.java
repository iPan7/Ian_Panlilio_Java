public class Constable extends Character {

    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private String jurisdiction;


    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, String jurisdiction) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.jurisdiction = jurisdiction;
    }

    //  - Abilities
    //    - arrest
    String arrest() {
        return "You arrested the target!";
    }    //    - heal
    public int heal() {
        health++;
        return health;
    }


}
