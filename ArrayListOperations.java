import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations{
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. Update element");
            System.out.println("4. Retrieve element");
            System.out.println("5. Display all elements");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    String elementToAdd = scanner.nextLine();
                    list.add(elementToAdd);
                    System.out.println("Element added.");
                    break;
                case 2:
                    System.out.print("Enter the index of the element to remove: ");
                    int indexToRemove = scanner.nextInt();
                    if (indexToRemove >= 0 && indexToRemove < list.size()) {
                        list.remove(indexToRemove);
                        System.out.println("Element removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the index of the element to update: ");
                    int indexToUpdate = scanner.nextInt();
                    scanner.nextLine(); 
                    if (indexToUpdate >= 0 && indexToUpdate < list.size()) {
                        System.out.print("Enter the new value: ");
                        String newValue = scanner.nextLine();
                        list.set(indexToUpdate, newValue);
                        System.out.println("Element updated.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the index of the element to retrieve: ");
                    int indexToRetrieve = scanner.nextInt();
                    if (indexToRetrieve >= 0 && indexToRetrieve < list.size()) {
                        System.out.println("Element at index " + indexToRetrieve + ": " + list.get(indexToRetrieve));
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 5:
                    System.out.println("Elements in the list: " + list);
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
