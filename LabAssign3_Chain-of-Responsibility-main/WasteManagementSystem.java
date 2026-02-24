public class WasteManagementSystem {
    public static void main(String[] args) {
        // Create collectors and chain them
        System.out.println();
        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();
        
        organicCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);
        
        // Create waste containers
        WasteContainer organicBin = new WasteContainer("Organic", 50);
        WasteContainer recyclableBin = new WasteContainer("Recyclable", 30);
        WasteContainer hazardousBin = new WasteContainer("Hazardous", 20);
        
        // Process waste collection
        organicCollector.collectWaste(organicBin);
        organicCollector.collectWaste(recyclableBin);
        organicCollector.collectWaste(hazardousBin);
        recyclableCollector.collectWaste(organicBin); // Will indicate the bin is empty
        System.out.println();
    }
}