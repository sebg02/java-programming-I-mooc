Let's redo the previous program for handling two liquid containers. This time we'll create a class "Container", which is responsible for managing the contents of a container.

# Part 1: Container
Make a class called `Container`. The class must have a constructor which does not take any parameters, and the following methods:

- `public int contains()` which returns the amount of liquid in a container as an integer.
- `public void add(int amount)` which adds the amount of liquid given as a parameter to the container. If the amount is negative, no liquid is added. A container can hold a maximum of 100 units of liquid.
- `public void remove(int amount)` which removes the amount of liquid given as a parameter from the container. If the amount is negative, no liquid is removed. A container can never hold less than 0 units of liquid.
- `public String toString()` which returns the container as a string formatted "amount of liquid/100, for example "32/100".

# Part 2: Functionality
Copy the user interface you implemented for the previous example, and modify it to use the new Container class. The main method in the class `LiquidContainers2` must start the program.
