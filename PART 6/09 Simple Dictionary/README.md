The exercise base contains a class `SimpleDictionary` that allows for storing words and their translations. The internal implementation of the class contains some techniques not (yet) covered on the course.


# Part 1: Starting and stopping the UI
Implement the class `TextUI` that receives as constructor parameters a `Scanner` and `SimpleDictionary` objects. Then give the class a method called public void start(). The method should work as follows:

- The method asks the user for a command
- If the command is `end`, the UI prints the string "Bye bye!" and the execution of the start method ends.
- Otherwise the text UI prints the message `Unknown command` and asks for a new command, so it loops back to step 1.


# Part 2: Adding a translation
Modify the method `public void start()` so that it works in the following way:

- If the command is `add`, the text UI asks the user for a word and a translation, each on its own line. After this the words are stored in the dictionary, and the method continues by asking for a new command (loops back to stage 1).


# Part 3: Translating a word
Modify the method `public void start()` so that it works in the following:

- If the command is `search`, the text UI asks the user for the word to be translated. After this it prints the translation of the word, and the method continues by asking for a new command (loops back to stage 1).


# Part 4: Cleaning up the translation
Modify the searching functionality of the UI so that if the word isn't found (i.e. the dictionary returns `null`), the UI prints the message `Word (searched word) was not found`.