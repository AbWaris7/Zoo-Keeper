import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Map<Integer, String> habitats = AnimalData.getHabitats();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Please enter the number of the habitat you would like to view:");
                String input = scanner.nextLine();

                if ("exit".equalsIgnoreCase(input)) {
                    System.out.println("See you later!");
                    break;
                }

                try {
                    int habitatNumber = Integer.parseInt(input);

                    if (habitats.containsKey(habitatNumber)) {
                        System.out.println(habitats.get(habitatNumber));
                        System.out.println("---");
                    } else {
                        System.out.println("Invalid habitat number. Please try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number or 'exit'.");
                }
            }
        }
    }
}
