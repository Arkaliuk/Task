import java.awt.*;

public class Circle extends Shape {
    private double radius;
    private ColorEnum color;

    public Circle(ColorEnum color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(30, 40, 20, 20);

    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public ColorEnum getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Фігура: коло, площа: " +  getArea() + " кв.од., радіус: " +  getRadius() + " од., колір: " + getColor();
    }
}