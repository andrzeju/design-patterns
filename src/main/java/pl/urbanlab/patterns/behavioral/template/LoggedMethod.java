package pl.urbanlab.patterns.behavioral.template;

import java.util.Date;

/**
 * Created by andrzej on 09.07.17.
 */
public abstract class LoggedMethod {

    private Date date;

    private void startTime() {
        date = new Date();
        System.out.println("Start execution");
    }

    protected abstract void execute();

    public void run() {
        startTime();
        execute();
        showTime();
    }

    private void showTime() {
        System.out.println("Execution time was: " + (new Date().getTime() - date.getTime()));
    }
}
