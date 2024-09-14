import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        ArrayList<Double> temperatures = new ArrayList<>();

        // Input average temperatures
        for (String day : days) {
            System.out.println("Enter average temperature for " + day + ": ");
            temperatures.add(scanner.nextDouble());
        }

        while (true) {
            System.out.println("Enter a day of the week or 'week' for weekly average: ");
            String input = scanner.next();

            if (days.contains(input)) {
                // Display temperature for specific day
                int index = days.indexOf(input);
                System.out.println(input + ": " + temperatures.get(index));
            } else if (input.equals("week")) {
                // Display weekly data
                double sum = 0;
                for (int i = 0; i < 7; i++) {
                    System.out.println(days.get(i) + ": " + temperatures.get(i));
                    sum += temperatures.get(i);
                }
                System.out.println("Weekly average: " + sum / 7);
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}