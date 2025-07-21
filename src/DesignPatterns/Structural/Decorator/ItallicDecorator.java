package DesignPatterns.Structural.Decorator;

public class ItallicDecorator extends TextDecorator{

    public ItallicDecorator(TextView textView) {
        super(textView);
        this.textView = textView;
    }
    @Override
    public void render() {
        System.out.print("<i>");
        textView.render();
        System.out.print("</i>");
    }
}
