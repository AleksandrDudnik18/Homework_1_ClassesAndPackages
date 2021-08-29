package task_1_1;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Choose 0 for exit");
        System.out.println("Choose 1 for List<Integer>");
        System.out.println("Choose 2 for List<String>");

        List<Integer> listOfInteger = Stream.of(1, 3, 5, 8, 10, 15, 2, 5, 8, 27).collect(Collectors.toList());
        List<String> listOfString = Stream.of("a", "h", "x", "g", "p", "b", "t").collect(Collectors.toList());


        while (true) {
            int selectedValue = inputValue();

            switch (selectedValue) {
                case 0: {
                    System.out.println("exit");
                    break;
                }
                case 1: {
                    executeAction(listOfInteger);
                    break;
                }
                case 2: {
                    executeAction(listOfString);
                    break;
                }
                default: {
                    System.out.println("input wrong value");
                    break;
                }
            }

            if(selectedValue == 0) {
                break;
            }
        }


    }

    private static <T extends Comparable<T>> void executeAction(List<T> list) {
        printList(list);
        bubbleSort(list);
        printList(list);
    }


    private static <T> void printList(List<T> list) {
        list.forEach(el -> System.out.print(el + " "));
        System.out.println();
    }


    private static int inputValue() {

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        return 0;
    }

    private static <T extends Comparable<T>> void bubbleSort(List<T> list) {

        int lengthList = list.size();
        for (int i = 0; i < lengthList - 1; i++) {
            for (int j = 0; j < lengthList - i - 1; j++) {

                T temp = list.get(j);
                if (list.get(j + 1).compareTo(temp) < 0) {
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

}
