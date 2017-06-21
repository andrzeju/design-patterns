package pl.urbanlab.patterns.behavioral.memento;

/**
 * Created by Andrzej on 2017-06-21.
 */
public class Game {

    private GameSave save;

    private int health = 100;
    private int ammo = 10;

    public void save() {
        save = new GameSave(this.health, this.ammo);
    }

    public void start() {
        health = 100;
        ammo = 10;
    }

    public void shoot() {
        ammo -= 1;
    }

    public void getHurt() {
        health -= 10;
    }

    public void die() {
        health = 0;
    }

    public void restore() {
        health = save.getHealth();
        ammo = save.getAmmmo();
    }

    public void stats(String label) {
        System.out.println(label + " - Health: " + health + ", ammo: " + ammo);
    }
}
