In this exercise we are going to create a program that can be used to create and modify a to-do list.

# Part 1:  TodoList
Create a class called `TodoList`. It should have a constructor without parameters and the following methods:

- `public void add(String task)` - add the task passed as a parameter to the todo list.
- `public void print()` - prints the exercises. Each task has a number associated with it on the print statement — use the task's index here (+1).
- `public void remove(int number)` - removes the task associated with the given number; the number is the one seen associated with the task in the print.


# Part 2: User interface
Next, implement a class called `UserInterface`. It should have a constructor with two parameters. The first parameter is an instance of the class `TodoList`, and the second is an instance of the class `Scanner`. In addition to the constructor, the class should have the method `public void start()` that is used to start the text user interface. The text UI works with an eternal looping statement (`while-true`), and it must offer the following commands to the user:

- The command `stop` stops the execution of the loop, after which the execution of the program advances out of the start method.

- The command `add` asks the user for the next task to be added. Once the user enters this task, it should be added to the to-do list.

- The commmand `list` prints all the tasks on the to-do list.

- The command `remove` asks the user to enter the id of the task to be removed. When this has been entered, the specified task should be removed from the list of tasks.