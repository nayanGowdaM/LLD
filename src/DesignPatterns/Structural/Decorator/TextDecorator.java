package DesignPatterns.Structural.Decorator;

public abstract class TextDecorator implements  TextView{
    protected TextView textView;

    public TextDecorator(TextView textView) {
        this.textView = textView;
    }

    public abstract void render();
}
