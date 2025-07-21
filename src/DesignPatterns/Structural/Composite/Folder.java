package DesignPatterns.Structural.Composite;

import java.util.List;

public class Folder implements FileSystem{
    private String name;
    private List<FileSystem> children;

    public Folder(String name) {
        this.name = name;
        this.children = new java.util.ArrayList<>();
    }
    @Override
    public int getSize() {
        int totalSize = 0;
        for(FileSystem child : children) {
            if(child != null) {
                totalSize +=  child.getSize();
            }
        }
        return totalSize;
    }

    public  void addItem(FileSystem item) {
        if(item != null) {
            children.add(item);
        }
    }

    @Override
    public void delete() {
        for(FileSystem item: children) {
            if(item != null) {
                item.delete();
            }
        }
        System.out.println("Deleting folder: " + this.name);
    }

    @Override
    public void printDetails(String indent) {
        System.out.println(indent + "+ " + this.name + "/");
        for(FileSystem child : children) {
            if(child != null) {
                child.printDetails(indent + "  ");
            }
        }
    }
}
