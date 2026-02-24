// Concrete collector for Hazardous Waste
public class HazardousWasteCollector extends WasteCollector {
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Hazardous")) {
            System.out.println("Hazardous waste collected and safely disposed of.");
            container.emptyContainer();
        } else {
            super.collectWaste(container);
        }
    }
}