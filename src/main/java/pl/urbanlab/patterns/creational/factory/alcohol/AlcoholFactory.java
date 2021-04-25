package pl.urbanlab.patterns.creational.factory.alcohol;

/**
 * Created by Andrzej on 2017-06-28.
 */
public class AlcoholFactory {
    public static Alcohol create(String type) {
        Alcohol alcohol;
        if (type.equals("light")) {
            alcohol = new ConcreteAlcohol("Pilsner", "4%");
        } else {
            alcohol = new ConcreteAlcohol("Belvedere", "40%");
        }
        return alcohol;
    }
}
