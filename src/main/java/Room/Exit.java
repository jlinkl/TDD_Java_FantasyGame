package Room;


public enum Exit {
    NORTH(1),
    SOUTH(2),
    WEST(3),
    EAST(4);

    private int value;

    Exit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
