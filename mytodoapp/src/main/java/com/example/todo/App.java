package com.example.todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static List<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- To-Do App ---");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.print("Enter task: ");
                    tasks.add(scanner.nextLine());
                    System.out.println("Task added!");
                    break;
                case "2":
                    System.out.println("\nTasks:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case "3":
                    System.out.print("Enter task number to remove: ");
                    try {
                        int num = Integer.parseInt(scanner.nextLine());
                        if (num > 0 && num <= tasks.size()) {
                            tasks.remove(num - 1);
                            System.out.println("Task removed!");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

