package task_1_2;

public class Square implements Shape{

    private double height;

    public Square(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return round(height * 4, 2);
    }

    @Override
    public double calculateSquare() {
        return round(Math.pow(height, 2), 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                '}';
    }
}
