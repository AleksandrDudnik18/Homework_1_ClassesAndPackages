package task_1_3;

public class Fahrenheit extends Temperature {

    public Fahrenheit(double valueOfTemperature) {
        super(valueOfTemperature);
    }

    @Override
    double calculateTemperature(double valueOfTemperature) {
        return round(valueOfTemperature + 32, 2);
    }

    @Override
    public String toString() {
        return "Fahrenheit{" +
                "valueOfTemperature=" + getValueOfTemperature() +
                '}';
    }
}
