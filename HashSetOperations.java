import java.util.HashSet;
import java.util.Scanner;

public class HashSetOperations {
    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add element");
            System.out.println("2. Display all elements");
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
                    System.out.println("Elements in the set: " + set);
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