package pl.urbanlab.patterns.behavioral.memento;

/**
 * Created by Andrzej on 2017-06-21.
 */
public class MementoClient {

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
        game.shoot();
        game.stats("Before save");
        game.save();
        game.getHurt();
        game.shoot();
        game.die();
        game.stats("After death");
        game.restore();
        game.stats("After restore");
    }
}
