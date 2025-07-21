package DesignPatterns.Structural.Composite;

public class File implements  FileSystem{
    private String name;
    private int size;

    public File(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void delete() {
        System.out.println("Deleting file: " + this.name);
    }

    @Override
    public void printDetails(String indent) {
        System.out.println(indent + "- " + this.name + " (" + this.size + " bytes)");
    }
}
