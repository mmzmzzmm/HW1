import java.util.Arrays;
import java.util.Scanner;

public class CombineStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first list (format: a,b,c): ");
        String[] list1 = scanner.nextLine().split(",");

        System.out.print("Enter second list (format: 1,2,3): ");
        String[] list2 = scanner.nextLine().split(",");

        if (list1.length != list2.length) {
            System.out.println("Error: Lists must be of equal length.");
        } else {
            System.out.println("Combined list: " + Arrays.toString(combineLists(list1, list2)));
        }

        scanner.close();
    }

    public static String[] combineLists(String[] list1, String[] list2) {
        String[] result = new String[list1.length * 2];
        for (int i = 0; i < list1.length; i++) {
            result[i * 2] = list1[i];
            result[i * 2 + 1] = list2[i];
        }
        return result;
    }
}
