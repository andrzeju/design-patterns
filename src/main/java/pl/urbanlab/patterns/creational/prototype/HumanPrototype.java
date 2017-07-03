package pl.urbanlab.patterns.creational.prototype;

/**
 * Created by andrzej on 26.06.17.
 */
public interface HumanPrototype extends Cloneable {
    void setName(String name);
    void showInfo();
}
