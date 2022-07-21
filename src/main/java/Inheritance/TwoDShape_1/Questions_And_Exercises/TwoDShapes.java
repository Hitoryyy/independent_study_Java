package Inheritance.TwoDShape_1.Questions_And_Exercises;

abstract class TwoDShapes {
    private double width;
    private double height;
    String name;

    TwoDShapes() {
        width = height = 0.0;
        name = "none";
    }

    TwoDShapes(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShapes(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShapes(TwoDShapes ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    String getName() {
        return name;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height =h;
    }

    abstract double area();
}
