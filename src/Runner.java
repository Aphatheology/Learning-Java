public class Runner {
    public static void main(String[] args) {
        // Create three Laptop objects
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop("Dell", 14.0, 16, true);
        Laptop laptop3 = new Laptop("Acer", 13.3);

        laptop1.displayInfo();
        laptop2.turnOn();
        laptop3.displayInfo();
    }
}
