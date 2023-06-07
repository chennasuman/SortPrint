import java.util.*;
/*
 * This class is used to read input from user console,processes the data and prints the output
 */

public class SortAndPrintData {
    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 100;
    public static final int COUNT = 10;

    public static void main(String[] args) {
        List<Integer> inputData = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        ReadAndProcessInput(scanner, inputData);
        SortAndDisplayOutput(inputData);
    }

    /*
     * Reads input from the console check if it's within the defined range and adds to a list
     */
    private static void ReadAndProcessInput(Scanner scanner, List<Integer> inputData) {
        System.out.println("Please enter "+ COUNT + " numbers between " +  MIN_VALUE +"-" + MAX_VALUE);
        while (inputData.size() < COUNT) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (number < MIN_VALUE || number > MAX_VALUE) {
                    System.out.println("Number should be between " + MIN_VALUE +"-" + MAX_VALUE + " Please try again.");
                } else {
                    inputData.add(number);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    /*
     * Removes duplicated from the input data and sorts in descending order
     * Prints the sorted data
     */
    private static void SortAndDisplayOutput(List<Integer> inputData) {
        // Move the input numbers to a set which will remove duplicates
        Set<Integer> filteredData= new HashSet<>(inputData);
        List<Integer> sortedData = new ArrayList<>(filteredData);

        // Sort the numbers in descending order
        Collections.sort(sortedData, Collections.reverseOrder());

        System.out.println("Sorted numbers in descending order");
        for (int outputData : sortedData) {
            System.out.println(outputData);
        }
    }

}
