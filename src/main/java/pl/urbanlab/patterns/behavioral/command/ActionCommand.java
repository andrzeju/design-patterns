package pl.urbanlab.patterns.behavioral.command;

import java.util.Optional;

/**
 * Created by andrzej on 13.07.17.
 */
public interface ActionCommand {
    Optional<ActionCommand> execute();
}
