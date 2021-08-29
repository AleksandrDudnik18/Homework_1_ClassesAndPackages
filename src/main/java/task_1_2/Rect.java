package task_1_2;

public class Rect extends Square {

    private double length;


    public Rect(double height, double length) {
        super(height);
        this.length = length;
    }

    @Override
    public double calculatePerimeter() {
        return round(2 * (getHeight() + length), 2);
    }

    @Override
    public double calculateSquare() {
        return round(getHeight() * length, 2);
    }

    @Override
    public String toString() {
        return "Rect{" +
                "height=" + getHeight() +
                ", length=" + length +
                '}';
    }
}
