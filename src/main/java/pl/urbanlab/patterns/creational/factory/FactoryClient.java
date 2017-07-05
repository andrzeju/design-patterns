package pl.urbanlab.patterns.creational.factory;

/**
 * Created by Andrzej on 2017-06-28.
 */
public class FactoryClient {
    public static void main(String[] args) {
        Alcohol beer = AlcoholFactory.create("light");
        System.out.println(beer.getName());

        Alcohol vodka = AlcoholFactory.create("strong");

        System.out.println(vodka.getName());


    }
}
