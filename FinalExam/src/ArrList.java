import java.util.ArrayList;
import java.util.Scanner;
public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // Initial size of the array
        int initialSize = 5;
        System.out.println("Enter " + initialSize + " numbers:");
        for (int i = 0; i < initialSize; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
        System.out.println("Enter additional numbers or type -1 to stop):");
        int addNumber;
        while ((addNumber = scanner.nextInt()) != -1) {
            numbers.add(addNumber);
        }
        System.out.println("Here are the numbers that you've entered:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}