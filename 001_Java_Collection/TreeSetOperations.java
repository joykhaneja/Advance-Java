import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetOperations {
    public static void main(String[] args) {
        
        TreeSet<String> set = new TreeSet<>();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add element");
            System.out.println("2. Display all elements (sorted order)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    String elementToAdd = scanner.nextLine();
                    if (set.add(elementToAdd)) {
                        System.out.println("Element added.");
                    } else {
                        System.out.println("Duplicate element ignored.");
                    }
                    break;
                case 2:
                    System.out.println("Elements in sorted order: " + set);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
