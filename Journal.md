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
