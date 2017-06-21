package pl.urbanlab.patterns.behavioral.memento;

/**
 * Created by Andrzej on 2017-06-21.
 */
public class GameSave {

    private int health;
    private int ammmo;

    public GameSave(int health, int ammmo) {
        this.health = health;
        this.ammmo = ammmo;
    }

    public int getHealth() {
        return health;
    }

    public int getAmmmo() {
        return ammmo;
    }

}
