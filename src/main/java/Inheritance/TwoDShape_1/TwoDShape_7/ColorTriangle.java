package Inheritance.TwoDShape_1.TwoDShape_7;

// Расширение класаа Triangle
public class ColorTriangle extends Triangle {
    private String color;

    ColorTriangle(String c, String s, double w, double h) {
        super(s, w, h);

        color = c;
    }

    String getColor() {
        return color;
    }

    void showColor() {
        System.out.println("Цвет - " + color);
    }
}
