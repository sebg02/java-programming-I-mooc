# Part: 1 Room
Create `Room` class. The class should contain a list of persons as an instance variable, and it should have a parameterless constructor. In addition, add the following methods to the class:

- `public void add(Person person)` - add the person passed as a paramter to the list.

- `public boolean isEmpty()` - returns a boolean-type value true or false, that tells whether the room is empty or not.

- `public ArrayList<Person> getPersons()` - returns a list of the persons in the room.

# Part 2 - Shortest Person
Add a `public Person shortest()` method to the `Room` class, which returns the shortest person added to the room. If the room is empty, a `null` reference is returned. The method should not remove a person from the room.

# Part 3 - Taking from a room
Add a `public Person take()` method to the Room class, which takes the shortest person in the room. When a room is empty, it returns a `null` reference.