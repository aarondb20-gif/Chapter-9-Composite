# Journal
Phase 1
In this phase I  set up an abstract class Component that all the inventory subclasses will use, and an Item leaf
class that will be used to create items to be placed in the inventory. The Component uses UnsupportedOperationException,
because subclasses will use some of the methods but not all of them. So, instead of forcing every subclass to implement
every method it can give a warning to the client at runtime if they try to use an unsupported method.

Phase 2
I created a Bag class that can hold an arraylist of items, add the total weight of the items plus base weight of the bag,
and display bag information listing all items in the bag. Since Bag and Item share the same Component abstract class,
polymorphism allows it to treat every bag and item as if it is another variation of the same object.

Phase 3
I created new bag objects, added items to bags, and put bags inside of root bag to illustrate recursion. Also,
implemented try-catch test on an unsupported method to display a proper error message. If I needed to make a weightless
bag I would only need to modify the Bag class and set the base weight to 0.0. I wouldn't need to modify the the Component
or Item classes. The Composite pattern supports the open/closed principle by allowing Item and Bag to override the 
getWeight method, and allow each component to have it's own base weight without needing to modify other classes.

Phase 4
The AI tutor found that it could accept negative or invalid weight, so I did implement a if statement to check if the 
weight is a finite number. Other edge cases are adding bag1 to bag1 to create infinite recursion, and adding the same 
item to different bags. Putting the same bag inside itself usually wouldn't happen, but I could make an Exception error
message for it. Putting the same item inside two different bags could make sense if user has more than one instance of 
the same item.
