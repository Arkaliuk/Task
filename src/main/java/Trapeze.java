import java.awt.*;

public class Trapeze extends Shape {
    private final int base1, base2, a, b, height;
    private ColorEnum color;

    public Trapeze(ColorEnum color, int base1, int base2, int a, int b, int height) {
        this.color = color;
        this.base1 = base1;
        this.base2 = base2;
        this.a = a;
        this.b = b;
        this.height = height;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(0,0,30,30);
        g.drawLine(30,30,100,30);
        g.drawLine(0,0,150,0);
        g.drawLine(100,30,150,0);

    }

    public int getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }

    @Override
    public ColorEnum getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Фігура: трапеція, площа: " +  getArea() +
                " кв.од., висота: " +  getHeight() + " од., колір: " + getColor();
    }
}