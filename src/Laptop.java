public class Laptop {
    private String brand;
    private double screenSize;
    private int ramSizeInGB;
    private boolean isSSD;

    public Laptop() {
        this.brand = "HP";
        this.screenSize = 15.6;
        this.ramSizeInGB = 4;
        this.isSSD = false;
    }

    public Laptop(String brand, double screenSize, int ramSizeInGB, boolean isSSD) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.ramSizeInGB = ramSizeInGB;
        this.isSSD = isSSD;
    }

    public Laptop(String brand, double screenSize) {
        this(brand, screenSize, 8, true);
    }

    public void turnOn() {
        System.out.println("Laptop is turning on...");
    }

    public void displayInfo() {
        System.out.println("Laptop Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("RAM Size: " + ramSizeInGB + " GB");
        System.out.println("SSD: " + (isSSD ? "Yes" : "No"));
    }
}
