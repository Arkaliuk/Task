import java.awt.*;

public class Triangle extends Shape {
    private final int side1, side2, side3;
    private ColorEnum color;

    public Triangle(ColorEnum color, int side1, int side2, int side3) {
        this.color = color;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(10, 0, 10,20 );
        g.drawLine(10,0,20,0);
        g.drawLine(10,20,20,0);
    }

    public double getHypotenuse() {
        double hypotenuse = 0;
        double[] arr = {side1, side2, side3};

        for (double i : arr) {
            if (hypotenuse < i) hypotenuse = i;
        }
        return hypotenuse;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        double s = Math.sqrt((p * (p - side1) * (p - side2) * (p - side3)));
        return s;
    }

    @Override
    public ColorEnum getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Фігура: трикутник, площа: " +  getArea() + " кв.од., гіпотенуза: " + getHypotenuse() + " од., колір: " + getColor();
    }
}
