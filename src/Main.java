public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("candy bar", 1.2);
        Item item2 = new Item("wallet",2.4);
        Item item3 = new Item("bedroll",9.5);
        Item item4 = new Item("rope",5.6);
        Bag bag1 = new Bag("Belt pouch",0.5);
        bag1.add(item1);
        bag1.add(item2);
        System.out.println("Total weight: " + bag1.getWeight() + " lbs.");
        bag1.displayInfo();
        //item1.displayInfo();
        //item2.displayInfo();
    }
}
