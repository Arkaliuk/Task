import java.awt.*;

public class Square extends Shape {
    private final int side;
    private ColorEnum color;

    public Square(ColorEnum color, int side) {
        this.color = color;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(side,side,side,side);
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public ColorEnum getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Фігурa: квадрат, площа: " + getArea() + " кв.од., довжина сторони: " + getSide() + " од., колір: " + getColor();
    }
}