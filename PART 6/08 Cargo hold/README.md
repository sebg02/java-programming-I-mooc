# Part 1: Item-class
Create an `Item` class from which objects can be instantiated to represent different items. The information to store is the name and weight of the item (kg).

Add the following methods to the class:

- Constructor that takes the name and the weight of the item as parameters

- Method `public String getName()`, which returns the item's name

- Method `public int getWeight()`, which returns the item's weight

- Method `public String toString()`, which returns the string "name (weight kg)"


# Part 2: Suitcase-class
Create a `Suitcase` class. The suitcase has items and a maximum weight that determines the maximum total weight of the items.

Add the following methods to the class:

- Constructor, to which the maximum weight is provided

- The method` public void addItem(Item item)`, which adds the item passed as a parameter to the suitcase. The method does not return a value.

- The method` public String toString()`, which returns the string "x items (y kg)"


# Part 3: Language Formatting
The statement "1 items" is not exactly proper English — a better form would be "1 item". The lack of items could also be expressed as "no items". Implement this change to the `toString` method of the `Suitcase` class.


# Part 4: All items 
Add the following methods to the `Suitcase` class:

- a `printItems` method, which prints all the items in the suitcase

- a `totalWeight` method, which returns the total weight of the items

# Part 5: Heaviest item
Add to the `Suitcase` class a `heaviestItem` method, which returns the largest item based on weight. If several items share the heaviest weight, the method can return any one of them. The method should return an object reference. If the suitcase is empty, return the value `null`.


# Part 6: Hold-class
Make a `Hold` class with the following methods:

- a constructor, to which the maximum weight is given

- method `public void addSuitcase(Suitcase suitcase)` that adds the specified luggage to the hold

- method `public String toString()` that returns the string "x suitcases (y kg)"

Store your suitcases in a suitable `ArrayList` structure.

The class `Hold` has to ensure that the total weight of the suitcases it contains does not exceed the maximum weight. Should the maximum weight be exceeded due to the addition of new luggage, the `addSuitcase` method should not add the new suitcase.

# Part 7: The Hold's Contents
Add to the `Hold` class the method `public void printItems()` that prints all the items contained in the hold's suitcases.

