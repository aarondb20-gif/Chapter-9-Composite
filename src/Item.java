public class Item extends InventoryComponent{
    private String name;
    private double weight;

    public Item(String name, double weight){
        this.name = name;

        if (!Double.isFinite(weight) || weight < 0) {
            throw new IllegalArgumentException(
                    "Weight must be finite and non-negative."
            );
        }
        this.weight = weight;
    }

    @Override
    public String getName(){
        return name;
    }
    @Override
    public double getWeight(){
        return weight;

    }
    @Override
    public void displayInfo(){
        System.out.println("Item Name: " + name + " Weight: " + weight + " lbs.");


    }
}
