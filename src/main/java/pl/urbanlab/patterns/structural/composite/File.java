package pl.urbanlab.patterns.structural.composite;

import java.util.List;

/**
 * Created by andrzej on 08.07.17.
 */
public class File implements FileSystemNode {

    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showContent() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return name;
    }
}
