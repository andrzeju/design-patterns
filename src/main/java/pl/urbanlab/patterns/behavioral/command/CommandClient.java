package pl.urbanlab.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by andrzej on 13.07.17.
 */
public class CommandClient {

    public static void main(String[] args) {
        List<String> names = new ArrayList(Arrays.asList("John", "Lucy", "Robert", "Jessica", "Sara"));

        System.out.println(names.toString());

        ActionCommand deleteCommand = new DeleteCommand(1, names);
        Optional<ActionCommand> undo = deleteCommand.execute();

        System.out.println(names.toString());

        if (undo.isPresent()) {
            undo.get().execute();
            System.out.println(names.toString());
        }
    }
}
