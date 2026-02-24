// Concrete collector for Organic Waste
public class OrganicWasteCollector extends WasteCollector {
    public void collectWaste(WasteContainer container) {
        if (!container.isFull()) {
            System.out.println("Container is already empty: " + container.getType());
            return;
        }

        // Process only Organic Waste
        if (container.getType().equalsIgnoreCase("Organic")) {
            System.out.println("Organic waste collected and composted.");
            container.emptyContainer(); // Empty the container after collection
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        } else {
            System.out.println("No collector available for: " + container.getType());
        }
    }
}
