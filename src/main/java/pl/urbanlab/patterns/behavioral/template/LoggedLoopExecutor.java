package pl.urbanlab.patterns.behavioral.template;

/**
 * Created by andrzej on 09.07.17.
 */
public class LoggedLoopExecutor extends LoggedMethod {

    @Override
    public void execute() {
        for (int i = 0; i < 10000; i++) {
            boolean even = Math.random() * 10000 % 2 == 0 ? true : false;
        }
    }
}
