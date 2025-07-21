package DesignPatterns.Structural.Decorator;

public class PlainTextView implements  TextView{
    private  String text;

    public PlainTextView(String text) {
        this.text = text;
    }
    @Override
    public void render() {
        System.out.println("Rendering plain text: " + text);
    }
}
