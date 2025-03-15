/**
 * @author SEB
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();
        UserInterface userI = new UserInterface(todoList, scanner);
        userI.start();

        scanner.close();
    }
}
