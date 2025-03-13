# Part 1: Gift-class

Create a `Gift` class, where the objects instantiated from it represent different kinds of gifts. The information that's recorded is the name and weight of the item (kg).

Add the following methods to the class:

- Constructor for which the name and weight of the gift are given as parameters

- Method `public String getName()`, which returns the name of the gift

- Method `public int getWeight()`, which returns the weight of the gift

- Method `public String toString()`, which returns a string in the form "name (weight kg)"

# Part 2: Package-class

Create a `Package` class to which gifts can be added, and that keeps track of the total weight of the gifts in the package. The class should contain:

- A parameterless constructor

- Method `public void addGift(Gift gift)`, which adds the gift passed as a parameter to the package. The method returns no value.

- Method `public int totalWeight()`, which returns the total weight of the package's gifts.

It's recommended to store the items in an `ArrayList` object.


