public class Runner {
    public static void main(String[] args) {
        Laptop mainLaptop = new Laptop();
        Laptop flexLaptop = new Laptop("Dell", 14.0, 16, true);
        Laptop herLaptop = new Laptop("Acer", 13.3);

        mainLaptop.displayInfo();
        flexLaptop.turnOn();
        herLaptop.displayInfo();
    }
}
