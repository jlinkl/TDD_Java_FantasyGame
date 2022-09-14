package Player;

public abstract class Character {
    protected String name;
    protected ArmourType armourType;
    private int health;

    public Character(String name, ArmourType armourType, int health) {
        this.name = name;
        this.armourType = armourType;
        this.health = health;

    }

    public String getName() {
        return name;
    }

    public ArmourType getArmourType() {
        return armourType;
    }
    public void reduceHealth(int damageValue) {

    }
}
