package pl.urbanlab.patterns.structural.decorator;

/**
 * Created by Andrzej on 2017-06-22.
 */
public class DecoratorClient {

    public static void main(String[] args) {
        Rifle rifle = new BasicRifle();
        System.out.println(rifle.getStats());

        Rifle silencedRifle = new SilencedRifle(rifle);
        System.out.println(silencedRifle.getStats());

        Rifle lightSilencedRifle = new PlasticRifle(silencedRifle);
        System.out.println(lightSilencedRifle.getStats());
    }
}
