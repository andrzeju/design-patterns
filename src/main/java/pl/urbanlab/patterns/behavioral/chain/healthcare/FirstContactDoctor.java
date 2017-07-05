package pl.urbanlab.patterns.behavioral.chain.healthcare;

import pl.urbanlab.patterns.behavioral.chain.PersonCondition;

/**
 * Created by andrzej on 05.07.17.
 */
public class FirstContactDoctor extends HealthServiceChainMember {
    public FirstContactDoctor(PersonCondition condition) {
        super(condition);
    }

    @Override
    protected String process() {
        return "Flu healed";
    }
}
