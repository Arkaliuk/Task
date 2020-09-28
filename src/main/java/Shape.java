import javax.swing.*;

public abstract class Shape extends JPanel {
    public abstract void draw();

    public abstract double getArea();

    public abstract ColorEnum getColor();


}
