package DesignPatterns.Structural.Decorator;

public class BoldDecorator extends  TextDecorator{
    public BoldDecorator(TextView textView) {
        super(textView);
    }

    @Override
    public void render() {
        System.out.print("<b>");
        textView.render();
        System.out.print("</b>");
    }
}
