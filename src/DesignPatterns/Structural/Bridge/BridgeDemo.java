package DesignPatterns.Structural.Bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5);
        Shape rectangle = new Rectangle(rasterRenderer, 10, 20);

        circle.draw(); // Output: Drawing a circle with radius: 5 using Vector Renderer
        rectangle.draw(); // Output: Drawing a rectangle with width: 10 and height: 20 using Raster Renderer
    }
}
