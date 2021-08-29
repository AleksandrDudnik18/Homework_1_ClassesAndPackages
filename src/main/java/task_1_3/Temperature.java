package task_1_3;

import java.math.BigDecimal;
import java.math.RoundingMode;

abstract public class Temperature {

    private double valueOfTemperature;

    public Temperature(double valueOfTemperature) {
        this.valueOfTemperature = calculateTemperature(valueOfTemperature);
    }

    public double getValueOfTemperature() {
        return valueOfTemperature;
    }

    public void setValueOfTemperature(double valueOfTemperature) {
        this.valueOfTemperature = valueOfTemperature;
    }

    public double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    abstract double calculateTemperature(double valueOfTemperature);

}
