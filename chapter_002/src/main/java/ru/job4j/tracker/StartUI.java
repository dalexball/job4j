package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("===Create a new Item ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("===Show all Items===");
                Item[] items;
                items = tracker.findAll();
                for (Item item : items) {
                    if (item != null) {
                        System.out.format("Item name: %1s, item id: %2s.%n", item.getName(), item.getId());
                    }
                }
            } else if (select == 2) {
                System.out.println("===Edit Item by ID===");
                System.out.println("Enter ID: ");
                String id = scanner.nextLine();
                Item item;
                item = tracker.findById(id);
                System.out.println("Enter new name: ");
                String name = scanner.nextLine();
                item.setName(name);
            } else if (select == 3) {
                System.out.println("===Edit Item by ID===");
                System.out.println("Enter ID: ");
                String id = scanner.nextLine();
                tracker.deleteById(id);
            } else if (select == 4) {
                System.out.println("===Find Item by ID===");
                System.out.println("Enter ID: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.format("Item name: %1s, item id: %2s.%n", item.getName(), item.getId());
                }
            } else if (select == 5) {
                System.out.println("===Find Items by name===");
                System.out.println("Enter name: ");
                String name = String.valueOf(scanner.nextLine());
                Item[] items;
                items = tracker.findByName(name);
                for (Item item : items) {
                    if (item != null) {
                        System.out.format("Item name: %1s, item id: %2s.%n", item.getName(), item.getId());
                    }
                }
            } else if (select == 6) {
                run = false;
            } else {
                System.out.println("Incorrect input, please type in correct number");
            }
        }
    }

    private void showMenu() {
        String[] menu = new String[]{
                "0. Add new item",
                "1. Show all items",
                "2. Edit item",
                "3. Delete item",
                "4. Find item by ID",
                "5. Find items by name",
                "6. Exit Program"
        };
        for (String menuItem : menu) {
            System.out.println(menuItem);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }


}
