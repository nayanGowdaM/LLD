package DesignPatterns.Structural.Bridge;

public class Circle extends  Shape{
    private  float radius;
    public Circle(Renderer renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(this.radius);
    }
}
