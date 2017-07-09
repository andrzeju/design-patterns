package pl.urbanlab.patterns.behavioral.template;

/**
 * Created by andrzej on 09.07.17.
 */
public class TemplateClient {

    public static void main(String[] args) {
        LoggedLoopExecutor loopExecutor = new LoggedLoopExecutor();
        loopExecutor.run();
    }
}


