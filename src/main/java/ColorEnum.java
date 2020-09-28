import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum ColorEnum {
    RED("червоний"),
    ORANGE("оранжевий"),
    YELLOW("жовтий"),
    GREEN("зелений"),
    BLUE("голубий"),
    INDIGO("синій"),
    VIOLET("фіолетовий");

    private final String colorName;

    ColorEnum(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public String toString() {
        return this.colorName;
    }

    private static final List<ColorEnum> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();

    public static ColorEnum randomColor() {
        return VALUES.get(Start.rand.nextInt(SIZE));
    }
}
