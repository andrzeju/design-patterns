package pl.urbanlab.patterns.creational;

/**
 * Created by andrzej on 26.06.17.
 */
public class PrototypeClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human adam = new Human("Adam", 0);
        String [] clones = {"Eve", "Kain", "Abel", "Abraham", "Rebeca", "Josef"};
        for (int i = 0; i < 6; i++) {
            HumanPrototype human = adam.clone();
            human.setName(clones[i]);
            human.showInfo();
        }
    }
}
