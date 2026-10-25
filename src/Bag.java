import java.util.ArrayList;

public class Bag extends InventoryComponent{
    ArrayList<InventoryComponent> items = new ArrayList<>();
    private String name;
    private double baseWeight;

    public Bag(String name, double baseWeight){
        this.name = name;
        this.baseWeight = baseWeight;

    }

    public void add(InventoryComponent inventoryComponent){
        items.add(inventoryComponent);
    }
    public void remove(InventoryComponent inventoryComponent){
        items.remove(inventoryComponent);
    }
    public InventoryComponent getChild(int i){
        return items.get(i);
    }
    public String getName(){
        return name;
    }
    public double getWeight(){
        double totalWeight = this.baseWeight;
        if(items != null){
            for (InventoryComponent component : items) {
                totalWeight += component.getWeight();
            }
        }
        return totalWeight;
    }
    public void displayInfo(){
        System.out.println(name + " Base Weight: " + baseWeight + " lbs.");
        for(InventoryComponent component : items){
            component.displayInfo();
        }
    }


}
