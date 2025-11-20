package org.example.models;

import java.util.*;

public class Grocery {

    public static ArrayList<String> groceryList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void startGrocery() {

        boolean running = true;

        while (running) {
            System.out.println("\nChoose an action:");
            System.out.println("0 - Quit");
            System.out.println("1 - Add items");
            System.out.println("2 - Remove items");
            System.out.print("Your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 0:
                    running = false;
                    break;

                case 1:
                    System.out.print("Enter items to add (comma separated): ");
                    String addInput = scanner.nextLine();
                    addItems(addInput);
                    break;

                case 2:
                    System.out.print("Enter items to remove (comma separated): ");
                    String removeInput = scanner.nextLine();
                    removeItems(removeInput);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            printSorted();
        }
    }

    // ----------------------------------------------------

    public static void addItems(String input) {
        String[] items = input.split(",");

        for (String item : items) {
            String trimmed = item.trim().toLowerCase();

            if (!checkItemIsInList(trimmed)) {
                groceryList.add(trimmed);
            } else {
                System.out.println(trimmed + " already exists.");
            }
        }

        Collections.sort(groceryList);
    }

    public static void removeItems(String input) {
        String[] items = input.split(",");

        for (String item : items) {
            String trimmed = item.trim().toLowerCase();

            if (checkItemIsInList(trimmed)) {
                groceryList.remove(trimmed);
            } else {
                System.out.println(trimmed + " is not in the list.");
            }
        }

        Collections.sort(groceryList);
    }

    public static boolean checkItemIsInList(String product) {
        return groceryList.contains(product);
    }

    public static void printSorted() {
        Collections.sort(groceryList);
        System.out.println("Current grocery list: " + groceryList);
    }
}
