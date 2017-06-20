package pl.urbanlab.patterns.structural.facade;

/**
 * Created by andrzej on 20.06.17.
 */
public class FacadeClient {

    public static void main(String[] args) {
        EngineFacade engine = new EngineFacade();
        engine.run();
    }
}
