import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListOperations {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add element at beginning");
            System.out.println("2. Add element at middle");
            System.out.println("3. Add element at end");
            System.out.println("4. Display all elements");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add at the beginning: ");
                    String elementToAddBeginning = scanner.nextLine();
                    list.addFirst(elementToAddBeginning);
                    System.out.println("Element added at the beginning.");
                    break;
                case 2:
                    System.out.print("Enter the element to add in the middle: ");
                    String elementToAddMiddle = scanner.nextLine();
                    int middleIndex = list.size() / 2;
                    list.add(middleIndex, elementToAddMiddle);
                    System.out.println("Element added in the middle.");
                    break;
                case 3:
                    System.out.print("Enter the element to add at the end: ");
                    String elementToAddEnd = scanner.nextLine();
                    list.addLast(elementToAddEnd);
                    System.out.println("Element added at the end.");
                    break;
                case 4:
                    System.out.println("Elements in the list: " + list);
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
