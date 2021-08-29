package task_1_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("input value of celsius temperature to convert in fahrenheit: ");
        Temperature fahrenheit = new Fahrenheit(inputValue());

        System.out.print("input value of celsius temperature to convert in kelvin: ");
        Temperature kelvin = new Kelvin(inputValue());

        System.out.println();

        List<Temperature> list = Arrays.asList(fahrenheit, kelvin);
        list.forEach(System.out::println);


    }

    private static double inputValue() {

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        }
        return 0;
    }
}
