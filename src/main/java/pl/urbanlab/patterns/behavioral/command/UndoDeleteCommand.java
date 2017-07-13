package pl.urbanlab.patterns.behavioral.command;

import java.util.List;

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
    public void execute() {
        list.add(index, deleted);
    }
}
