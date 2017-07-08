package pl.urbanlab.patterns.structural.composite;

import java.util.ArrayList;

/**
 * Created by andrzej on 08.07.17.
 */
public class Directory implements FileSystemNode {

    private final String name;
    private java.util.List<FileSystemNode> contentNodes = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemNode node) {
        contentNodes.add(node);
    }

    @Override
    public void showContent() {
        System.out.println(getName());
        for (FileSystemNode node : contentNodes) {
            System.out.print("  - ");
            node.showContent();
        }
    }

    @Override
    public String getName() {
        return name.toUpperCase();
    }
}
