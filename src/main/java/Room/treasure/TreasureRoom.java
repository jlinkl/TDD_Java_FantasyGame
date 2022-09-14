package Room.treasure;

import Player.IPlayer;
import Room.treasure.treasures.Treasure;

import java.util.ArrayList;

public class TreasureRoom {

    private ArrayList<Treasure> treasures;

    public TreasureRoom() {
        this.treasures = new ArrayList<>();
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }


    public void addTreasure(Treasure treasure) {
        this.treasures.add(treasure);
    }

    public void addTreasureToPlayer(IPlayer player) {
        for (Treasure treasure: treasures) {
            player.addMoney(treasure);
        }
    }
}



