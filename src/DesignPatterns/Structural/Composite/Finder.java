package DesignPatterns.Structural.Composite;

import javax.print.Doc;

public class Finder {
    public static void main(String[] args) {
        FileSystem file1  = new File(10, "file1.txt");
        FileSystem file2 = new File(20, "file2.txt");
        FileSystem file3 = new File(30, "file3.txt");

        Folder Documents = new Folder("Documents");
        Folder Pictures = new Folder("Pictures");

        Documents.addItem(file1);
        Documents.addItem(Pictures);
        Pictures.addItem(file2);
        Documents.addItem(file3);

        Documents.printDetails("");

        Documents.getSize();
        Pictures.getSize();
        file3.delete();
        Pictures.delete();
    }

}
