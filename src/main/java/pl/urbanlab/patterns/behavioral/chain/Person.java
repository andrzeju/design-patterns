package pl.urbanlab.patterns.behavioral.chain;

/**
 * Created by andrzej on 05.07.17.
 */
public class Person {
    private final PersonCondition condition;

    public Person(PersonCondition personCondition) {
        this.condition = personCondition;
    }

    public PersonCondition getCondition() {
        return condition;
    }
}
