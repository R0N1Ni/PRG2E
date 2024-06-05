package OOP.game;

public class Weapon {
    private final String name;
    private final int damage;
    private final int defense;



    public Weapon(String name, int damage, int defense) {
        this.name = name;
        this.damage = damage;
        this.defense = defense;

    }

    public int getDamage() {
        return damage;
    }

    public int getDefense() {
        return defense;
    }

    public String toString(){
        return name + " (" + damage + "/" + defense + ")";
    }
}
