package DesignPatterns.Structural.Decorator;

public class UnderlineDecorator extends  TextDecorator{

    public  UnderlineDecorator(TextView textView) {
        super(textView);
    }
    @Override
    public void render() {
        System.out.print("<u>");
        textView.render();
        System.out.print("</u>");
    }
}
