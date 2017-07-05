package pl.urbanlab.patterns.behavioral.chain.healthcare;

import pl.urbanlab.patterns.behavioral.chain.Person;
import pl.urbanlab.patterns.behavioral.chain.PersonCondition;

/**
 * Created by andrzej on 05.07.17.
 */
public abstract class HealthServiceChainMember {

    public HealthServiceChainMember(PersonCondition knownCondition) {
        this.knownCondition = knownCondition;
    }

    private HealthServiceChainMember nextMember;
    private PersonCondition knownCondition;

    protected abstract String process();

    public void setNext(HealthServiceChainMember member) {
        nextMember = member;
    };

    public void see(Person person) {
        if (person.getCondition().equals(knownCondition)) {
            System.out.println(this.process());
        } else if (nextMember != null){
            nextMember.see(person);
        } else {
            System.out.println("Condition unknown");
        }
    }
}
