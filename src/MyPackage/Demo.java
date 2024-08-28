package MyPackage;
import java.util.Scanner;
public class Demo {
	 // Linear Search
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1; // Key not found
    }

    // Binary Search
    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == key) {
                return mid; // Key found
            }

            if (array[mid] < key) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }

        return -1; // Key not found
    }

    // Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, then break
            if (!swapped) {
                break; 
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Convert command-line arguments to an integer array
        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        while (true) {
            // Display menu options
            System.out.println("Menu:");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Bubble Sort");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the key to search (Linear Search): ");
                    int linearKey = scanner.nextInt();
                    int linearResult = linearSearch(array, linearKey);
                    if (linearResult != -1) {
                        System.out.println("Key found at index " + linearResult);
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;

                case 2:
                    bubbleSort(array); // Binary search requires a sorted array
                    System.out.print("Enter the key to search (Binary Search): ");
                    int binaryKey = scanner.nextInt();
                    int binaryResult = binarySearch(array, binaryKey);
                    if (binaryResult != -1) {
                        System.out.println("Key found at index " + binaryResult);
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;

                case 3:
                    bubbleSort(array);
                    System.out.println("Array sorted using Bubble Sort:");
                    for (int num : array) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
