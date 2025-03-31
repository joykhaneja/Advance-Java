import java.util.HashMap;
import java.util.Scanner;

public class HashMapOperations {
    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add key-value pair");
            System.out.println("2. Retrieve value by key");
            System.out.println("3. Remove entry by key");
            System.out.println("4. Display all entries");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter key (integer): ");
                    int key = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter value (string): ");
                    String value = scanner.nextLine();
                    map.put(key, value);
                    System.out.println("Key-value pair added.");
                    break;
                case 2:
                    System.out.print("Enter key to retrieve value: ");
                    int keyToRetrieve = scanner.nextInt();
                    if (map.containsKey(keyToRetrieve)) {
                        System.out.println("Value: " + map.get(keyToRetrieve));
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter key to remove entry: ");
                    int keyToRemove = scanner.nextInt();
                    if (map.remove(keyToRemove) != null) {
                        System.out.println("Entry removed.");
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;
                case 4:
                    System.out.println("Entries in the map: " + map);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}