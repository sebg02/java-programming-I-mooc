The exercise base includes the constructed program to store grades. In this exercise you will further develop the class GradeRegister so that it can calculate the average of grades and exam results.

# Part 1: Average grade
Create the method `public double averageOfGrades()` for the class `GradeRegister`. It should return the average of the grades. If the register contains no grades, the method should return `-1`. Use the `grades` list to calculate the average.


# Part 2: Average points
Give the class `GradeRegister` a new object variable: a list where you will store the exam points every time that the method `addGradeBasedOnPoints` is called. After this addition, create a method `public double averageOfPoints()` that calculates and returns the average of the exam points. If there are no points added to the register, the method should return the number `-1`.


# Part 3: Prints in the user interface
As a final step, add the methods implemented above as parts of the user interface. When the program prints the grade distribution, it should also print the averages of the points and the grades.