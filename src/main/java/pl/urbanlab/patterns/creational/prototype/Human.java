package pl.urbanlab.patterns.creational;

/**
 * Created by andrzej on 26.06.17.
 */
public class Human implements HumanPrototype {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println(name + ": Age - " + age);
    }

    @Override
    protected Human clone() throws CloneNotSupportedException {
        return (Human) super.clone();
    }
}
