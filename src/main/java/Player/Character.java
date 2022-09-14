package Player;

public abstract class Character {
    protected String name;
    protected ArmourType armourType;

    public Character(String name, ArmourType armourType) {
        this.name = name;
        this.armourType = armourType;
    }

    public String getName() {
        return name;
    }

    public ArmourType getArmourType() {
        return armourType;
    }
}
