package pl.urbanlab.patterns.behavioral.command;

import java.util.List;
import java.util.Optional;

/**
 * Created by andrzej on 13.07.17.
 */
public class UndoDeleteCommand implements ActionCommand {
    private final List<String> list;
    private final String deleted;
    private final int index;

    public UndoDeleteCommand(String deleted, int index, List<String> list) {
        this.deleted = deleted;
        this.list = list;
        this.index = index;
    }

    @Override
    public Optional<ActionCommand> execute() {
        list.add(index, deleted);
        return Optional.empty();
    }
}
