# Journal
Phase 1
In this phase I  set up an abstract class Component that all the inventory subclasses will use, and an Item leaf
class that will be used to create items to be placed in the inventory. The Component uses UnsupportedOperationException,
because subclasses will use some of the methods but not all of them. So, instead of forcing every subclass to implement
every method it can give a warning to the client at runtime if they try to use an unsupported method.
