import java.util.Scanner;
public class Arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initial size of the array
        int initialSize = 5;
        int[] numbers = new int[initialSize];
        int count = 0;

        System.out.println("Enter " + initialSize + " numbers:");

        for (int i = 0; i < initialSize; i++) {
            int number = scanner.nextInt();
            numbers[i] = number;
            count++;
        }
        System.out.println("Enter additional numbers or type -1 to stop:");
        int addNumber;
        while ((addNumber = scanner.nextInt()) != -1) {
            if (count == numbers.length) {
                // Resize the array
                int[] resizedArray = new int[numbers.length * 2];
                System.arraycopy(numbers, 0, resizedArray, 0, numbers.length);
                numbers = resizedArray;
            }
            numbers[count] = addNumber;
            count++;
        }
        System.out.println("Here are the numbers you've entered:");
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }
    }
}