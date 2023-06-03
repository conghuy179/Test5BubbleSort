import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    private Scanner sc;
    private int selection;

    public Driver(Scanner sc) {
        this.sc = sc.useDelimiter("\n");
    }

    public void run() {
        do {
            System.out.println("PHAN CONG HUY - FX16513");
            System.out.println("Enter the number of elements in array (1 to 10): ");
            selection = sc.nextInt();
            if (!isValid(selection)) {
                System.out.println("Only type number from 1 to 10. Try again.");
            }
        } while (!isValid(selection));
        int[] arr = new int[selection];
        System.out.println("Type " + selection + " number in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Unsorted array: " + Arrays.toString(arr));
        System.out.println("Bubble Sort: ");
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }

    public boolean isValid(int selection) {
        for (int i = 1; i < 11; i++) {
            if (selection == i) {
                return true;
            }
        }
        return false;
    }

    public void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j + 1] < arr[j]) {

                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;

                }
            }
        }
    }
}
