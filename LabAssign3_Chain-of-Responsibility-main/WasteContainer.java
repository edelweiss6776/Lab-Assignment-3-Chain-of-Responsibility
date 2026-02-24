public class WasteContainer {
    private String type;
    private int capacity;
    private boolean isFull;
    
    public WasteContainer(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.isFull = true;
    }
    
    public String getType() {
        return type;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public boolean isFull() {
        return isFull;
    }
    
    public void emptyContainer() {
        this.isFull = false;
        System.out.println(this.type + " waste container is now empty.");
    }
}