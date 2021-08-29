package task_1_3;

public class Kelvin extends Temperature {

    public Kelvin(double valueOfTemperature) {
        super(valueOfTemperature);
    }

    @Override
    double calculateTemperature(double valueOfTemperature) {
        return round(valueOfTemperature + 273.15, 2);
    }

    @Override
    public String toString() {
        return "Kelvin{" +
                "valueOfTemperature=" + getValueOfTemperature() +
                '}';
    }
}
