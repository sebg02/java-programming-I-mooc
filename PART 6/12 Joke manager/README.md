The exercise base contains the program that has been written "in the main", the goal is to reorganize it into new classes.

# Part 1: Joke manager
Create a class called `JokeManager` and move the functionality to manage jokes in it. The class must have a parameter-free constructor, and the following methods:

- `public void addJoke(String joke)` - adds a joke to the manager.
- `public String drawJoke()` - chooses one joke at random and returns it. It there are no jokes stored in the joke manager, the method should return the string "Jokes are in short supply.".
- `public void printJokes()` - prints all the jokes stored in the joke manager.


# Part 2: User interface
Create a class called `UserInterface` and move the UI functionality of the program there. The class must have a constructor with two parameters. The first parameter is an instance of the `JokeManager` class, and the second parameter is an instance of the `Scanner` class. In addition, the class should have the method `public void start()` that can be used to start the user interface.

The user interface should provide the user with the following commands:

- `X` - ending: exits the method `start`.
- `1` - adding: asks the user for the joke to be added to the joke manager, and then adds it.
- `2` - drawing: chooses a random joke from the joke manager and prints it. If there are no jokes in the manager, thi string "Jokes are in short supply." will be printed.
- `3` - printing: prints all the jokes stored in the joke manager.
