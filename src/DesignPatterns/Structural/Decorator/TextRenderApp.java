package DesignPatterns.Structural.Decorator;

public class TextRenderApp {
    public static void main(String[] args) {
        TextView plainText = new PlainTextView("Hello, World!");
        plainText.render();
        System.out.println();

        TextView boldText = new BoldDecorator(plainText);
        boldText.render();
        System.out.println();

        TextView italicText = new ItallicDecorator(plainText);
        italicText.render();
        System.out.println();

        TextView underlinedText = new UnderlineDecorator(plainText);
        underlinedText.render();
        System.out.println();

        // Bold and Italic
        TextView boldItalicText = new ItallicDecorator(boldText);
        boldItalicText.render();
    }
}
