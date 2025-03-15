/**
 * @author SEB
 */

import java.util.Scanner;

public class UserInterface {
    private TodoList todolist;
    private Scanner scanner;

    public UserInterface(TodoList todolist, Scanner scanner) {
        this.todolist = todolist;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                this.todolist.add(task);
            } else if (command.equals("list")) {
                this.todolist.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int id = Integer.valueOf(scanner.nextLine());
                this.todolist.remove(id);
            } 
        }
    }
    
}
