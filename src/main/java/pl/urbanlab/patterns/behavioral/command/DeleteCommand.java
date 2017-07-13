package pl.urbanlab.patterns.behavioral.command;

import java.util.List;
import java.util.Optional;

/**
 * Created by andrzej on 13.07.17.
 */
public class DeleteCommand implements ActionCommand {
    private final String deleted;
    private final List<String> list;
    private final int index;
    private ActionCommand undeleteCommand;

    public DeleteCommand(int index, List<String> names) {
        this.index = index;
        this.deleted = names.get(index);
        this.list = names;

        undeleteCommand = new UndoDeleteCommand(deleted, index,  list);
    }

    @Override
    public Optional<ActionCommand> execute() {
        list.remove(deleted);
        return Optional.of(undeleteCommand);
    }

}
