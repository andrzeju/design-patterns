package pl.urbanlab.patterns.behavioral.chain.healthcare;

import pl.urbanlab.patterns.behavioral.chain.PersonCondition;

/**
 * Created by andrzej on 05.07.17.
 */
public class Oncologist extends HealthServiceChainMember {
    public Oncologist(PersonCondition condition) {
        super(condition);
    }

    @Override
    protected String process() {
        return "Cancer healed";
    }
}
