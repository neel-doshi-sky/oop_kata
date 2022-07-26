package uk.sky.kata.fundamentals.abstraction.abstractClass;

public class RightAngledTriangle extends Shape{

    private int height;
    private int base;

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
