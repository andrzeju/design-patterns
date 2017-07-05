package pl.urbanlab.patterns.behavioral.chain;

import pl.urbanlab.patterns.behavioral.chain.healthcare.FirstContactDoctor;
import pl.urbanlab.patterns.behavioral.chain.healthcare.HealthServiceChainMember;
import pl.urbanlab.patterns.behavioral.chain.healthcare.Oncologist;
import pl.urbanlab.patterns.behavioral.chain.healthcare.Undertaker;

/**
 * Created by andrzej on 04.07.17.
 */
public class ChainOfResponsibilityClient {
    public static void main(String[] args) {
        Person sickPerson = new Person(PersonCondition.FLU);
        Person seriouslySickPerson = new Person(PersonCondition.CANCER);
        Person deadPerson = new Person(PersonCondition.DEAD);

        HealthServiceChainMember firstContactDoctor = new FirstContactDoctor(PersonCondition.FLU);
        HealthServiceChainMember oncologist = new Oncologist(PersonCondition.CANCER);
        HealthServiceChainMember undertaker = new Undertaker(PersonCondition.DEAD);

        firstContactDoctor.setNext(oncologist);
        oncologist.setNext(undertaker);

        System.out.println("First visit:");
        firstContactDoctor.see(sickPerson);
        System.out.println("Second visit:");
        firstContactDoctor.see(seriouslySickPerson);
        System.out.println("Third visit:");
        firstContactDoctor.see(deadPerson);
    }
}
