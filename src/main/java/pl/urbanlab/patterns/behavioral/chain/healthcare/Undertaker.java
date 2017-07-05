package pl.urbanlab.patterns.behavioral.chain.healthcare;

import pl.urbanlab.patterns.behavioral.chain.PersonCondition;

/**
 * Created by andrzej on 05.07.17.
 */
public class Undertaker extends HealthServiceChainMember {
    public Undertaker(PersonCondition condition) {
        super(condition);
    }

    @Override
    protected String process() {
        return "There's a nice coffin for ya.";
    }
}
