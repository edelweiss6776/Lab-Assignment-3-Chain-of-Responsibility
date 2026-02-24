// Concrete collector for Recyclable Waste
public class RecyclableWasteCollector extends WasteCollector {
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Recyclable")) {
            System.out.println("Recyclable waste collected and sent to recycling center.");
            container.emptyContainer();
        } else {
            super.collectWaste(container);
        }
    }
}