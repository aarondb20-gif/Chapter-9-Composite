public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("candy bar", 1.2);
        Item item2 = new Item("wallet",2.4);
        Item item3 = new Item("bedroll",9.5);
        Item item4 = new Item("rope",5.6);
        Bag bag1 = new Bag("Main Backpack: ",0.5);
        Bag bag2 = new Bag("Small Pouch: ",0.5);
        Bag bag3 = new Bag("Medium Bag: ",0.5);

        bag1.add(item3);
        bag1.add(item4);
        bag2.add(item1);
        bag3.add(item2);
        bag1.add(bag3);
        bag3.add(bag2);
        try {
            item1.add(item2);
        }catch (UnsupportedOperationException e){
            System.out.println("Exception: Method not supported by this class. " + e.getMessage());
        }
        System.out.println("Total weight: " + bag1.getWeight() + " lbs.");
        bag1.displayInfo();
        //item1.displayInfo();
        //item2.displayInfo();
    }
}
